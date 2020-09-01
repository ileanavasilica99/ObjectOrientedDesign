package org.learning.ood;

public class Constant implements IConstant {
  IResultFactory resultFactory;
  private String value;
  private IConstant constant;

  public Constant(String v) {
    value = v;
  }

  @Override
  public String toString() {
    return  value ;
  }

  @Override
  public IUnificationResult unify(ITerm secondTerm) {

    return secondTerm.unify(constant);
  }

  @Override
  public IUnificationResult unify(IPredicate iPredicate) {

    return resultFactory.buildNegativeResponse();
  }

  @Override
  public IUnificationResult unify(IConstant iConstant) {
    if (iConstant.hasSameValue(value)) {
      return resultFactory.build();
    } else {
      return resultFactory.buildNegativeResponse();
    }

  }

  @Override
  public boolean hasSameValue(String value) {

    return this.value.equals(value);
  }
}
