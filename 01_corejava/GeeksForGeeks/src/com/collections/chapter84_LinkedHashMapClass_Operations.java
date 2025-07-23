package com.collections;

import java.util.*; 

class chapter84_LinkedHashMapClass_Operations { 
  public static void main(String args[]) { 
    // Initialization of a LinkedHashMap using Generics 
    LinkedHashMap<Integer, String> lhMap1 = new LinkedHashMap<Integer, String>(); 

    // Add mappings using put() method 
    lhMap1.put(3, "Geeks"); 
    lhMap1.put(2, "For"); 
    lhMap1.put(1, "Geeks"); 
    
    // print mappings to the console 
    System.out.println("Mappings of LinkedHashMap: " + lhMap1); 

    // Initialization of a LinkedHashMap using Generics 
    LinkedHashMap<Integer, String> lhMap2 = new LinkedHashMap<Integer, String>(); 

    // Insert mappings using put() method 
    lhMap2.put(3, "Geeks"); 
    lhMap2.put(2, "Geeks"); 
    lhMap2.put(1, "Geeks"); 

    // print mappings to the console 
    System.out.println("Initial map lhMap2: " + lhMap2); 

    // Update the value with key 2 
    lhMap2.put(2, "For"); 

    // print the updated map 
    System.out.println("Updated Map lhMap2: " + lhMap2); 

    // Initialization of a LinkedHashMap using Generics 
    LinkedHashMap<Integer, String> lhMap3 = new LinkedHashMap<Integer, String>(); 

    // Inserting the Elements using put() method 
    lhMap3.put(3, "Geeks"); 
    lhMap3.put(2, "Geeks"); 
    lhMap3.put(1, "Geeks"); 
    lhMap3.put(4, "For"); 
     
    // print the mappings to the console 
    System.out.println("Initial Map lhMap3: " + lhMap3); 

    // Remove the mapping with Key 4 
    lhMap3.remove(4); 

    // print the updated map 
    System.out.println("Updated Map lhMap3: " + lhMap3); 

    // Initialization of a LinkedHashMap using Generics 
    LinkedHashMap<Integer, String> lhMap4 = new LinkedHashMap<Integer, String>(); 
    
    // Inserting the Elements 
    lhMap4.put(3, "Geeks"); 
    lhMap4.put(2, "For"); 
    lhMap4.put(1, "Geeks"); 
    
    System.out.println("Map lhMap4: " + lhMap4); 
    
    for (Map.Entry<Integer, String> mapElement: lhMap4.entrySet()) {   
      Integer key = mapElement.getKey(); 
      // Finding the value 
      String value = mapElement.getValue(); 
      // print the key: value pair 
      System.out.println(key + ": " + value); 
    }   
 } 
}
