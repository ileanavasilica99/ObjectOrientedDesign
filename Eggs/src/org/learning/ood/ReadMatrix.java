package org.learning.ood;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadMatrix {
  private int[][] matrix;
  private int l;

  public int[][] getMatrix() {
    return matrix;
  }

  public int[][] readMatrix() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("D:\\ObjectOrientedDesign\\Eggs\\src\\org\\learning\\ood\\Input"));
    l = sc.nextInt();
    int[][] matrix = new int[l][l];
    for (int i = 0; i < l; i++) {
      for (int j = 0; j < l; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    return matrix;
  }

  public void printMatrix() throws FileNotFoundException {
    matrix = readMatrix();
    for (int i = 0; i < l; i++) {
      for (int j = 0; j < l; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }


}
