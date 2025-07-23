package com.geeksforgeeks;

//Java program to demonstrate the 
//working of a LinkedHashSet 

import java.util.*; 

public class LinkedHashSetEx { 
 public static void main(String args[]) { 
     System.out.println("\n\t----LinkedHashSet EX1----\n"); 

	 // Creating LinkedHashSet and 
     // adding elements 
     LinkedHashSet<String> lhs = new LinkedHashSet<String>(); 

     lhs.add("Geeks"); 
     lhs.add("For"); 
     lhs.add("Geeks"); 
     lhs.add("Is"); 
     lhs.add("Very helpful"); 

     System.out.println(lhs); 
     
     // Traversing elements 
     Iterator<String> itr = lhs.iterator(); 
     
     while (itr.hasNext()) { 
         System.out.println(itr.next()); 
     } 
     
     System.out.println("\n\t----LinkedHashSet EX2----\n"); 
     LinkedHashSet<String> linkedset = new LinkedHashSet<String>();   
     
     // Adding element to LinkedHashSet   
     linkedset.add("A");   
     linkedset.add("B");   
     linkedset.add("C");   
     linkedset.add("D");  

     // This will not add new element as A already exists  
     linkedset.add("A");  
     linkedset.add("E");   

     System.out.println("Size of LinkedHashSet = " + linkedset.size());   
     System.out.println("Original LinkedHashSet:" + linkedset);   
     System.out.println("Removing D from LinkedHashSet: " + linkedset.remove("D"));   
     System.out.println("Trying to Remove Z which is not " + "present: " + linkedset.remove("Z"));   
     System.out.println("Checking if A is present=" + linkedset.contains("A")); 
     System.out.println("Updated LinkedHashSet: " + linkedset);   
 } 
} 
