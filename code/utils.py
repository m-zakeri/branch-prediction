import pandas as pd


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


if __name__ == '__main__':
    group_and_count_for_project()
    check_coverage(evosuite='data/evosuite_no_0_all.csv', randoop='data/randoop_no_0_all.csv')
