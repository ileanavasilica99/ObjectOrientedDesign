package org.learning.ood;

public class Variable implements IVariable, ITerm {
  public String name;
  private IResultFactory resultFactory;
  private IVariable variable;

  public Variable(String firstname) {
    name = firstname;
  }

  @Override
  public String toString() {
    return name;
  }

  @Override
  public IUnificationResult unify(ITerm secondTerm) {

    return resultFactory.build(variable, secondTerm);
  }

  @Override
  public IUnificationResult unify(IPredicate iPredicate) {

    return unify((ITerm) iPredicate);
  }

  @Override
  public IUnificationResult unify(IConstant iConstant) {

    return this.unify((ITerm) iConstant);
  }
}
