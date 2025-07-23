package com.corejava;

import java.io.*;

class Addition2 {
  // adding two integer values.
  public int add(int a, int b) {
    int sum = a + b;
    return sum;
  } 
  // adding three integer values.
  public int add(int a, int b, int c) {
    int sum = a + b + c;
    return sum;
  }
}

class chapter37_MethodOverloading_noOfParameters {
  public static void main(String[] args) {
    Addition2 ob = new Addition2();
    
    int sum1 = ob.add(1, 2);
    System.out.println("sum of the two integer value:" + sum1);
    
    int sum2 = ob.add(1, 2, 3);
    System.out.println("sum of the three integer value:" + sum2);
  }
}
