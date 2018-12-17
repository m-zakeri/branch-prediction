from sklearn.ensemble import RandomForestRegressor


def get_best_models(budget, tool):
    """
    Statically returns the best model we obtained with our tests; needed to compute some additional analysis
    :param budget: the budget for the model version
    :param tool: the tool for the model version
    :return a random forest regressor with the right configuration
    """
    if tool == 'evosuite':
        if budget == '180':
            return RandomForestRegressor(
                bootstrap=True, criterion='mse', max_depth=25,
                max_features=71, max_leaf_nodes=None, min_impurity_decrease=0.0,
                min_impurity_split=None, min_samples_leaf=1,
                min_samples_split=2, min_weight_fraction_leaf=0.0,
                n_estimators=16, n_jobs=1, oob_score=False, random_state=None,
                verbose=0, warm_start=False)
        elif budget == '300':
            return RandomForestRegressor(
                bootstrap=True, criterion='mse', max_depth=30,
                max_features=79, max_leaf_nodes=None, min_impurity_decrease=0.0,
                min_impurity_split=None, min_samples_leaf=1,
                min_samples_split=2, min_weight_fraction_leaf=0.0,
                n_estimators=20, n_jobs=1, oob_score=False, random_state=None,
                verbose=0, warm_start=False)
        elif budget == '600':
            return RandomForestRegressor(
                bootstrap=True, criterion='mse', max_depth=45,
                max_features=63, max_leaf_nodes=None, min_impurity_decrease=0.0,
                min_impurity_split=None, min_samples_leaf=1,
                min_samples_split=2, min_weight_fraction_leaf=0.0,
                n_estimators=8, n_jobs=1, oob_score=False, random_state=None,
                verbose=0, warm_start=False)
        else:
            return RandomForestRegressor(
                bootstrap=True, criterion='mse', max_depth=45,
                max_features=71, max_leaf_nodes=None, min_impurity_decrease=0.0,
                min_impurity_split=None, min_samples_leaf=1,
                min_samples_split=2, min_weight_fraction_leaf=0.0,
                n_estimators=16, n_jobs=1, oob_score=False, random_state=None,
                verbose=0, warm_start=False)
    else:
        if budget == '180':
            return RandomForestRegressor(bootstrap=True, criterion='mse', max_depth=35,
                                         max_features=71, max_leaf_nodes=None, min_impurity_decrease=0.0,
                                         min_impurity_split=None, min_samples_leaf=1,
                                         min_samples_split=2, min_weight_fraction_leaf=0.0,
                                         n_estimators=16, n_jobs=1, oob_score=False, random_state=None,
                                         verbose=0, warm_start=False)
        elif budget == '300':
            return RandomForestRegressor(bootstrap=True, criterion='mse', max_depth=30,
                                         max_features=55, max_leaf_nodes=None, min_impurity_decrease=0.0,
                                         min_impurity_split=None, min_samples_leaf=1,
                                         min_samples_split=2, min_weight_fraction_leaf=0.0,
                                         n_estimators=6, n_jobs=1, oob_score=False, random_state=None,
                                         verbose=0, warm_start=False)
        elif budget == '600':
            return RandomForestRegressor(bootstrap=True, criterion='mse', max_depth=35,
                                         max_features=79, max_leaf_nodes=None, min_impurity_decrease=0.0,
                                         min_impurity_split=None, min_samples_leaf=3,
                                         min_samples_split=2, min_weight_fraction_leaf=0.0,
                                         n_estimators=4, n_jobs=1, oob_score=False, random_state=None,
                                         verbose=0, warm_start=False)
        else:
            return RandomForestRegressor(bootstrap=True, criterion='mse', max_depth=40,
                                         max_features=55, max_leaf_nodes=None, min_impurity_decrease=0.0,
                                         min_impurity_split=None, min_samples_leaf=3,
                                         min_samples_split=2, min_weight_fraction_leaf=0.0,
                                         n_estimators=14, n_jobs=1, oob_score=False, random_state=None,
                                         verbose=0, warm_start=False)

