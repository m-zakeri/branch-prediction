__author__ = "Giovanni Grano"
__email__ = "grano@ifi.uzh.ch"
__license__ = "MIT"

from typing import Dict

import constants
import os
import settings as st
from xml_parser import *


def generate_all_metrics():
    """Runs the generation of all the metrics"""
    generate_ck_metrics()
    generate_halstead_metrics()
    generate_jdepend_metrics()
    generate_keyword_count()


def generate_ck_metrics(out_dir='metrics/ck'):
    """
    Runs the CK tools and generates the correspondent frames
    :param out_dir: the output directory for the resulting csv
    """
    for project in constants.projects:
        print("* Extracting ck metrics for {}".format(project))
        source_dir = os.path.join('projects/{}/sources'.format(project))
        print(source_dir)
        command = 'java -jar lib/ck.jar {} {}/{}.csv'.format(source_dir, out_dir, project)
        subprocess.call(command.split())
    files = os.listdir(out_dir)
    to_concat = [pd.read_csv(os.path.join(out_dir, x)) for x in files if x.endswith('csv')]
    result = pd.concat(to_concat)
    result.to_csv('metrics/ck.csv', index=False)


def generate_halstead_metrics(out_dir='metrics/halstead'):
    """
    Runs the HALSTEAD metric tool and generates the correspondent frames
    :param out_dir: the output directory for the resulting csv
    """
    for project in constants.projects:
        print("* Extracting ck metrics for {}".format(project))
        source_dir = os.path.join('projects/{}'.format(project))
        print(source_dir)
        command = 'java -jar lib/halstead.jar {} {}'.format(source_dir, out_dir, project)
        subprocess.call(command.split())
        subprocess.call('mv {}/halstead.csv {}/{}.csv'.format(out_dir, out_dir, project).split())
    files = os.listdir(out_dir)
    to_concat = [pd.read_csv(os.path.join(out_dir, x)) for x in files if x.endswith('csv')]
    result = pd.concat(to_concat)
    result.to_csv('metrics/halstead.csv', index=False)


def generate_jdepend_metrics(out_dir='metrics/jdepend'):
    """
    Generates the jdepend metrics
    :param out_dir: the output directory
    :return: saves a pandas frame
    """
    for project in constants.projects:
        classes_dir = os.path.join('projects/{}/classes'.format(project))
        command = 'java -cp {}/jdepend.jar ' \
                  'jdepend.xmlui.JDepend ' \
                  '-file {}/{}.xml ' \
                  '{}'.format(st.LIB, out_dir, project, classes_dir)
        result = subprocess.run(command.split(), stderr=subprocess.PIPE)
        if result.returncode != 0:
            print(result.stderr)
        xml_path = os.path.join(out_dir, project+'.xml')
        parse_xml(xml_path, project)
    files = os.listdir(out_dir)
    to_concat = [pd.read_csv(os.path.join(out_dir, x)) for x in files if x.endswith('csv')]
    result = pd.concat(to_concat)
    result.to_csv('metrics/jdepend.csv', index=False)


def generate_keyword_count(ck_frame='metrics/ck.csv'):
    """
    Generates the keywords features metrics
    :param ck_frame: the frame metrics (we take the classes from here)
    :return: it saves a pandas frame with the metrics
    """
    ck = pd.read_csv(ck_frame)
    class_list = []
    keywords = ["abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "extends", "false",
                "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient", "true",
                "try", "void", "volatile", "while"]

    outer_dict = dict([k, []] for k in keywords)

    for _, row in ck.iterrows():
        print('Counting on {}'.format(row['class']))
        class_list.append(row['class'])
        dic_key: Dict[str, int] = dict([k, 0] for k in keywords)
        path = row['file']
        f = open(path, encoding='utf-8', errors='ignore')
        for word in f.read().split():
            if word in dic_key:
                dic_key[word] += 1

        for key, value in outer_dict.items():
            value.append(dic_key[key])

    outer_dict['class-name'] = class_list
    out = pd.DataFrame.from_dict(outer_dict)
    out.to_csv('metrics/keywords.csv', index=False)


if __name__ == '__main__':
    generate_all_metrics()
