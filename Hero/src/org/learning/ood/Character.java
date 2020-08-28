package org.learning.ood;

public abstract class Character implements Attacker, Defender {
  private int healthPoints;
  private int strengthPoints;
  private int defensePoints;
  private int speedPoints;
  private int luckPoints;
  private int turns = 20;

  public Character(int health, int strength, int defense, int speed, int luck) {
    healthPoints = health;
    strengthPoints = strength;
    defensePoints = defense;
    speedPoints = speed;
    luckPoints = luck;
  }

  public int getHealthPoints() {
    return healthPoints;
  }

  public int getStrengthPoints() {
    return strengthPoints;
  }

  public int getDefensePoints() {
    return defensePoints;
  }

  public int getSpeedPoints() {
    return speedPoints;
  }

  public int getLuckPoints() {
    return luckPoints;
  }

  public int getTurns() {
    return turns;
  }

  public void setTurns(int turns) {
    this.turns = turns;
  }

  public int isAlive() {
    return healthPoints != 0 ? 1 : 0;
  }

  public void attack(Character defender) {
    int damage = strengthPoints - defender.getDefensePoints();
    takeDamage(damage);
  }

  public void takeDamage(int damage) {
    if (healthPoints - damage > 0) {
      healthPoints = healthPoints - damage;
    } else {
      healthPoints = 0;
    }
  }

}
