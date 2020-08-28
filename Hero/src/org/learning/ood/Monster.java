package org.learning.ood;

public class Monster extends Character {
  public Monster(int health, int strength, int defense, int speed, int luck) {
    super(health, strength, defense, speed, luck);
  }

  @Override
  public String toString() {
    return "Monster with health: " + getHealthPoints() + " strength: " + getStrengthPoints() + " " + "defense: "
        + getDefensePoints() + " speed : " + getSpeedPoints() + " luck : " + getLuckPoints();
  }

}
