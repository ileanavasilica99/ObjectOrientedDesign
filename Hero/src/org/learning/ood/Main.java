package org.learning.ood;

public class Main {

  public static void main(String[] args) {

    RandGenerator rand = new RandGenerator();
    Character hero =
        new Hero("Orderus", rand.generateRandom(70, 100), rand.generateRandom(70, 80), rand.generateRandom(45, 55),
            rand.generateRandom(40, 50), rand.generateRandom(10, 30), true, false);
    Character monster =
        new Monster(rand.generateRandom(60, 90), rand.generateRandom(60, 90), rand.generateRandom(40, 60),
            rand.generateRandom(40, 60), rand.generateRandom(25, 40));

    System.out.println(hero.toString());
    System.out.println(monster.toString());
    System.out.println();

    int turns = 20;
    while (hero.isAlive() == 1 || monster.isAlive() == 1) {
      if (turns != 0) {
        if (hero.getSpeedPoints() > monster.getSpeedPoints()) {
          System.out.println("--------------------------Hero star--------------------------");
          System.out.println("-> Hero attack <-");
          hero.attack(monster);
          System.out.println(hero.toString());
          System.out.println();
          turns--;
          System.out.println("Number of battles left: " + turns);

          System.out.println("-> Monster attack <-");
          monster.attack(hero);
          System.out.println(monster.toString());
          turns--;
          System.out.println("Number of battles left: " + turns);

        } else {
          System.out.println("--------------------------Monster start--------------------------");
          System.out.println("-> Monster attack <-");
          monster.attack(hero);
          System.out.println(monster.toString());
          turns--;
          System.out.println("Number of battles left: " + turns);

          System.out.println("-> Hero attack <-");
          hero.attack(monster);
          System.out.println(hero.toString());
          turns--;
          System.out.println("Number of battles left: " + turns);
        }
      } else {
        System.out.println("Number of battles is zero");
      }
    }

    if (hero.isAlive() == 1) {
      System.out.println(".........................Monster wons.........................");
    } else {
      System.out.println(".........................Hero wons.........................!");
    }
  }
}

