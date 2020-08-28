package org.learning.ood;

public class Hero extends Character {
  private String name;
  private boolean rapidStrike;
  private boolean magicShield;

  public Hero(String firstName, int health, int strength, int defense, int speed, int luck, boolean rapidS,
      boolean magicS) {
    super(health, strength, defense, speed, luck);
    name = firstName;
    rapidStrike = rapidS;
    magicShield = magicS;
  }

  @Override
  public String toString() {
    return "Hero: " + name + " with health: " + getHealthPoints() + " strength: " + getStrengthPoints() + " "
        + "defense: " + getDefensePoints() + " speed : " + getSpeedPoints() + " luck : " + getLuckPoints()
        + " rapidStrike=" + rapidStrike + ", " + "magicShield=" + magicShield;
  }
}
