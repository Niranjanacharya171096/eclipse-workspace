package com.corejava;

class MultiplyFun2 { 
  //Method with 2 parameter
  static int Multiply(int a, int b) { 
    return a * b; 
  } 
  
  //Method with the same name but 3 parameter
  static int Multiply(int a, int b, int c) { 
    return a * b * c; 
  } 
} 

class chapter47_Polymorphism_MethodOverloading2 { 
  public static void main(String[] args) {   
    System.out.println(MultiplyFun2.Multiply(2, 4)); 
    System.out.println(MultiplyFun2.Multiply(5, 6, 3)); 
  } 
} 