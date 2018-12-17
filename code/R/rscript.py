from settings import *
import pandas as pd


def separate(budget):
    """
    Separates tests with high and low prediction accuracy
    :param budget: the budget to consider
    :return:
    """
    for tool in TOOLS:
        frame = pd.read_csv('{}/{}/{}-predictions-{}.csv'.format(DATA, budget, tool, budget))
        y_label = 'BranchCoverage' if 'BranchCoverage' in frame.columns else 'branch_coverage'
        frame['delta'] = abs(frame[y_label] - frame['prediction'])

        quantiles = frame['delta'].quantile([0.25, 0.75])
        lower_quantile = quantiles[0.25]
        upper_quantile = quantiles[0.75]

        bad_tests = frame[frame['delta'] <= lower_quantile]
        good_tests = frame[frame['delta'] >= upper_quantile]
        bad_tests.to_csv(os.path.join(RDIR, 'good-prediction-{}-{}.csv'.format(tool, budget)), index=False)
        good_tests.to_csv(os.path.join(RDIR, 'bad-prediction-{}-{}.csv'.format(tool, budget)), index=False)
        print("* Bad predictions = {}".format(len(good_tests)))
        print("* Good predictions = {}".format(len(bad_tests)))


def format2double(x):
    return '%1.2f' % x


def build_tables(budget='300'):
    for tool in TOOLS:
        print('* TOOL: {}'.format(tool))
        frame = pd.read_csv(os.path.join(RDIR, 'importance-{}-{}.csv'.format(tool, budget)))
        frame = frame[frame.p_values <= 0.05]
        frame = frame[(frame.cliff_delta == 'medium') | (frame.cliff_delta == 'large')]
        if frame.empty:
            print('{} is empty'.format(tool))
            exit()
        frame['rel'] = frame.cliff_estimate.apply(lambda x: '+' if x > 0 else '-')
        frame.cliff_estimate = frame.cliff_estimate.apply(lambda x: round(abs(x), ndigits=2))
        frame['d-value'] = frame.apply(lambda x: '{} ({})'.format(x.cliff_estimate, x.cliff_delta), axis=1)
        print(frame.shape[0])
        print(frame[['metrics', 'rel', 'd-value']].to_latex(index=False))


if __name__ == '__main__':
    # separate('300')
    build_tables()


