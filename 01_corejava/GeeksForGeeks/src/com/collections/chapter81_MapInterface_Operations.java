package com.collections;

import java.util.*;

public class chapter81_MapInterface_Operations {
  public static void main(String args[]) { 
    // Default Initialization of a Map 
    Map<Integer, String> hMap1 = new HashMap<>(); 
    
    // Inserting the Elements 
    hMap1.put(1, "Geeks"); 
    hMap1.put(2, "For"); 
    hMap1.put(3, "Geeks"); 
    
    // Initialization of a Map using Generics 
    Map<Integer, String> hMap2 = new HashMap<Integer, String>(); 
    
    hMap2.put(new Integer(1), "Geeks"); 
    hMap2.put(new Integer(2), "For"); 
    hMap2.put(new Integer(3), "Geeks"); 
      
    System.out.println(hMap1); 
    System.out.println(hMap2); 
    
    // Initialization of a Map using Generics 
    Map<Integer, String> hMap3 = new HashMap<Integer, String>(); 
      
    // Inserting the Elements 
    hMap3.put(new Integer(1), "Geeks"); 
    hMap3.put(new Integer(2), "Geeks"); 
    hMap3.put(new Integer(3), "Geeks"); 
      
    System.out.println("Initial Map " + hMap3); 
    hMap3.put(new Integer(2), "For"); 
    System.out.println("Updated Map " + hMap3); 
    
    // Initialization of a Map using Generics 
    Map<Integer, String> hMap4 = new HashMap<Integer, String>(); 
    
    // Inserting the Elements 
    hMap4.put(new Integer(1), "Geeks"); 
    hMap4.put(new Integer(2), "For"); 
    hMap4.put(new Integer(3), "Geeks"); 
    hMap4.put(new Integer(4), "For"); 
    hMap4.put(new Integer(5), "For"); 
    
    // Initial Map 
    System.out.println("Before removing" + hMap4); 
    
    hMap4.remove(new Integer(4)); 
    
    hMap4.remove("Geeks"); //doesnt work
    // Final Map 
    System.out.println("After removing" + hMap4); 
    
    // Initialization of a Map using Generics 
    Map<Integer, String> hMap5 = new HashMap<Integer, String>(); 
        
    // Inserting the Elements 
    hMap5.put(new Integer(1), "Geeks"); 
    hMap5.put(new Integer(2), "For"); 
    hMap5.put(new Integer(3), "Geeks"); 
    
    for (Map.Entry mapElement: hMap5.entrySet()) { 
      int key = (int)mapElement.getKey(); 
  
      // Finding the value 
      String value = (String)mapElement.getValue(); 
  
      System.out.println(key + ": " + value); 
    }
  }
}
