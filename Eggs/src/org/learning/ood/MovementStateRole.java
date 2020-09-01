package org.learning.ood;

public interface MovementStateRole {
  void changePosition();

  MovementStateRole next();
}
