package com.collections;

import java.util.*; 

public class chapter76_HashSetClass { 
  public static void main(String args[]) { 
    System.out.println("\n\t----HashSet EX1----\n");
    // Creating HashSet and adding elements 
    HashSet<String> hSet1 = new HashSet<String>(); 
    
    hSet1.add("Geeks"); 
    hSet1.add("For"); 
    hSet1.add("Geeks"); 
    hSet1.add("Is"); 
    hSet1.add("Very helpful"); 
    
    System.out.println(hSet1);
    
    // Traversing elements 
    Iterator<String> itr = hSet1.iterator(); 
       
    while (itr.hasNext()) { 
      System.out.println(itr.next()); 
    } 

    System.out.println("\n\t----HashSet EX2----\n");
    
    HashSet<String> hSet2 = new HashSet<String>(); 
    
    // Adding elements into HashSet usind add() 
    hSet2.add("India"); 
    hSet2.add("Australia"); 
    hSet2.add("South Africa"); 
    hSet2.add("India"); // adding duplicate elements 
    
    // Displaying the HashSet 
    System.out.println(hSet2); 
    System.out.println("List contains India or not:" + hSet2.contains("India")); 
  
    // Removing items from HashSet using remove() 
    hSet2.remove("Australia"); 
    System.out.println("List after removing Australia:" + hSet2); 
    
    // Iterating over hash set items 
    System.out.println("Iterating over list:"); 
    Iterator<String> i = hSet2.iterator(); 
    while (i.hasNext()) 
      System.out.println(i.next());    
  }  
} 
