package org.learning.ood;

public class Circle implements Shape {
  private double radius;
  final float pi = 3.14f;

  @Override
  public String toString() {
    return "Circle{" + "radius=" + radius + '}';
  }

  public Circle(double diameter) {
    radius = diameter;
  }

  @Override
  public double calculateArea() {
    return pi * radius * radius;
  }
}
