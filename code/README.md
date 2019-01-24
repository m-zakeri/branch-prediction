# Branch Coverage Prediction 

This is the repository that hosts all the code and the scripts employed for the Journal of Software: Evolution and Process journal.

The work is the extension of the MaLTeSQuE paper _"Branch Coverage Prediction in Automated Testing"_

## Instructions

### Set up the project

Install `pip` and the `virtualenv` with the following commands:

```
sudo apt install python3-pip
sudo apt-get install python3-tk
pip3 install virtualenv
```

Then, go in the project directory and create and activate a virtual environment.

```
python3 -m virtualenv env
source env/bin/activate
```

The same virtual environment might be deactivated with `deactivate`.

Then, install all the dependencies:

```
pip3 install -r requirements.txt
```

To allow the code to fully work, please copy the directory `projects` and `data` that you find in the parent folder in this one.

### Run the Code

Starting from the generated test, run the scripts in `coverage_calculator.py` to extract the training data you will use for the rest of the study. To aggregate then the data about the coverage and the metrics for each class, use the `model_building.py` script.

Once you set everything, run the machine learning analysis with the `learning.py` file.
