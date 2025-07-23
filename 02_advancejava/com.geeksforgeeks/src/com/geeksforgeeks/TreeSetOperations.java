package com.geeksforgeeks;

//Java code to demonstrate 
//the working of TreeSet 

import java.util.*; 

class TreeSetOperations { 
 public static void main(String[] args) { 
     TreeSet<String> ts1 = new TreeSet<String>(); 

     // Elements are added using add() method 
     ts1.add("Geek"); 
     ts1.add("For"); 
     ts1.add("Geeks"); 

     System.out.println(ts1); 
     
     TreeSet<String> ts2 = new TreeSet<String>(); 
     
     // Elements are added using add() method 
     ts2.add("Geeks"); 
     ts2.add("For"); 
     ts2.add("Geeks"); 

     System.out.println("Tree Set: " + ts2); 

     String check = "Geeks"; 

     // Check if the above string exists in 
     // the treeset or not 
     System.out.println("Contains " + check + ": " + ts2.contains(check)); 

     // Print the first element in 
     // the TreeSet 
     System.out.println("First Value: " + ts2.first()); 

     // Print the last element in 
     // the TreeSet 
     System.out.println("Last Value: " + ts2.last()); 

     String val = "I"; 

     // Find the values just greater 
     // and smaller than the above string 
     System.out.println("Higher(I): " + ts2.higher(val)); 
     System.out.println("Lower(I): " + ts2.lower(val)); 

     TreeSet<String> ts3 = new TreeSet<String>(); 
     
     // Elements are added using add() method 
     ts3.add("Geek"); 
     ts3.add("For"); 
     ts3.add("Geeks"); 
     ts3.add("A"); 
     ts3.add("B"); 
     ts3.add("Z"); 

     System.out.println("Initial TreeSet: " + ts3); 

     // Removing the element b 
     ts3.remove("B"); 

     System.out.println("After removing B: " + ts3); 

     // Removing the first element 
     ts3.pollFirst(); 

     System.out.println("After removing first: " + ts3); 

     // Removing the last element 
     ts3.pollLast(); 

     System.out.println("After removing last: " + ts3); 

     TreeSet<String> ts4 = new TreeSet<String>(); 
     
     // Elements are added using add() method 
     ts4.add("Geek"); 
     ts4.add("For"); 
     ts4.add("Geeks"); 
     ts4.add("A"); 
     ts4.add("B"); 
     ts4.add("Z"); 

     // Iterating though the TreeSet 
     for (String value: ts4) 
         System.out.print(value + ", "); 
     System.out.println(); 
 } 
} 
