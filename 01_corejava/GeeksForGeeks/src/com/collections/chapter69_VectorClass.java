package com.collections;

import java.io.*;  
import java.util.*; 

class chapter69_VectorClass { 
  public static void main(String[] args) { 
    System.out.println("\n\t----Vector----"); 
     
    // Size of the Vector 
    int vSize = 5; 
     
    // Declaring the Vector with initial size vSize 
    Vector<Integer> vec = new Vector<Integer>(vSize); 

    System.out.println("Before adding elements" + vec); 
    // Appending new elements at the end of the vector 
    for (int i = 1; i <= vSize; i++) 
      vec.add(i); 

    // Printing elements 
    System.out.println("After adding elements" + vec); 

    // Remove element at index 3 
    vec.remove(3); 
    
    // Displaying the vector after deletion 
    System.out.println("After removing index 3 element" + vec); 

    // Printing elements one by one 
    for (int i = 0; i < vec.size(); i++) 
      System.out.print(vec.get(i) + " "); 
  } 
} 
