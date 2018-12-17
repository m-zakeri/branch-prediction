library(effsize)
library(xtable)

metrics <- c('cbo', 'wmc', 'dit', 'noc', 'rfc', 'lcom', 'nom', 'nopm', 'nosm', 'nof',
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
             'void', 'volatile', 'while')

tools <- c('evosuite', 'randoop')
budget <- '300'

for (tool in tools) {
    good_precision <- read.csv(paste('good-prediction-', tool, '-', budget, '.csv', sep=''), check.names=FALSE)
    bad_precision <- read.csv(paste('bad-prediction-', tool, '-', budget, '.csv', sep=''), check.names=FALSE)
    p_values <- c()
    
    for (metric in metrics) {
      p_values <- c(p_values, wilcox.test(bad_precision[, metric], good_precision[, metric], paired = F)$p.value)
    }

    cliff_delta <- c()
    cliff_estimate <- c()
    for (metric in metrics) {
      res_delta <- cliff.delta(bad_precision[,metric], good_precision[,metric], paired = F)
      cliff_delta <- c(cliff_delta, as.character(res_delta$magnitude))
      cliff_estimate <- c(cliff_estimate, res_delta$estimate)
    }

    df <- data.frame(metrics, p_values, cliff_delta, cliff_estimate)
    write.csv(df, (paste('importance-', tool, '-', budget, '.csv', sep='')), row.names = F)
    print(xtable(df, digits=4))
}

