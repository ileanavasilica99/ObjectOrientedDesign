package org.learning.ood;

public class Actions implements Moves {
  Position position;

  @Override
  public void moveNorth() {
    position.setX(position.getX() - 1);
  }

  @Override
  public void moveEast() {
    position.setY(position.getY() + 1);
  }

  @Override
  public void moveWest() {
    position.setY(position.getY() - 1);
  }

  @Override
  public void moveSouth() {
    position.setX(position.getX() + 1);
  }
}
