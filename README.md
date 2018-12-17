# Replication Package

In this repository we share all the code and the raw data about the JSEP paper title _How High Will it Be? An Extended Study on the Branch Coverage Prediction in Automated Testing_.

## Test Generation Scripts

The folder [tests-generation][test] contains the full scrips we used to generate the tests with both Randoop and EvoSuite.


## Source Code 

In the [code][code] folder we provide all the scripts and the source code we used for our empirical study.

The folder [plots][plots] contains all the plots that we do not include in the paper for the sake of space.

All the raw data are in the [data][data] folder.

In order to replicate it, follow these steps:

1. Install all the Python dependencies with `pip install -r requirements`. We remember that Python3 is needed. You also need Java 1.8 and Maven installed on your machine.
2. Starting from the generated test, run the scripts in `coverage_calculator.py` to extract the training data you will use for the rest of the study. To aggregate then the data about the coverage and the metrics for each class, use the `model_building.py` script.
3. Once you set everything, run the machine learning analysis with the `learning.py` file.


## Main Maintainer 
[Giovanni Grano][gio]

[test]: https://github.com/sealuzh/branch-prediction/tree/master/test-generation
[code]: https://github.com/sealuzh/branch-prediction/tree/master/code
[gio]: https://github.com/giograno
[data]: https://github.com/sealuzh/branch-prediction/tree/master/code/data
[plots]: https://github.com/sealuzh/branch-prediction/tree/master/code/plots
