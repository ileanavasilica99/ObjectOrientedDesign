package org.learning.ood;

public class TowardsNorth implements MovementStateRole {
  private PositionRole position;
  private MovementStateRole nextState;

  @Override
  public void changePosition() {
    position.moveNorth();

  }

  public boolean isInitialState() {
    return position.isOnSouthBorder();
  }

  @Override
  public MovementStateRole next() {
    return nextState;
  }
}
