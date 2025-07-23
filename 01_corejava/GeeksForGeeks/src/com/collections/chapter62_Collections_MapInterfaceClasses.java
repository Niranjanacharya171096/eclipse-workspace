package com.collections;

import java.util.*; 

class HashMapEx1 {
  public void HashMapFunc() {
    System.out.print("\n\t----HashMap Class----\n"); 
    HashMap<Integer, String> hMap = new HashMap<Integer, String>(); 
    System.out.println("Initial HashMap: "+hMap); 

    hMap.put(1, "Geeks"); 
    hMap.put(2, "For"); 
    hMap.put(3, "Geeks"); 
    System.out.println("After adding elements: "+hMap); 

    // Finding the value for a key 
    System.out.println("Value for 1 is " + hMap.get(1)); 
    
    System.out.println("Iterating using for loop: "+hMap); 
  
    // Traversing through the HashMap 
    for (Map.Entry<Integer, String> e: hMap.entrySet()) 
        System.out.println(e.getKey() + " " + e.getValue()); 
  }
}

public class chapter62_Collections_MapInterfaceClasses { 
  public static void main(String args[]) { 
    System.out.print("\t----Map Interface Classes----\n"); 
    
    HashMapEx1 hm = new HashMapEx1();
    hm.HashMapFunc();
  }   
}