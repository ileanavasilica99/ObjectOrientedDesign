package org.learning.ood;

import java.util.List;

public class ReadCommand {
  private int index;
  private List<Integer> list;

  public ReadCommand(int i, List<Integer> arr) {
    index = i;
    list = arr;
  }

  public Integer action() {
    return list.get(index + 1);
  }
}
