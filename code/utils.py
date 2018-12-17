import pandas as pd
import settings
import os
from functools import reduce


def check_coverage(evosuite, randoop):
    """
    Checks some stats about the achieved coverages reported in the paper
    :param evosuite: the EvoSuite frame
    :param randoop: the Randoop frame
    """
    evo_frame = pd.read_csv(evosuite)
    ran_frame = pd.read_csv(randoop)
    min_coverage = []
    max_coverage = []
    average_coverage = []
    average_std = []

    min_coverage.append(evo_frame.groupby(['TARGET_CLASS'])['BranchCoverage'].mean().to_frame().min()[0])
    min_coverage.append(ran_frame.groupby(['class'])['branch_coverage'].mean().to_frame().min()[0])
    max_coverage.append(evo_frame.groupby(['TARGET_CLASS'])['BranchCoverage'].mean().to_frame().max()[0])
    max_coverage.append(ran_frame.groupby(['class'])['branch_coverage'].mean().to_frame().max()[0])
    average_coverage.append(evo_frame.groupby(['TARGET_CLASS'])['BranchCoverage'].mean().to_frame().mean()[0])
    average_coverage.append(ran_frame.groupby(['class'])['branch_coverage'].mean().to_frame().mean()[0])
    average_std.append(evo_frame.groupby(['TARGET_CLASS'])['BranchCoverage'].std().mean())
    average_std.append(ran_frame.groupby(['class'])['branch_coverage'].std().mean())
    results = pd.DataFrame({'1_min_coverage': min_coverage,
                            '2_max_coverage': max_coverage,
                            '3_average_coverage': average_coverage,
                            '4_std_coverage': average_std})
    print(results.to_latex())


def group_and_count_for_project(frame='subjects.csv'):
    """
    Some stats about the classes used per project
    :param frame: the subjects frame
    """
    subjects = pd.read_csv(frame)
    print('Total classes used\t{}'.format(subjects.shape[0]))
    print(subjects.groupby(['project']).size())


def table_coverage():
    dict_pandas = {}

    i = 1
    for tool in settings.TOOLS:
        for budget, budget_label in zip(settings.BUDGETS, settings.BUDGETS_LABEL):

            path = '{}/{}/{}-predictions-{}.csv'.format(settings.DATA, budget, tool, budget)

            frame = pd.read_csv(path)
            label = 'BranchCoverage' if 'BranchCoverage' in frame.columns else 'branch_coverage'

            aux = []
            aux.append(frame[label].mean())
            aux.append(frame[label].median())
            aux.append(frame[label].min())
            aux.append(frame[label].max())
            aux.append(frame[label].std())

            name = '{}-{}-{}'.format(i, tool, budget)
            i+=1
            dict_pandas[name] = aux

    res = pd.DataFrame(dict_pandas)

    print(res)


def check_non_changing_coverage(tool='evosuite'):
    default = pd.read_csv('data/default/evosuite.csv')
    budget1 = pd.read_csv('data/180/evosuite.csv')
    budget2 = pd.read_csv('data/300/evosuite.csv')
    budget3 = pd.read_csv('data/600/evosuite.csv')

    merge = [default, budget1, budget2, budget3]
    merge1 = default.merge(budget1, on='TARGET_CLASS')
    merge2 = budget2.merge(budget3, on='TARGET_CLASS')
    merge = merge1.merge(merge1, on='TARGET_CLASS')

    print(list(merge.columns))
    merge = merge[['TARGET_CLASS', 'BranchCoverage_x_x', 'BranchCoverage_x_y',
                  'BranchCoverage_y_x', 'BranchCoverage_y_y']]
    merge.sort_values(by=['BranchCoverage_x_x', 'BranchCoverage_x_y',
                          'BranchCoverage_y_x', 'BranchCoverage_y_y'],
                      ascending=False)
    print(merge)
    merge.to_csv('/Users/grano/Desktop/merge.csv', index=False)
    # print(final.head())


def quartile_table():
    """
    Prints the LaTeX code for the table with the quartile analysis
    :return:
    """
    d = {}
    for budget in settings.BUDGETS:
        for tool in settings.TOOLS:
            frame_path = 'data/{}/{}-predictions-{}.csv'.format(budget, tool, budget)
            frame = pd.read_csv(frame_path)
            label = 'BranchCoverage' if tool=='evosuite' else 'branch_coverage'
            frame['delta'] = abs(frame[label] - frame['prediction'])
            q = frame['delta'].quantile([.25, .5, .75])
            d[tool+'_'+budget] = q.tolist()
    res = pd.DataFrame(d, columns=['evosuite_default', 'randoop_default',
                                   'evosuite_180', 'randoop_180',
                                   'evosuite_300', 'randoop_300',
                                   'evosuite_600', 'randoop_600'])
    print(res.to_latex())


if __name__ == '__main__':
    quartile_table()
    # check_non_changing_coverage()
    # table_coverage()
    # group_and_count_for_project()
    # check_coverage(evosuite='data/evosuite_no_0_all.csv', randoop='data/randoop_no_0_all.csv')
