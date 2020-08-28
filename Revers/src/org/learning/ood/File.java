package org.learning.ood;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class File {
  private List<Integer> array = new ArrayList<>();

  public List<Integer> getArray() {
    return array;
  }

  public List<Integer> readFile() throws FileNotFoundException {
    Scanner input = new Scanner(new java.io.File("D:\\ObjectOrientedDesign\\Revers\\src\\org\\learning\\ood\\Input"));
    while (input.hasNextLine()) {
      String s = input.nextLine();
      String[] token = s.split(" ");
      for (int i = 0; i < token.length; i++) {
        array.add(Integer.parseInt(token[i]));
      }
    }
    input.close();
    return array;
  }

}
