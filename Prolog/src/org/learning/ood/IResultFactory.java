package org.learning.ood;

public interface IResultFactory {
  IUnificationResult buildNegativeResponse();

  IUnificationResult build();

  IUnificationResult build(IVariable iVariable, ITerm secondTerm);

}
