package org.learning.ood;

public interface IUnificationResult {
  ITerm applySubstitutions(ITerm firstTerm);

  boolean isPositive();

  void add(IUnificationResult partialResult);
}
