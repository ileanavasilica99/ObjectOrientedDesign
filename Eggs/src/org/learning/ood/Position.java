package org.learning.ood;

public class Position {
  private int x;
  private int y;
  private LawnRole lawn;

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void visit(RabbitRole rabbit) {
    lawn.visit(rabbit, x, y);

  }

  public void moveNorth() {
    x++;
  }

  public boolean isOnSouthBorder() {
    if (this.x == 0) {
      return true;
    }
    return false;
  }
}
