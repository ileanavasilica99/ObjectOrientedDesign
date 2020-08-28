package org.learning.ood;

public class Triangle implements Shape {
  private double side;
  private double height;

  public Triangle(double edge, double altitude) {
    side = edge;
    height = altitude;
  }

  @Override
  public String toString() {
    return "Triangle{" + "side=" + side + ", height=" + height + '}';
  }

  @Override
  public double calculateArea() {
    return side * height / 2;
  }
}
