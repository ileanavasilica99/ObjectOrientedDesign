package org.learning.ood;

public class TowardsSouth implements MovementStateRole {
  private PositionRole position;
  private MovementStateRole nextState;

  @Override
  public void changePosition() {
    position.moveSouth();

  }

  public boolean isInitialState() {
    return position.isOnSouthBorder();
  }

  @Override
  public MovementStateRole next() {
    return nextState;
  }
}
