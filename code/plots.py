__author__ = "Giovanni Grano"
__email__ = "grano@ifi.uzh.ch"
__license__ = "MIT"

import plotly.plotly as py
import plotly.graph_objs as go
import pandas as pd
import numpy as np
import settings
import os

from learning import *

from sklearn import datasets
from sklearn.model_selection import cross_val_predict
from sklearn import linear_model
from best_models import *
import matplotlib.pyplot as plt

py.sign_in('granoifi', 'yBY0BL7EvqRGPMeXP5jW')


def plot_feature_importance(metrics, name, budget):
    """
    Draws a bar plot of the metrics passed as parameter;
    It requires a plotly account to be locally installed on the machine
    :param metrics: the metrics to plot
    :param name: the name of the metrics
    :param budget: the budget used for the training
    """
    values, names = zip(*metrics)

    data = [go.Bar(
        x=values,
        y=names,
        orientation='h',
    )]

    layout = go.Layout(
        xaxis=dict(
            title='mean decrease in accuracy',
            titlefont=dict(
              size=16,
              color='black'
            ),
            tickfont=dict(
                size=16,
                color='black'
            ),
        ),
        yaxis=dict(
            title='factors',
            titlefont=dict(
                size=16,
                color='black'
            ),
            tickfont=dict(
                size=16,
                color='black'
            ),
        ),
        autosize=True,
        margin=go.Margin(
            l=160,
            r=50,
            b=50,
            t=20,
            pad=10
        ),
        legend=dict(
            font=dict(
                size=6
            ),
        )
    )

    fig = go.Figure(data=data, layout=layout)
    py.image.save_as(fig, filename='{}/mdi-{}-{}.pdf'.format(settings.PLOTS, name, budget))


def plot_mae_for_budgets():
    """
    Plots the graph with all the different achieved MAE for each budget and tool
    """
    evosuite_maes = []
    randoop_maes = []
    for budget in settings.BUDGETS:
        for tool in settings.TOOLS:
            path = '{}/{}/evaluation_{}_rfr.csv'.format(settings.DATA, budget, tool)

            if os.path.exists(path):
                frame = pd.read_csv(path)
                frame = frame['mean_absolute_error-AUC']
                mae = frame[0]
            else:
                print('Frame not found for {} with b={}'.format(tool, budget))
                mae = 0.2 # placeholder
            if tool == 'evosuite':
                evosuite_maes.append(mae)
            else:
                randoop_maes.append(mae)

    trace1 = go.Bar(
            x=['default', '180s', '300s', '600s'],
            y=evosuite_maes,
            text=[np.round(float(i), 4) for i in evosuite_maes],
            textposition='outside',
            textfont=dict(
                size=14,
            ),
            name='EvoSuite'
        )

    trace2 = go.Bar(
        x=['default', '180s', '300s', '600s'],
        y=randoop_maes,
        text=[np.round(float(i), 4) for i in randoop_maes],
        textposition='outside',
        textfont=dict(
                size=14,
            ),
        name='Randoop'
    )

    data = [trace1, trace2]

    layout = go.Layout(
        barmode='group',
        xaxis=dict(
            title='budgets',
            titlefont=dict(
                size=16,
                color='black'
            ),
            tickfont=dict(
                size=16,
                color='black'
            ),
        ),
        yaxis=dict(
            title='mean average error',
            titlefont=dict(
                size=16,
                color='black'
            ),
            tickfont=dict(
                size=16,
                color='black'
            ),
        ),
        autosize=True,
        margin=go.Margin(
            l=70,
            r=50,
            b=50,
            t=20,
            pad=10
        ),
        legend=dict(
            font=dict(
                size=16,
                color='black'
            ))
        # ))
    )
    fig = go.Figure(data=data, layout=layout)
    py.image.save_as(fig, filename='{}/mae-results.pdf'.format(settings.PLOTS))


def plot_results(evosuite='data/evaluation_test_evosuite.csv', randoop='data/evaluation_test_randoop.csv'):
    evosuite = pd.read_csv(evosuite)
    randoop = pd.read_csv(randoop)

    metrics = evosuite['metric'].unique().tolist()
    evo_values = evosuite['value'].tolist()
    ran_values = randoop['value'].tolist()

    trace1 = go.Bar(
        x=metrics,
        y=evo_values,
        name='EvoSuite'
    )
    trace2 = go.Bar(
        x=metrics,
        y=ran_values,
        name='Randoop'
    )

    data = [trace1, trace2]

    layout = go.Layout(
        barmode='group',
        xaxis=dict(
            titlefont=dict(
                size=12,
                color='black'
            ),
            tickfont=dict(
                size=10,
                color='black'
            ),
        ),
        yaxis=dict(
            titlefont=dict(
                size=16,
                color='black'
            ),
            tickfont=dict(
                size=16,
                color='black'
            ),
        ),
        autosize=True,
        margin=go.Margin(
            l=50,
            r=50,
            # b=50,
            t=20,
            pad=10
        ),
        # legend=dict(
        #     font=dict(
        #         size=6
        #     ),
        # ))
    )
    fig = go.Figure(data=data, layout=layout)
    py.image.save_as(fig, filename='data/results.pdf')


def scatterplot_coverage(budgets=['180', '300', '600', 'default'], tools=['evosuite', 'randoop']):
    """
    Plots the scatterplot of the achieved and predicted coverage
    :param budgets: the list of budgets to analyze
    :param tools: the list of the tools to consider
    """
    for budget in budgets:
        for tool in tools:
            # reading predictions
            frame_path = 'data/{}/{}-predictions-{}.csv'.format(budget, tool, budget)
            frame = pd.read_csv(frame_path)
            label = 'BranchCoverage' if 'BranchCoverage' in frame.columns else 'branch_coverage'
            frame = frame.sort_values(by=[label], ascending=True)
            predictions = list(frame['prediction'])
            oracles = list(frame[label])

            trace0 = go.Scatter(
                y=predictions,
                x=[i for i in range(0, len(predictions))],
                name='Predicted',
                mode='markers',
                marker=dict(size=5)
            )

            trace1 = go.Scatter(
                y=oracles,
                x=[i for i in range(0, len(oracles))],
                name='Oracle',
                mode='markers',
                marker=dict(size=5)
            )

            data = [trace0, trace1]

            layout = dict(yaxis=dict(zeroline=False,
                                     title='coverage',
                                     size=16,
                                     color='black'),
                          xaxis=dict(zeroline=False,
                                     size=16,
                                     title='classes',
                                     color='black'),
                          autosize=True,
                          margin=go.Margin(
                              l=50,
                              r=50,
                              b=40,
                              t=20,
                              pad=10
                          )
                          )

            fig = dict(data=data, layout=layout)
            py.image.save_as(fig, filename='plots/scatter-{}-{}-.pdf'.format(tool, budget))


def build_scatterplot(budget):
    """
    Runs a cross-validation and plot the scatter-plot of the cross-fold validation error
    :param tool: the tool to employ
    :param budget: the budget in use for the tool
    :return:
    """
    frame = load_frames(budget=budget)
    X = frame[metrics]
    Y = frame['y']

    predicted = cross_val_predict(get_best_models(budget=budget, tool=settings.algo), X, Y, cv=20)

    fig, ax = plt.subplots()
    ax.scatter(Y, predicted, edgecolors=(0, 0, 0))
    ax.plot([Y.min(), Y.max()], [Y.min(), Y.max()], 'k--', lw=4)
    ax.set_xlabel('Measured')
    ax.set_ylabel('Predicted')
    plt.savefig('{}/cv-error-{}-{}.pdf'.format(settings.PLOTS, settings.algo, budget))


if __name__ == '__main__':
    for budget in settings.BUDGETS:
        tools = ['randoop', 'evosuite']
        for tool in tools:
            settings.algo = tool
            build_scatterplot(budget=budget)

    # plot_mae_for_budgets()
    # scatterplot_coverage()
    # plot_results()
