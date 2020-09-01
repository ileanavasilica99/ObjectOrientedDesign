package org.learning.ood;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<ITerm> list1 = new ArrayList<>();
    System.out.println("Introduceti elementele primului predicate:");
    list1.add(new Constant("123"));
    Predicate predicate1= new Predicate("pred", list1);

    System.out.println(predicate1.toString());

    List<ITerm> list2 = new ArrayList<>();
    list2.add(new Variable("Gigel"));
    Predicate predicate2 = new Predicate("pred", list2);


  }
}
