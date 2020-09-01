package org.learning.ood;

import java.util.List;

public interface IPredicate extends ITerm {
  boolean hasSameName(String name);

  IUnificationResult unifies(List<ITerm> parameters);
}
