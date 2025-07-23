package com.corejava;

import java.io.*;

class Addition3 {
  // adding three integer values.
  public int add(int a, int b, int c) {
    int sum = a + b + c;
    return sum;
  } 
  // adding three double values.
  public double add(double a, double b, double c) {
    double sum = a + b + c;
    return sum;
  }
}

class chapter37_MethodOverloading_DataTypesOfParameters {
  public static void main(String[] args) {
    Addition3 ob = new Addition3();
    
    int sum2 = ob.add(1, 2, 3);
    System.out.println("sum of the three integer value:" + sum2);
    
    double sum3 = ob.add(1.0, 2.0, 3.0);
    System.out.println("sum of the three double value:" + sum3);
  }
}
