package com.collections;

import java.util.HashMap; 

public class chapter82_HashMapClass { 
  public static void main(String[] args) { 
    // Create an empty hash hMap 
    HashMap<String, Integer> hMap = new HashMap<>(); 

    // Add elements to the hMap 
    hMap.put("vishal", 10); 
    hMap.put("sachin", 30); 
    hMap.put("vaibhav", 20); 

    // Print size and content 
    System.out.println("Size of hMap is:- " + hMap.size()); 
    System.out.println(hMap); 

    // Check if a key is present and if present, print value 
    if (hMap.containsKey("vishal")) { 
      Integer a = hMap.get("vishal"); 
      System.out.println("value for key" + " \"vishal\" is:- " + a); 
    } 
  } 
}
