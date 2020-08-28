package org.learning.ood;

public class SumCommand {
  private int firstNumber;
  private int secondNumber;
  private int thirdNumber;

  public SumCommand(int firstNumber, int secondNumber, int thirdNumber) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    this.thirdNumber = thirdNumber;
  }

  public double action() {
    return (firstNumber + secondNumber + thirdNumber) / 3;
  }
}
