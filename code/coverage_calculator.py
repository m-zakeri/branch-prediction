__author__ = "Giovanni Grano"
__email__ = "grano@ifi.uzh.ch"
__license__ = "MIT"


import numpy as np
import os
import shutil
import glob
import pandas as pd
import settings as st
import subprocess
import sys


def main(path_evosuite, path_randoop):
    """
    Runs the extraction of the coverage
    :param path_evosuite: the path for the EvoSuite generated files
    :param path_randoop: the path for the Randoop generatd files
    :return:
    """
    get_evosuite_frame(path_evosuite)
    get_randoop_frame(path_randoop)


def extract_randoop(path_generated_files, budget):
    """
    Extracts the data about the coverage from Randoop data
    :param path_generated_files: the path where the files have been generated
    :param budget: the budget given to the generation
    :return: is saves a frame
    """
    get_randoop_frame(path_generated_files, budget)


def get_randoop_frame(path, budget):
    """
    Extracts the Randoop coverage frame
    :param path: the path for the generated Randoop projects
    :param budget: the budget given to the generation
    """
    projects = os.listdir('projects')
    print('Projects to analyze:')
    [print('\n'+x) for x in projects]
    tot = 0
    project_list = []
    class_list = []
    coverage_list = []
    for project in projects:
        print('\n* Elaborating\t {}'.format(project))
        to_look_pattern = path+'/tests/*/{}/randoop-tests/*/RegressionTest.java'.format(project)
        files = glob.glob(to_look_pattern, recursive=True)
        print('Number of tests\t{}'.format(len(files)))

        for path_test in files:
            tot = tot + 1
            class_name = os.path.basename(os.path.dirname(path_test)).replace('-', '.')
            print('Compile test for \t{}\t #{}'.format(class_name, str(tot)))
            output_path = os.path.dirname(os.path.abspath(path_test))
            has_compiled = compile_test(project, output_path)
            if has_compiled:
                print('Extracting coverage for {}'.format(class_name))
                branch_coverage = get_coverage_from_report(project, output_path, class_name)

                # fill the lists
                project_list.append(project)
                class_list.append(class_name)
                coverage_list.append(branch_coverage)

    outcome = pd.DataFrame({'project': project_list,
                            'class': class_list,
                            'branch_coverage': coverage_list})
    raw_path = '{}/{}/raw_randoop.csv'.format(st.DATA, budget)
    outcome.to_csv(raw_path, index=False)
    grouped = outcome.groupby(['project', 'class'])['branch_coverage'].mean()
    grouped.to_csv('{}/{}/randoop_coverage.csv'.format(st.DATA, budget))
    # remove_0_coverage(grouped, 'branch_coverage', '{}/{}/randoop.csv'.format(st.DATA, budget))


def compile_test(project, path):
    """
    Compiles a test generated with Randoop; if the compilation fails, the program ends
    :param project: the project into account
    :param path: the path where the test has been generated in
    :return it returns True if the compilation went through without any error; False otherwise
    """
    lib_dir = st.LIB
    compiled_classes = '{}/{}/classes'.format(st.PROJECTS, project)
    proj_dependencies = '{}/{}/dependencies'.format(st.PROJECTS, project)
    compilation_cp = lib_dir+'/*:'+compiled_classes+'/:'+path+'/:'+proj_dependencies+'/*'
    command = 'javac -cp {} RegressionTest.java'.format(compilation_cp)

    p = subprocess.run(command, shell=True,
                       cwd=path,
                       stderr=subprocess.PIPE, stdout=subprocess.PIPE)
    if p.returncode != 0:
        print('The following error happened:\n'
              '{}'.format(p.stderr))
        return False
    return True


def get_coverage_from_report(project, path, target_class):
    """
    Extracts the branch coverage for a generated test
    :param project: the project into account
    :param path: the path where the test has been generated in
    :param target_class: the class under test; we need to filter the dataset according to this class
    :return the branch coverage value as np.float64 data type
    """
    compiled_classes = '{}/{}/classes'.format(st.PROJECTS, project)
    class_sources = '{}/{}/sources'.format(st.PROJECTS, project)
    proj_dependencies = '{}/{}/dependencies'.format(st.PROJECTS, project)

    # the directory where to store the jacoco output
    temporary_dir = os.path.join(path, 'tmp')
    if os.path.exists(temporary_dir) and os.path.isdir(temporary_dir):
        shutil.rmtree(temporary_dir)
    os.makedirs(temporary_dir)

    jacoco_report_path = os.path.join(temporary_dir, 'jacoco-site/report.csv')
    command = 'python2 {}/report.py ' \
              '--jacocopath {}/jacocoant.jar ' \
              '--unittests RegressionTest ' \
              '--classpath {}/'.format(st.JDOOP_DIR, st.LIB, path)
    command += ':{}/*'.format(st.LIB)
    command += ':{}'.format(compiled_classes)
    command += ':{}/*'.format(proj_dependencies)
    command += ' --sourcepath {}/'.format(class_sources)
    command += ' --buildpath {}/'.format(compiled_classes)

    p = subprocess.run(command, shell=True,
                       cwd=temporary_dir,
                       stderr=subprocess.PIPE, stdout=subprocess.PIPE)
    if p.returncode != 0:
        print('An error during the compiling occurred')
        print(p.stderr)
        exit()

    # extract coverage from report
    simple_class_name = target_class.split('.')[-1]
    jacoco_frame = pd.read_csv(jacoco_report_path)
    jacoco_frame = jacoco_frame[jacoco_frame['CLASS'] == simple_class_name].reset_index()

    # check for empty dataframe
    if not jacoco_frame.empty:
        branch_missed = jacoco_frame.at[0, 'BRANCH_MISSED'].astype(np.float64)
        branch_covered = jacoco_frame.at[0, 'BRANCH_COVERED'].astype(np.float64)
        tot_branches = branch_covered+branch_missed
        if tot_branches == 0:
            print('Total of branches is 0')
            branch_coverage = 0.0
        else:
            branch_coverage = branch_covered/tot_branches
    else:
        branch_coverage = 0.0

    # remove temporary directory and compiled files
    shutil.rmtree(temporary_dir, ignore_errors=True)
    [os.remove(x) for x in glob.glob(path+'/*.class')]
    return branch_coverage


def get_evosuite_frame(path, output='data', aggregate=True):
    """
    Aggregates the coverage data generated by Evosuite
    :param path: the path of the EvoSuite output directory
    :param output: the directory for the output
    :param aggregate: flag for aggregate or not the data
    """
    to_look_pattern = path+'/**/statistics.csv'
    files = glob.glob(to_look_pattern, recursive=True)
    result = pd.concat([pd.read_csv(x) for x in files])
    result = result.sort_values(by=['TARGET_CLASS'])
    unique_targets = result['TARGET_CLASS'].unique().tolist()
    print('Number of tests generated \t\t{}'.format(result.shape[0]))
    print('Number of unique targets \t\t{}'.format(len(unique_targets)))
    if aggregate:
        grouped = result.groupby(['TARGET_CLASS'])['BranchCoverage'].mean()
        grouped = grouped.to_frame()
        grouped.to_csv('{}/evosuite_coverage.csv'.format(output))
    else:
        result.to_csv(('{}/evosuite_coverage_all.csv'.format(output)))


def remove_0_coverage(path, coverage_field, name):
    """
    Removes the classes with 0 coverage
    :param path: the path of the frame
    :param coverage_field: the field containing the coverage value
    :param name: the name of the file in output
    """
    if not isinstance(path, type(pd.DataFrame())):
        frame = pd.read_csv(path)
    else:
        frame = path
    frame = frame[frame[coverage_field]!=0]
    frame.to_csv('{}.csv'.format(name), index=False)


def get_list_cut(directory='metrics', out_dir='.'):
    """
    Processes all the metrics file generated and save a file with all the CUTs for Randoop and
    EvoSuite
    :param directory: the directory with all the files
    :param out_dir: the output directory
    """
    csv_files = glob.glob('{}/*.csv'.format(directory))
    frames_concat = []
    for csv in csv_files:
        frame = pd.read_csv(csv)
        project = os.path.basename(csv).replace('.csv', '')
        frame['project'] = [project for _ in range(frame.shape[0])]
        frames_concat.append(frame[frame['type'] == 'class'])
    csv_total = pd.concat(frames_concat)
    csv_total = csv_total[['project', 'class']]
    csv_total.to_csv('{}/subjects.csv'.format(out_dir), index=False)
    csv_total.to_csv('{}/subjects.txt'.format(out_dir), sep='\t', index=False, header=False)


if __name__ == '__main__':
    budgets = ['default', '180', '300', '600']

    # if len(sys.argv)-1 == len(budgets):
    #     i = 1
    #     for budget in budgets:
    #         path = sys.argv[i]
    #         i += 1
    #         get_randoop_frame(path=path, budget=budget)

    for budget in budgets:
        remove_0_coverage('{}/{}/randoop_coverage.csv'.format(st.DATA, budget), 'branch_coverage',
                          '{}/{}/randoop-{}'.format(st.DATA, budget,budget))
