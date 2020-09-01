package org.learning.ood;

public class TowardsWest implements MovementStateRole{
  private PositionRole position;
  private MovementStateRole nextState;

  @Override
  public void changePosition() {
    position.moveWest();

  }

  public boolean isInitialState() {
    return position.isOnSouthBorder();
  }

  @Override
  public MovementStateRole next() {
    return nextState;
  }
}
