package org.learning.ood;

public interface ITerm {
  IUnificationResult unify(ITerm secondTerm);

  IUnificationResult unify(IPredicate iPredicate);

  IUnificationResult unify(IConstant iConstant);
}
