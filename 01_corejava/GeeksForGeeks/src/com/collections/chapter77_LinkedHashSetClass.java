package com.collections;

//Java program to demonstrate the 
//working of a LinkedHashSet 

import java.util.*; 

public class chapter77_LinkedHashSetClass { 
  public static void main(String args[]) { 
    System.out.println("\n\t----LinkedHashSet EX1----\n"); 

    // Creating LinkedHashSet and adding elements 
    LinkedHashSet<String> lhSet1 = new LinkedHashSet<String>(); 

    lhSet1.add("Geeks"); 
    lhSet1.add("For"); 
    lhSet1.add("Geeks"); 
    lhSet1.add("Is"); 
    lhSet1.add("helpful"); 

    System.out.println(lhSet1); 
    
    // Traversing elements 
    Iterator<String> itr = lhSet1.iterator(); 
    
    while (itr.hasNext()) { 
      System.out.println(itr.next()); 
    }   
     
    System.out.println("\n\t----LinkedHashSet EX2----\n"); 
    LinkedHashSet<String> lhSet2 = new LinkedHashSet<String>();   
    
    // Adding element to LinkedHashSet   
    lhSet2.add("A");   
    lhSet2.add("B");   
    lhSet2.add("C");   
    lhSet2.add("D");  
    
    // This will not add new element as A already exists  
    lhSet2.add("A");  
    lhSet2.add("E");   

    System.out.println("Size of LinkedHashSet = " + lhSet2.size());   
    System.out.println("Original LinkedHashSet:" + lhSet2);   
    System.out.println("Removing D from LinkedHashSet: " + lhSet2.remove("D"));   
    System.out.println("Trying to Remove Z which is not " + "present: " + lhSet2.remove("Z"));   
    System.out.println("Checking if A is present=" + lhSet2.contains("A")); 
    System.out.println("Updated LinkedHashSet: " + lhSet2);   
  } 
} 
