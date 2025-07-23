package com.collections;

import java.io.*; 
import java.util.*; 

class chapter82_HashMapClass_Operations { 
  public static void main(String args[]) { 
    // No need to mention the Generic type twice 
    HashMap<Integer, String> hMap1 = new HashMap<>(); 
    
    // Initialization of a HashMap using Generics 
    HashMap<Integer, String> hMap2 = new HashMap<Integer, String>(); 
    
    // Add Elements using put method 
    hMap1.put(1, "Geeks"); 
    hMap1.put(2, "For"); 
    hMap1.put(3, "Geeks"); 
    
    hMap2.put(1, "Geeks"); 
    hMap2.put(2, "For"); 
    hMap2.put(3, "Geeks"); 

    System.out.println("Mappings of HashMap hMap1 are: " + hMap1); 
    System.out.println("Mapping of HashMap hMap2 are: " + hMap2); 
//Java program to change elements of HashMap 
    // Initialization of a HashMap 
    HashMap<Integer, String> hMap3 = new HashMap<Integer, String>(); 
  
    // Change Value using put method 
    hMap3.put(1, "Geeks"); 
    hMap3.put(2, "Geeks"); 
    hMap3.put(3, "Geeks"); 
  
    System.out.println("Initial Map " + hMap3); 
    hMap3.put(2, "For"); 
    System.out.println("Updated Map " + hMap3); 
//Java program to remove elements from HashMap 
    // Initialization of a HashMap 
    Map<Integer, String> hMap4 = new HashMap<Integer, String>(); 
    
    // Add elements using put method 
    hMap4.put(1, "Geeks"); 
    hMap4.put(2, "For"); 
    hMap4.put(3, "Geeks"); 
    hMap4.put(4, "For"); 

    // Initial HashMap 
    System.out.println("Mappings of HashMap are: " + hMap4); 
    
    // remove element with a key 
    // using remove method 
    hMap4.remove(4); 
    
    // Final HashMap 
    System.out.println("Mappings after removal are: " + hMap4); 
//Java program to traversal a HashMap 
    // initialize a HashMap 
    HashMap<String, Integer> hMap5 = new HashMap<>(); 
    
    // Add elements using put method 
    hMap5.put("vishal", 10); 
    hMap5.put("sachin", 30); 
    hMap5.put("vaibhav", 20); 

    // Iterate the hMap5 using for-each loop 
    for (Map.Entry<String, Integer> e: hMap5.entrySet()) 
      System.out.println("Key: " + e.getKey() + " Value: " + e.getValue()); 
  } 
}
