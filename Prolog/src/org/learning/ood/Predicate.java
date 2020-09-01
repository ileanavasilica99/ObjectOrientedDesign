package org.learning.ood;

import java.util.List;

public class Predicate implements IPredicate {
  private String name;
  private List<ITerm> parameters;
  private IResultFactory resultFactory;
  private IPredicate predicate;

  public Predicate(String firstname, List<ITerm> terms) {
    name = firstname;
    parameters = terms;
  }

  @Override
  public String toString() {
    return  name + parameters;
  }

  public IUnificationResult unify(IPredicate predicate) {
    if (predicate.hasSameName(name)) {
      return predicate.unifies(parameters);
    }
    return resultFactory.buildNegativeResponse();
  }

  @Override
  public boolean hasSameName(String name) {

    return this.name.equals(name);
  }

  @Override
  public IUnificationResult unifies(List<ITerm> otherParameters) {

    if (parameters.size() != otherParameters.size()) {
      return resultFactory.buildNegativeResponse();
    }

    IUnificationResult result = resultFactory.build();

    for (int index = 0; index < parameters.size(); index++) {

      ITerm firstTerm = parameters.get(index);
      ITerm secondTerm = otherParameters.get(index);

      firstTerm = result.applySubstitutions(firstTerm);
      secondTerm = result.applySubstitutions(secondTerm);

      IUnificationResult partialResult = firstTerm.unify(secondTerm);

      if (partialResult.isPositive()) {
        result.add(partialResult);
      } else {
        return resultFactory.buildNegativeResponse();
      }
    }

    return result;
  }

  @Override
  public IUnificationResult unify(ITerm secondTerm) {

    return secondTerm.unify(predicate);
  }

  @Override
  public IUnificationResult unify(IConstant iConstant) {

    return iConstant.unify(predicate);
  }
}
