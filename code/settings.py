import os

# the base dir of the project
BASE_DIR = os.path.dirname(os.path.abspath(__file__))

LIB = os.path.abspath(os.path.join(BASE_DIR, 'lib'))

PROJECTS = os.path.abspath(os.path.join(BASE_DIR, 'projects'))

JDOOP_DIR = os.path.abspath(os.path.join(LIB, 'jdoop'))

DATA = os.path.abspath(os.path.join(BASE_DIR, 'data'))

PLOTS = os.path.abspath(os.path.join(BASE_DIR, 'plots'))

RDIR = os.path.abspath(os.path.join(BASE_DIR, 'R'))

# the budgets that we are experimenting
BUDGETS = ['default', '180', '300', '600']
BUDGETS_LABEL = ['default', '180s', '300s', '600s']
# the tools that we are experimenting
TOOLS = ['evosuite', 'randoop']
# in-use tool
algo = 'evosuite'

