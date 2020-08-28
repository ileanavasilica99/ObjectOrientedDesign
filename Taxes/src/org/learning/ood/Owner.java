package org.learning.ood;

import java.util.List;

public class Owner implements Person {
  private String name;
  private List<Shape> lands;
  private int tax;

  public Owner(String firstName, int rate, List<Shape> shapes) {
    name = firstName;
    tax = rate;
    lands = shapes;
  }

  @Override
  public double calculateTotalAreas() {
    double totalArea = 0;
    for (Shape s : lands) {
      totalArea = totalArea + s.calculateArea();
    }
    return totalArea;
  }

  @Override
  public double calculateTotalTexes() {
    double totalTaxes = 0;
    totalTaxes = totalTaxes + calculateTotalAreas() * tax;

    return totalTaxes;
  }

  @Override
  public String printTotalRate() {
    return "The owner " + name + " has " + String.format("%.4f", calculateTotalAreas()) + " square meters, so the"
        + " taxes are: " + String.format("%.4f", calculateTotalTexes()) + " for the whole surface";

  }
}
