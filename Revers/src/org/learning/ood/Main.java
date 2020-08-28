package org.learning.ood;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    List<Integer> arr = new ArrayList<>();
    File file = new File();
    System.out.println("The content of the input file is: " + file.readFile());

    for (int index = 0; index < file.getArray().size(); index++) {
      arr.add(file.getArray().get(index));
    }

    Actions actions = new Actions(arr);
    actions.doAction();

  }
}
