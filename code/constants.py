__author__ = "Giovanni Grano"
__email__ = "grano@ifi.uzh.ch"
__license__ = "MIT"

testing_tools = ['evosuite', 'randoop']
projects = ['time', 'math', 'lang', 'guava', 'cassandra', 'dagger', 'ivy']

budget = [45, 90, 180]

metrics = ['cbo', 'wmc', 'dit', 'noc', 'rfc', 'lcom', 'nom', 'nopm', 'nosm', 'nof',
           'nopf', 'nosf', 'nosi', 'loc', 'vocabulary', 'length',
           'calculated_length', 'volume', 'difficulty', 'effort', 'time', 'bugs',
           'A', 'Ca', 'Ce', 'D', 'I', 'V', 'abstract', 'assert',
           'boolean', 'break', 'byte', 'case', 'catch', 'char',
           'const', 'continue', 'default', 'do', 'double', 'else',
           'extends', 'false', 'final', 'finally', 'float', 'for', 'goto', 'if',
           'implements', 'import', 'instanceof', 'int', 'interface', 'long',
           'native', 'new', 'null', 'package', 'private', 'protected', 'public',
           'return', 'short', 'static', 'strictfp', 'super', 'switch',
           'synchronized', 'this', 'throw', 'throws', 'transient', 'true', 'try',
           'void', 'volatile', 'while']
