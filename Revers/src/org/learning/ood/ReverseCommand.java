package org.learning.ood;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseCommand {
  private List<Integer> list = new LinkedList<>();
  private int firstPosition;
  private int secondPosition;

  public ReverseCommand(int fPosition, int sPosition) {
    firstPosition = fPosition;
    secondPosition = sPosition;
  }

  private void addElement() {
    for (int index = firstPosition; index <= secondPosition; index++) {
      list.add(index);
    }
  }

  public List<Integer> action() {
    addElement();
    int difference = (secondPosition - firstPosition) / 2 + 1;
    while (difference > 0) {
      Collections.swap(list, firstPosition - 1, secondPosition - 1);
      firstPosition++;
      secondPosition--;
      difference--;
    }
    return list;
  }
}

