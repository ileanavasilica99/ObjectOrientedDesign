package org.learning.ood;

import java.util.Random;

public class RandGenerator {

  public int generateRandom(int min , int max){
    Random rand = new Random();
    return rand.nextInt((max-min)+ 1) + min;
  }
}
