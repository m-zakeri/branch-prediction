__author__ = "Giovanni Grano"
__email__ = "grano@ifi.uzh.ch"
__license__ = "MIT"

import numpy as np

import matplotlib
matplotlib.use('Agg')
from matplotlib import pyplot as plt
from sklearn.externals import joblib

from sklearn.model_selection import GridSearchCV, ShuffleSplit, cross_validate, RepeatedKFold
from sklearn.metrics import mean_squared_error, median_absolute_error, r2_score, \
    mean_absolute_error, mean_squared_log_error, make_scorer

from sklearn.svm import SVR
from sklearn.ensemble import RandomForestRegressor
from sklearn.neural_network import MLPRegressor
from sklearn.linear_model import HuberRegressor
from collections import defaultdict

from sklearn.preprocessing import StandardScaler
from sklearn.pipeline import Pipeline
from constants import *
import os
from plots import *

py.sign_in('granoifi', 'yBY0BL7EvqRGPMeXP5jW')


def load_frames(metric_frame='data'):
    """Returns the frame with all the metrics and change the branch coverage column name to y
    :param metric_frame: the frame to read
    """
    frame = pd.read_csv(os.path.join(metric_frame, '{}.csv').format(algo))
    y_label = 'BranchCoverage' if 'BranchCoverage' in frame.columns else 'branch_coverage'
    frame = frame.rename(index=str, columns={y_label: "y"})
    frame = frame.fillna(value=0.0)
    frame = frame.reset_index()
    return frame


def get_param_grid(algorithm):
    """
    Returns the right parameter grid according to the selected algorithm
    Valid parameters are 'all', 'svr', 'huber', 'mlp, 'rfr' and 'test'
    :param algorithm: the algorithm to choose
    :return: a dictionary with the parameter grid
    """
    if algorithm == 'all':
        return [dict(classifier=[SVR()],
                     preprocessing=[StandardScaler(), None],
                     classifier__epsilon=[0.025, 0.05, 0.1, 0.2, 0.4],
                     classifier__C=[2 ** x for x in np.linspace(-30, 20, num=15)]),
                dict(classifier=[HuberRegressor()],
                     preprocessing=[None],
                     classifier__alpha=[2 ** x for x in np.linspace(-30, 20, num=15)]),
                dict(classifier=[MLPRegressor()],
                     preprocessing=[StandardScaler(), None],
                     classifier__alpha=[2 ** x for x in np.linspace(-30, 20, num=15)],
                     classifier__hidden_layer_sizes=[(h_unit, h_layer) for h_unit in [1, 3, 5, 9]
                                                     for h_layer in [int(round(73 * x)) for x in [0.5, 1, 2, 3]]]),
                dict(classifier=[RandomForestRegressor()],
                     preprocessing=[None],
                     classifier__n_estimators=[2 * x for x in range(1, 11)],
                     classifier__max_features=[int((len(metrics) / 10) * x) for x in range(1, 11)],
                     classifier__max_depth=[5 * x for x in range(1, 11)],
                     classifier__min_samples_leaf=[1 * x for x in range(1, 6)])]
    elif algorithm == 'svr':
        return [dict(classifier=[SVR()],
                     preprocessing=[StandardScaler(), None],
                     classifier__epsilon=[0.025, 0.05, 0.1, 0.2, 0.4],
                     classifier__C=[2 ** x for x in np.linspace(-30, 20, num=15)])]
    elif algorithm == 'huber':
        return [dict(classifier=[HuberRegressor()],
                     preprocessing=[None],
                     classifier__alpha=[2 ** x for x in np.linspace(-30, 20, num=15)])]
    elif algorithm == 'mlp':
        return [dict(classifier=[MLPRegressor()],
                     preprocessing=[StandardScaler(), None],
                     classifier__alpha=[2 ** x for x in np.linspace(-30, 20, num=15)],
                     classifier__hidden_layer_sizes=[(h_unit, h_layer) for h_unit in [1, 3, 5, 9]
                                                     for h_layer in [int(round(73 * x)) for x in [0.5, 1, 2, 3]]])]
    elif algorithm == 'rfr':
        return [dict(classifier=[RandomForestRegressor()],
                     preprocessing=[None],
                     classifier__n_estimators=[2 * x for x in range(1, 11)],
                     classifier__max_features=[int((len(metrics) / 10) * x) for x in range(1, 11)],
                     classifier__max_depth=[5 * x for x in range(1, 11)],
                     classifier__min_samples_leaf=[1 * x for x in range(1, 6)])]
    elif algorithm == 'test':
        return [dict(classifier=[RandomForestRegressor()],
                preprocessing=[None],
                classifier__n_estimators=[14],
                classifier__max_features=[79],
                classifier__max_depth=[25],
                classifier__min_samples_leaf=[1])]
    else:
        print('Unsupported algorithm selected')
        exit()


def run_regression(n_inner=5, n_outer=10, n_repeated=3, model_name='all'):
    """
    Start the regression
    :param n_inner: k of the inner fold
    :param n_outer: k of the outer fold
    :param n_repeated: number of repetitions
    :param model_name: the name of the model/s to train
    :return:
    """
    global X, Y

    print('Importing data')
    frame = load_frames()
    X = frame[metrics]
    Y = frame['y']
    print('Import done')

    pipe = Pipeline([('preprocessing', StandardScaler()),
                     ('classifier', SVR())])

    param_grid = get_param_grid(model_name)

    inner_cv = ShuffleSplit(n_splits=n_inner)
    outer_cv = RepeatedKFold(n_splits=n_outer, n_repeats=n_repeated)

    grid = GridSearchCV(estimator=pipe,
                        param_grid=param_grid,
                        cv=inner_cv,
                        scoring='neg_mean_absolute_error',
                        verbose=1,
                        n_jobs=-1)

    results = cross_validate(estimator=grid,
                             cv=outer_cv,
                             X=X,
                             y=Y,
                             scoring=get_scoring(),
                             return_train_score=True,
                             verbose=1,
                             n_jobs=-1)

    median_absolute_error = results.get('test_median_absolute_error').mean()
    mean_squared_log_error = results.get('test_mean_squared_log_error').mean()
    mean_squared_error = results.get('test_mean_squared_error').mean()
    r2_score = results.get('test_r2_score').mean()
    mean_absolute_error = results.get('test_mean_absolute_error').mean()

    metrics_res = pd.DataFrame({'median_abs_error': [median_absolute_error],
                                'mean_squared_log_error': [mean_squared_log_error],
                                'mean_squared_error': [mean_squared_error],
                                'r2_score': [r2_score],
                                'mean_absolute_error-AUC': [mean_absolute_error]})

    metrics_res.to_csv('data/evaluation_{}_{}.csv'.format(algo, model_name), index=False)

    grid.fit(X, Y)
    model = grid.best_params_['classifier']
    print('Best model is:\n{}'.format(model))

    model_string = open('data/_model_best_{}_{}.txt'.format(algo, model_name), 'w')
    model_string.write(str(model))
    model_string.close()

    print('Saving the model on the entire set')
    grid.fit(X, Y)
    joblib.dump(grid.best_estimator_, 'data/model_{}.pkl'.format(algo), compress=1)


def plot_learning_curve(train_sizes, train_scores, test_scores):
    """Plots the learning curve"""
    train_scores_mean = np.mean(train_scores, axis=1)
    train_scores_std = np.std(train_scores, axis=1)
    test_scores_mean = np.mean(test_scores, axis=1)
    test_scores_std = np.std(test_scores, axis=1)

    plt.figure()
    plt.xlabel("Training examples")
    plt.ylabel("Score")
    plt.fill_between(train_sizes, train_scores_mean - train_scores_std,
                     train_scores_mean + train_scores_std, alpha=0.1,
                     color="r")
    plt.fill_between(train_sizes, test_scores_mean - test_scores_std,
                     test_scores_mean + test_scores_std, alpha=0.1, color="g")
    plt.plot(train_sizes, train_scores_mean, 'o-', color="r",
             label="Training score")
    plt.plot(train_sizes, test_scores_mean, 'o-', color="g",
             label="Cross-validation score")
    plt.legend(loc="best")
    plt.savefig('data/learning_curve_{}.pdf'.format(algo), bbox_inches='tight')


def feature_importance(model):
    """
    Computes the feature importance for a given model using the mean decrease accuracy method
    :param model: the model to test
    :return: save the
    """
    scores = defaultdict(list)

    frame = load_frames()
    X = frame[metrics].values
    Y = frame['y'].values

    for i in range(1, 11):
        split = ShuffleSplit(n_splits=5, train_size=0.7, test_size=0.3)
        # crossvalidate the scores on a number of different random splits of the data
        for train_idx, test_idx in split.split(X):
            X_train, X_test = X[train_idx], X[test_idx]
            Y_train, Y_test = Y[train_idx], Y[test_idx]
            model.fit(X_train, Y_train)
            acc = r2_score(Y_test, model.predict(X_test))
            for i in range(X.shape[1]):
                X_t = X_test.copy()
                np.random.shuffle(X_t[:, i])
                shuff_acc = r2_score(Y_test, model.predict(X_t))
                scores[metrics[i]].append((acc - shuff_acc) / acc)
    print("Features sorted by their score:")
    s = sorted([(round(np.mean(score), 4), feat) for
            feat, score in scores.items()], reverse=True)
    print(s)
    plot_feature_importance(s[:20], algo)


def compute_mdi(model):
    """
    Computes the Mean in Decrease Accuracy for a given model.
    N.B: only works with a Random Forest Model that has the feature_importances_ variable
    :param model: the model
    :return: plot the feature importance
    """
    features = [[] for _ in range(len(metrics))]
    for i in range(0, 10):
        model.fit(X, Y)
        for j, elem in enumerate(model.feature_importances_):
            features[j].append(elem)
    runs = list(range(10))
    features_importance = pd.DataFrame(features, columns=runs, index=metrics)
    features_importance.to_csv('data/mdi_features_{}.csv'.format(algo))
    mean = lambda x: sum(x) / len(x)
    features_average = [mean(x) for x in features]
    s = sorted(zip(map(lambda x: round(x, 3), features_average), metrics), reverse=True)
    print(s)
    plot_feature_importance(s[:20], algo)


def get_scoring():
    """Returns the scores to evaluate the model"""
    return dict(median_absolute_error=make_scorer(median_absolute_error),
                mean_squared_log_error=make_scorer(mean_squared_log_error),
                mean_squared_error=make_scorer(mean_squared_error),
                r2_score=make_scorer(r2_score),
                mean_absolute_error=make_scorer(mean_absolute_error))


if __name__ == '__main__':
    global algo
    pd.options.display.float_format = '{:,.3f}'.format
    # EvoSuite learning
    algo = 'evosuite'
    run_regression(n_inner=5, n_outer=10, model_name='rfr')
    # Randoop learning
    algo = 'randoop'
    run_regression(n_inner=5, n_outer=10, model_name='rfr')