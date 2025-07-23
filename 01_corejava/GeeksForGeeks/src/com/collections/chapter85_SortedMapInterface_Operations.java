package com.collections;

import java.io.*; 
import java.util.*; 

class chapter85_SortedMapInterface_Operations { 
  public static void main(String args[]) { 
    // Default Initialization of a SortedMap 
    SortedMap tMap1 = new TreeMap(); 
    
    // Initialization of a SortedMap using Generics 
    SortedMap<Integer, String> tMap2 = new TreeMap<Integer, String>(); 

    // Inserting the Elements 
    tMap1.put(3, "Geeks"); 
    tMap1.put(2, "For"); 
    tMap1.put(1, "Geeks"); 
    
    tMap2.put(new Integer(3), "Geeks"); 
    tMap2.put(new Integer(2), "For"); 
    tMap2.put(new Integer(1), "Geeks"); 
    
    System.out.println("tMap1: " + tMap1); 
    System.out.println("tMap2: " + tMap2); 
    
    // Initialization of a SortedMap using Generics 
    SortedMap<Integer, String> tMap3 = new TreeMap<Integer, String>(); 

    // Inserting the Elements 
    tMap3.put(3, "Geeks"); 
    tMap3.put(2, "Geeks"); 
    tMap3.put(1, "Geeks"); 
    System.out.println("tMap3: " + tMap3); 
    
    tMap3.put(2, "For"); 
    System.out.println("tMap3: " + tMap3);
    
    // Initialization of a SortedMap using Generics 
    SortedMap<Integer, String> tMap4 = new TreeMap<Integer, String>(); 
    
    // Inserting the Elements 
    tMap4.put(3, "Geeks"); 
    tMap4.put(2, "Geeks"); 
    tMap4.put(1, "Geeks"); 
    tMap4.put(4, "For"); 
    System.out.println("tMap4: " + tMap4); 
    
    tMap4.remove(4); 
    System.out.println("tMap4: " + tMap4); 
    
    // Initialization of a SortedMap using Generics 
    SortedMap<Integer, String> tMap5 = new TreeMap<Integer, String>(); 
    
    // Inserting the Elements 
    tMap5.put(3, "Geeks"); 
    tMap5.put(2, "For"); 
    tMap5.put(1, "Geeks"); 
    System.out.println("tMap5: " + tMap4); 
     
    for (Map.Entry mapElement: tMap5.entrySet()) { 
      int key = (int)mapElement.getKey(); 
      // Finding the value 
      String value = (String)mapElement.getValue(); 
      System.out.println(key + ": " + value); 
    } 
  } 
}