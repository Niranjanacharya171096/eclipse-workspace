package com.geeksforgeeks;

//Java program to demonstrate the 
//working of a HashSet 

import java.util.*; 

public class HashSetEx { 
	 public static void main(String args[]) { 
         System.out.println("\n\t----HashSet EX1----\n");
	     // Creating HashSet and 
	     // adding elements 
	     HashSet<String> hs = new HashSet<String>(); 
	
	     hs.add("Geeks"); 
	     hs.add("For"); 
	     hs.add("Geeks"); 
	     hs.add("Is"); 
	     hs.add("Very helpful"); 
	
         System.out.println(hs);
         
	     // Traversing elements 
	     Iterator<String> itr = hs.iterator(); 
	     
	     while (itr.hasNext()) { 
	         System.out.println(itr.next()); 
	     } 

	    System.out.println("\n\t----HashSet EX2----\n");

        HashSet<String> h = new HashSet<String>(); 
        
        // Adding elements into HashSet usind add() 
        h.add("India"); 
        h.add("Australia"); 
        h.add("South Africa"); 
        h.add("India"); // adding duplicate elements 
  
        // Displaying the HashSet 
        System.out.println(h); 
        System.out.println("List contains India or not:" + h.contains("India")); 
  
        // Removing items from HashSet using remove() 
        h.remove("Australia"); 
        System.out.println("List after removing Australia:" + h); 
  
        // Iterating over hash set items 
        System.out.println("Iterating over list:"); 
        Iterator<String> i = h.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 

	 } 
} 
