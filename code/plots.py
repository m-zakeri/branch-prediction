__author__ = "Giovanni Grano"
__email__ = "grano@ifi.uzh.ch"
__license__ = "MIT"

import plotly.plotly as py
import plotly.graph_objs as go
import pandas as pd

py.sign_in('granoifi', 'yBY0BL7EvqRGPMeXP5jW')


def plot_feature_importance(metrics, name):
    """
    Draws a bar plot of the metrics passed as parameter;
    It requires a plotly account to be locally installed on the machine
    :param metrics: the metrics to plot
    :param name: the name of the metrics
    """
    values, names = zip(*metrics)

    data = [go.Bar(
        x=values,
        y=names,
        orientation='h',
    )]

    layout = go.Layout(
        xaxis=dict(
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
    py.image.save_as(fig, filename='data/{}.pdf'.format(name))


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


if __name__ == '__main__':
    plot_results()
