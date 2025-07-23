package com.collections;

import java.io.*;   
import java.util.*; 

class chapter82_HashMapClass_Constructors { 
  public static void main(String args[]) { 
    System.out.println("\n\t----HashMap() constructor----\n"); 

    // No need to mention the Generic type twice 
    HashMap<Integer, String> hMap1 = new HashMap<>(); 

    // Initialization of a HashMap using Generics 
    HashMap<Integer, String> hMap2 = new HashMap<Integer, String>(); 

    // Add Elements using put method 
    hMap1.put(1, "one"); 
    hMap1.put(2, "two"); 
    hMap1.put(3, "three"); 

    hMap2.put(4, "four"); 
    hMap2.put(5, "five"); 
    hMap2.put(6, "six"); 

    System.out.println("Mappings of HashMap hMap1 are: " + hMap1); 
    System.out.println("Mappings of HashMap hMap2 are: " + hMap2); 

    System.out.println("\n\t----HashMap(int initialCapacity)----\n"); 
    // No need to mention the Generic type twice 
    HashMap<Integer, String> hMap3 = new HashMap<>(10); 
    
    // Initialization of a HashMap using Generics 
    HashMap<Integer, String> hMap4 = new HashMap<Integer, String>(2); 
    
    // Add Elements using put method 
    hMap3.put(1, "one"); 
    hMap3.put(2, "two"); 
    hMap3.put(3, "three"); 
    
    hMap4.put(4, "four"); 
    hMap4.put(5, "five"); 
    hMap4.put(6, "six"); 
     
//    hMap3.put(7, "one"); 
//    hMap3.put(8, "two"); 
//    hMap3.put(9, "three"); 
//      
//    hMap4.put(10, "four"); 
//    hMap4.put(11, "five"); 
//    hMap4.put(12, "six"); 
    
    System.out.println("Mappings of HashMap hMap3 are: " + hMap3); 
    System.out.println("Mappings of HashMap hMap4 are: " + hMap4); 
      
    System.out.println("\n\t----HashMap(int initialCapacity, float loadFactor)----\n"); 
    // No need to mention the Generic type twice 
    HashMap<Integer, String> hMap5 = new HashMap<>(5, 0.75f); 
      
    // Initialization of a HashMap using Generics 
    HashMap<Integer, String> hMap6 = new HashMap<Integer, String>(3, 0.5f); 
    
    // Add Elements using put method 
    hMap5.put(1, "one"); 
    hMap5.put(2, "two"); 
    hMap5.put(3, "three"); 
    
    hMap6.put(4, "four"); 
    hMap6.put(5, "five"); 
    hMap6.put(6, "six"); 
      
    System.out.println("Mappings of HashMap hMap5 are: " + hMap5); 
    System.out.println("Mappings of HashMap hMap6 are: " + hMap6); 
    
    System.out.println("\n\t----HashMap(Map map)----\n"); 
    // No need to mention the Generic type twice 
    Map<Integer, String> hMap7 = new HashMap<>(); 
      
    // Add Elements using put method 
    hMap7.put(1, "one"); 
    hMap7.put(2, "two"); 
    hMap7.put(3, "three"); 
      
    // Initialization of a HashMap using Generics 
    HashMap<Integer, String> hMap8 = new HashMap<Integer, String>(hMap7); 
    
    System.out.println("Mappings of HashMap hMap7 are: " + hMap7); 
    System.out.println("Mappings of HashMap hMap8 are: " + hMap8); 
  } 
}
