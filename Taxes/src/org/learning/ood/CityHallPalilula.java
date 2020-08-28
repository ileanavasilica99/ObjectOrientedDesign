package org.learning.ood;

import java.util.ArrayList;
import java.util.List;

public class CityHallPalilula implements CityHall {
  private List<Person> persons = new ArrayList<>();

  public void beRegistered() {
    List<Shape> lands = new ArrayList<>();
    Shape land1 = new Rectangle(2, 2);
    Shape land2 = new Circle(3);
    Shape land3 = new Triangle(10, 2);
    lands.add(land1);
    lands.add(land2);

    Person person1 = new Owner("Georgescu Georgel", 100, lands);

    lands.clear();
    lands.add(land2);
    lands.add(land3);

    Person person2 = new Owner("Ionescu Ionel", 100, lands);

    persons.add(person1);
    persons.add(person2);
  }

  public void print() {
    for (Person p : persons)
      System.out.println(p.printTotalRate() + "\n");
  }
}
