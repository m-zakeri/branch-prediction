import pandas as pd


def merge(coverage_frame, ck_frame='metrics/ck.csv', halstead_frame='metrics/halstead.csv',
          jdepend_frame='metrics/jdepend.csv',
          keywords_frame='metrics/keywords.csv'):
    """
    Merges all the frames in an unique one;

    :param coverage_frame: the coverage with the achieved coverages! It might refer to EvoSuite or Randoop
    :param ck_frame: the frame with the ck metrics
    :param halstead_frame: the frame with the halstead metrics
    :param jdepend_frame: the frame with the metrics from jdepend
    :param keywords_frame: the frame with the keywords
    :return the resulting Pandas DataFrame
    """
    ck = pd.read_csv(ck_frame)
    halstead = pd.read_csv(halstead_frame)
    jdepend = pd.read_csv(jdepend_frame)
    keywords = pd.read_csv(keywords_frame)

    coverage_col = 'TARGET_CLASS' if 'TARGET_CLASS' in coverage_frame.columns else 'class'

    merge_frame = coverage_frame.merge(ck, left_on=coverage_col, right_on='class')
    merge_frame = merge_frame.merge(halstead, on='class')
    merge_frame = merge_frame.merge(jdepend, on='class')
    merge_frame = merge_frame.merge(keywords, left_on='class', right_on='class-name')
    return merge_frame


def build_frames_for_budgets(budgets=['180','300','600','default'], tools=['evosuite','randoop']):
    """
    Builds the aggregate frames with coverage and the various metrics
    :param budgets: the list of the different budgets
    :param tools: the list of the tools to employ
    :return:
    """
    for budget in budgets:
        for tool in tools:
            print('* Budget {} for {}'.format(budget, tool))
            coverage = pd.read_csv('data/{}/{}-{}.csv'.format(budget, tool, budget))
            label = 'BranchCoverage' if 'BranchCoverage' in coverage.columns else 'branch_coverage'
            coverage = coverage[coverage[label] != 0]
            aux = merge(coverage)
            print('{} entries'.format(aux.shape[0]))
            aux.to_csv('data/{}/{}.csv'.format(budget, tool), index=False)


if __name__ == '__main__':
    build_frames_for_budgets(budgets=['600'], tools=['randoop'])
    # evosuite_all = merge('data/evosuite_no_0.csv')
    # randoop_all = merge('data/randoop_no_0.csv')
    # evosuite_all.to_csv('data/evosuite.csv', index=False)
    # randoop_all.to_csv('data/randoop.csv', index=False)
