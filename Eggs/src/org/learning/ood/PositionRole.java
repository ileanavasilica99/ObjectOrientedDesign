package org.learning.ood;

public interface PositionRole extends Moves{
  void visit(RabbitRole rabbit);

  boolean isOnSouthBorder();
}
