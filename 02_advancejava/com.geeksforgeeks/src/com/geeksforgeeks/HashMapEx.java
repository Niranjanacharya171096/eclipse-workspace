package com.geeksforgeeks;

//Java program to demonstrate the 
//working of a HashMap 

import java.util.*; 

public class HashMapEx { 
 public static void main(String args[]) { 

	 // Creating HashMap and 
     // adding elements 
     System.out.println("\n\t----HashMap EX1----\n"); 
     
     HashMap<Integer, String> hm = new HashMap<Integer, String>(); 

     hm.put(1, "Geeks"); 
     hm.put(2, "For"); 
     hm.put(3, "Geeks"); 

     // Finding the value for a key 
     System.out.println("Value for 1 is " + hm.get(1)); 
     
     System.out.println(hm); 

     // Traversing through the HashMap 
     for (Map.Entry<Integer, String> e: hm.entrySet()) 
         System.out.println(e.getKey() + " " + e.getValue()); 
     
     // Create an empty hash map 
     System.out.println("\n\t----HashMap EX2----\n"); 
     HashMap<String, Integer> map = new HashMap<>(); 

     // Add elements to the map 
     map.put("vishal", 10); 
     map.put("sachin", 30); 
     map.put("vaibhav", 20); 

     System.out.println(map); 
     // Print size and content 
     System.out.println("Size of map is: " + map.size()); 

     // Check if a key is present and if 
     // present, print value 
     if (map.containsKey("vishal")) { 
         Integer a = map.get("vishal"); 
         System.out.println("value for key" + " \"vishal\" is: " + a); 
     } 
 } 
} 