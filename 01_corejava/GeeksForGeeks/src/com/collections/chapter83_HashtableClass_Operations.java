package com.collections;

import java.io.*;  
import java.util.*; 

class chapter83_HashtableClass_Operations { 
  public static void main(String args[]) { 
    // No need to mention the Generic type twice 
    Hashtable<Integer, String> hTable1 = new Hashtable<>(); 

    // Initialization of a Hashtable 
    // using Generics 
    Hashtable<Integer, String> hTable2 = new Hashtable<Integer, String>(); 

    // Inserting the Elements 
    // using put() method 
    hTable1.put(1, "Geeks"); 
    hTable1.put(2, "For"); 
    hTable1.put(3, "Geeks"); 
    
    hTable2.put(1, "Geeks"); 
    hTable2.put(2, "For"); 
    hTable2.put(3, "Geeks"); 
    
    // Print mappings to the console 
    System.out.println("Mappings of hTable1: " + hTable1); 
    System.out.println("Mappings of hTable2: " + hTable2); 
    
    // Initialization of a Hashtable 
    Hashtable<Integer, String> hTable3 = new Hashtable<Integer, String>(); 
    
    // Inserting the Elements 
    // using put method 
    hTable3.put(1, "Geeks"); 
    hTable3.put(2, "Geeks"); 
    hTable3.put(3, "Geeks"); 
    
    // print initial map to the console 
    System.out.println("Initial Map hTable3: " + hTable3); 
      
    // Update the value at key 2 
    hTable3.put(2, "For"); 
       
    // print the updated map 
    System.out.println("Updated Map hTable3: " + hTable3); 
    
    // Initialization of a Hashtable 
    Map<Integer, String> hTable4 = new Hashtable<Integer, String>(); 
     
    // Inserting the Elements 
    // using put method 
    hTable4.put(1, "Geeks"); 
    hTable4.put(2, "For"); 
    hTable4.put(3, "Geeks"); 
    hTable4.put(4, "For"); 
    
    // Initial HashMap 
    System.out.println("Initial map hTable4: " + hTable4); 
    
    // Remove the map entry with key 4 
    hTable4.remove(4); 
    
    // Final Hashtable 
    System.out.println("Updated map hTable4: " + hTable4); 
    
    // Create an instance of Hashtable 
    Hashtable<String, Integer> hTable5 = new Hashtable<>(); 
    
    // Adding elements using put method 
    hTable5.put("vishal", 10); 
    hTable5.put("sachin", 30); 
    hTable5.put("vaibhav", 20); 
    
    // Iterating using enhanced for loop 
    for (Map.Entry<String, Integer> e: hTable5.entrySet()) 
      System.out.println(e.getKey() + " " + e.getValue()); 
  } 
}
