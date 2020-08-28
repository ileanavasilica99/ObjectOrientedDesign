package org.learning.ood;

import java.util.ArrayList;
import java.util.List;

public class Actions {
  private List<Integer> arr;

  public Actions(List<Integer> arr) {
    this.arr = arr;
  }

  public void doAction() {
    int index = 0;
    int size = arr.size();
    while (size != 0) {
      if (arr.get(index) == 1) {
        ReadCommand command1 = new ReadCommand(index, arr);
        System.out.println("Read command: " + command1.action());
        index = index + 2;
        size = size - 2;
        continue;
      }
      if (arr.get(index) == 2) {
        ReverseCommand command2 = new ReverseCommand(arr.get(index + 1), arr.get(index + 2));
        System.out.println("Reverse command: " + command2.action());
        index = index + 3;
        size = size - 3;
        continue;
      }
      if (arr.get(index) == 3) {
        SumCommand command3 = new SumCommand(arr.get(index + 1), arr.get(index + 2), arr.get(index + 3));
        System.out.println("Sum command: " + command3.action());
        index = index + 4;
        size = size - 4;
        continue;
      }
    }
  }
}

