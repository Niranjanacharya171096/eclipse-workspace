package com.geeksforgeeks;

//Java program to demonstrate 
//adding elements to Hashtable 

import java.io.*; 
import java.util.*; 

class HashTableOperations { 
 public static void main(String args[]) { 
     // No need to mention the 
     // Generic type twice 
     Hashtable<Integer, String> ht1 = new Hashtable<>(); 

     // Initialization of a Hashtable 
     // using Generics 
     Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(); 

     // Inserting the Elements 
       // using put() method 
     ht1.put(1, "Geeks"); 
     ht1.put(2, "For"); 
     ht1.put(3, "Geeks"); 
     
     ht2.put(1, "Geeks"); 
     ht2.put(2, "For"); 
     ht2.put(3, "Geeks"); 
       
       // Print mappings to the console 
     System.out.println("Mappings of ht1: " + ht1); 
     System.out.println("Mappings of ht2: " + ht2); 

     // Initialization of a Hashtable 
     Hashtable<Integer, String> ht3 = new Hashtable<Integer, String>(); 

     // Inserting the Elements 
       // using put method 
     ht3.put(1, "Geeks"); 
     ht3.put(2, "Geeks"); 
     ht3.put(3, "Geeks"); 
       
       // print initial map to the console 
     System.out.println("Initial Map ht3: " + ht3); 
       
       // Update the value at key 2 
     ht3.put(2, "For"); 
       
       // print the updated map 
     System.out.println("Updated Map ht3: " + ht3); 

     // Initialization of a Hashtable 
     Map<Integer, String> ht4 = new Hashtable<Integer, String>(); 

     // Inserting the Elements 
       // using put method 
     ht4.put(1, "Geeks"); 
     ht4.put(2, "For"); 
     ht4.put(3, "Geeks"); 
     ht4.put(4, "For"); 

     // Initial HashMap 
     System.out.println("Initial map ht4: " + ht4); 

       // Remove the map entry with key 4 
     ht4.remove(4); 

     // Final Hashtable 
     System.out.println("Updated map ht4: " + ht4); 

       // Create an instance of Hashtable 
     Hashtable<String, Integer> ht5 = new Hashtable<>(); 

       // Adding elements using put method 
     ht5.put("vishal", 10); 
     ht5.put("sachin", 30); 
     ht5.put("vaibhav", 20); 
   
       // Iterating using enhanced for loop 
     for (Map.Entry<String, Integer> e: ht5.entrySet()) 
         System.out.println(e.getKey() + " " + e.getValue()); 
 } 
}
