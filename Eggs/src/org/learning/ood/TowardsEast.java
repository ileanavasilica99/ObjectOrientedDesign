package org.learning.ood;

public class TowardsEast extends  Actions implements MovementStateRole {
  private PositionRole position;
  private MovementStateRole nextState;

  @Override
  public void changePosition() {
    position.moveEast();
  }

  public boolean isInitialState() {
    return position.isOnSouthBorder();
  }

  @Override
  public MovementStateRole next() {
    return nextState;
  }
}
