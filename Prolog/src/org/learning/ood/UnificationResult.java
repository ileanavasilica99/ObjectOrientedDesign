package org.learning.ood;

public class UnificationResult implements IUnificationResult {
  IPredicate predicate1;
  IPredicate predicate2;

  public UnificationResult(IPredicate pred1, IPredicate pred2) {
    predicate1 = pred1;
    predicate2 = pred2;
  }

  @Override
  public ITerm applySubstitutions(ITerm firstTerm) {
    return null;
  }

  @Override
  public boolean isPositive() {
    return false;
  }

  @Override
  public void add(IUnificationResult partialResult) {

  }
}
