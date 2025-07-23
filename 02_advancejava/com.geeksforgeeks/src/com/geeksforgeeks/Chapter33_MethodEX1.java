package com.geeksforgeeks;

import java.io.*; 

class Addition1 {       
  int sum = 0; 
  public int addTwoInt(int a, int b){ 
    // adding two integer value. 
    sum = a + b; 
    
    //returning summation of two values. 
    return sum;  
  }       
} 

class Chapter33_MethodEX1 { 
  public static void main (String[] args) { 
    // creating an instance of Addition1 class  
    Addition1 add = new Addition1(); 
    
    // calling addTwoInt() method to add two integer 
    //using instance created in above step. 
    int s = add.addTwoInt(1,2); 
    System.out.println("Sum of two integer values:"+ s); 
  } 
} 


