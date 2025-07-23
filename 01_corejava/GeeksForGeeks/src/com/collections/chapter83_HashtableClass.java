package com.collections;

import java.util.*; 

public class chapter83_HashtableClass { 
  public static void main(String[] args) { 
    // Create an empty Hashtable 
    Hashtable<String, Integer> hTable = new Hashtable<>(); 
    
    // Add elements to the hashtable 
    hTable.put("vishal", 10); 
    hTable.put("sachin", 30); 
    hTable.put("vaibhav", 20); 

    // Print size and content 
    System.out.println("Size of map is: " + hTable.size()); 
    System.out.println(hTable); 
    
    System.out.println(hTable.containsKey("vishal"));
    // Check if a key is present and if present, print value 
    if (hTable.containsKey("vishal")) { 
      Integer a = hTable.get("vishal"); 
      System.out.println("value for key" + " \"vishal\" is: " + a); 
    } 
  } 
}
