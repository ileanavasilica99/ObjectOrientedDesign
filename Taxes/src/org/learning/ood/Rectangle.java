package org.learning.ood;

public class Rectangle implements Shape {
  private double length;
  private double width;

  @Override
  public String toString() {
    return "Rectangle{" + "length=" + length + ", width=" + width + '}';
  }

  public Rectangle(double edge1, double edge2) {
    length = edge1;
    width = edge2;
  }

  @Override
  public double calculateArea() {
    return length * width;
  }
}
