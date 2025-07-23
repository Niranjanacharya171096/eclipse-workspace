package com.geeksforgeeks;

//Java program to add elements 
//to the HashMap 

import java.io.*; 
import java.util.*; 

class HashMapOperations { 
 public static void main(String args[]) { 
     // No need to mention the 
     // Generic type twice 
     HashMap<Integer, String> hm1 = new HashMap<>(); 

     // Initialization of a HashMap 
     // using Generics 
     HashMap<Integer, String> hm2 = new HashMap<Integer, String>(); 

     // Add Elements using put method 
     hm1.put(1, "Geeks"); 
     hm1.put(2, "For"); 
     hm1.put(3, "Geeks"); 

     hm2.put(1, "Geeks"); 
     hm2.put(2, "For"); 
     hm2.put(3, "Geeks"); 

     System.out.println("Mappings of HashMap hm1 are: " + hm1); 
     System.out.println("Mapping of HashMap hm2 are: " + hm2); 
//Java program to change 
//elements of HashMap 
     // Initialization of a HashMap 
     HashMap<Integer, String> hm3 = new HashMap<Integer, String>(); 

     // Change Value using put method 
     hm3.put(1, "Geeks"); 
     hm3.put(2, "Geeks"); 
     hm3.put(3, "Geeks"); 

     System.out.println("Initial Map " + hm3); 
     hm3.put(2, "For"); 
     System.out.println("Updated Map " + hm3); 
//Java program to remove 
//elements from HashMap 
     // Initialization of a HashMap 
     Map<Integer, String> hm4 = new HashMap<Integer, String>(); 

     // Add elements using put method 
     hm4.put(1, "Geeks"); 
     hm4.put(2, "For"); 
     hm4.put(3, "Geeks"); 
     hm4.put(4, "For"); 

     // Initial HashMap 
     System.out.println("Mappings of HashMap are: " + hm4); 

     // remove element with a key 
     // using remove method 
     hm4.remove(4); 

     // Final HashMap 
     System.out.println("Mappings after removal are: " + hm4); 
  // Java program to traversal a 
  // Java.util.HashMap 
     // initialize a HashMap 
     HashMap<String, Integer> hm5 = new HashMap<>(); 

     // Add elements using put method 
     hm5.put("vishal", 10); 
     hm5.put("sachin", 30); 
     hm5.put("vaibhav", 20); 

     // Iterate the hm5 using 
     // for-each loop 
     for (Map.Entry<String, Integer> e: hm5.entrySet()) 
         System.out.println("Key: " + e.getKey() + " Value: " + e.getValue()); 
 } 
}
