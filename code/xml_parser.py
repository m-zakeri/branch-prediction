import xml.etree.ElementTree as ET
import pandas as pd
import subprocess


def get_qualified_name(project):
    """
    Returns the qualified suffix name for the project
    :param project: the project
    :return: the qualified name
    """
    d = {'cassandra': 'org.apache.cassandra',
         'dagger': 'dagger',
         'guava': 'com.google.common',
         'ivy': 'org.apache.ivy',
         'lang': 'org.apache.commons.lang',
         'math': 'org.apache.commons.math',
         'time': 'org.joda.time'}
    return d[project]


def parse_xml(path='metrics/jdepend/dagger.xml', project='dagger'):
    """
    Parses the xml resulting from the jdepend xml output and output the result as a frame;
    deletes also the intermediate xml
    :param path: the path for the xml file
    :param project: the project under analysis
    :return: a pandas DataFrame
    """

    tree = ET.parse(path)
    root = tree.getroot()
    packages = root.find('Packages')

    # columns of the final dataframe
    project_list = []
    Ca_list = []
    Ce_list = []
    A_list = []
    I_list = []
    D_list = []
    V_list = []
    class_list = []

    for package in packages:

        if package.attrib['name'] and package.attrib['name'].startswith(get_qualified_name(project)):
            classes = [x.text.strip() for x in package.iter('Class')]
            l = len(classes)
            project_list.extend([project] * l)
            class_list.extend(classes)

            Ca_list.extend([float(next(package.iter('Ca')).text)] * l)
            Ce_list.extend([float(next(package.iter('Ce')).text)] * l)
            A_list.extend([float(next(package.iter('A')).text)] * l)
            I_list.extend([float(next(package.iter('I')).text)] * l)
            D_list.extend([float(next(package.iter('D')).text)] * l)
            V_list.extend([float(next(package.iter('V')).text)] * l)
    output = pd.DataFrame({'project': project_list,
                           'class': class_list,
                           'Ca': Ca_list,
                           'Ce': Ce_list,
                           'A': A_list,
                           'I': I_list,
                           'D': D_list,
                           'V': V_list})
    output.to_csv('metrics/jdepend/{}.csv'.format(project), index=False)
    command = 'rm -rf metrics/jdepend/{}.xml'.format(project)
    delete = subprocess.run(command.split(), stderr=subprocess.PIPE)
    if delete.returncode != 0:
        print('error')


if __name__ == '__main__':
    parse_xml()
