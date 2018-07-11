import os

# the base dir of the project
BASE_DIR = os.path.dirname(os.path.abspath(__file__))

LIB = os.path.abspath(os.path.join(BASE_DIR, 'lib'))

PROJECTS = os.path.abspath(os.path.join(BASE_DIR, 'projects'))

JDOOP_DIR = os.path.abspath(os.path.join(LIB, 'jdoop'))

DATA = os.path.abspath(os.path.join(BASE_DIR, 'data'))