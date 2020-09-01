package org.learning.ood;

public class Rabbit implements RabbitRole {
  private MovementStateRole movementState;
  private PositionRole position;
  private int eggs;

  @Override
  public void move() {
    movementState.changePosition();
    position.visit(this);
  }

  @Override
  public void addEgg() {
    this.eggs++;
    movementState = movementState.next();
  }
}
