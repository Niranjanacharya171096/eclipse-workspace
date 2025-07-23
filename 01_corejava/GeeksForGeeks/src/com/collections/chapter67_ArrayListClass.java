package com.collections;

import java.io.*;   
import java.util.*;
import java.util.List; 

class chapter67_ArrayListClass { 
  public static void main(String[] args) { 
//creation of list object using the ArrayList class 
    System.out.println("\t----ArrayList----"); 
    // Size of ArrayList 
    int alSize = 5; 
    
    // Declaring the List with initial size n 
    List<Integer> aList = new ArrayList<Integer>(alSize); 
    
    // Appending the new elements at the end of the list 
    for (int i = 1; i <= alSize; i++) 
      aList.add(i); 
    
    // Printing elements 
    System.out.println("Initial ArrayList: " + aList); 
    
    // Remove element at index 3 
    aList.remove(3); 

    // Displaying the list after deletion 
    System.out.println("ArrayList(-3): " + aList); 

    // Printing elements one by one 
    System.out.print("Final ArrayList: "); 
    for (int i = 0; i < aList.size(); i++) 
      System.out.print(aList.get(i) + " "); 
  } 
} 
