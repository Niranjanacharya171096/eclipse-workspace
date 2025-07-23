package com.collections;

import java.io.*;    
import java.util.*; 

class chapter83_HashtableClass_Constructors { 
  public static void main(String args[]) { 
    System.out.println("\n\t----Hashtable() constructor----\n"); 
    // No need to mention the Generic type twice 
    Hashtable<Integer, String> hTable1 = new Hashtable<>(); 
    
    // Initialization of a Hashtable using Generics 
    Hashtable<Integer, String> hTable2 = new Hashtable<Integer, String>(); 

    // Inserting the Elements using put() method 
    hTable1.put(1, "one"); 
    hTable1.put(2, "two"); 
    hTable1.put(3, "three"); 
    
    hTable2.put(4, "four"); 
    hTable2.put(5, "five"); 
    hTable2.put(6, "six"); 
    
    // Print mappings to the console 
    System.out.println("Mappings of hTable1: " + hTable1); 
    System.out.println("Mappings of hTable2: " + hTable2); 
    
    System.out.println("\n\t----Hashtable(int initialCapacity) constructor----\n"); 
   // No need to mention the Generic type twice 
    Hashtable<Integer, String> hTable3 = new Hashtable<>(4); 
    
    // Initialization of a Hashtable using Generics 
    Hashtable<Integer, String> hTable4 = new Hashtable<Integer, String>(2); 

    // Inserting the Elements using put() method 
    hTable3.put(1, "one"); 
    hTable3.put(2, "two"); 
    hTable3.put(3, "three"); 
     
    hTable4.put(4, "four"); 
    hTable4.put(5, "five"); 
    hTable4.put(6, "six"); 
    
    // Print mappings to the console 
    System.out.println("Mappings of hTable3: " + hTable3); 
    System.out.println("Mappings of hTable4: " + hTable4); 
    
    System.out.println("\n\t----Hashtable(int size, float fillRatio) constructor----\n"); 
    // No need to mention the Generic type twice 
    Hashtable<Integer, String> hTable5 = new Hashtable<>(4, 0.75f); 
    
    // Initialization of a Hashtable using Generics 
    Hashtable<Integer, String> hTable6 = new Hashtable<Integer, String>(3, 0.5f); 
    
    // Inserting the Elements using put() method 
    hTable5.put(1, "one"); 
    hTable5.put(2, "two"); 
    hTable5.put(3, "three"); 
    
    hTable6.put(4, "four"); 
    hTable6.put(5, "five"); 
    hTable6.put(6, "six"); 
    
    // Print mappings to the console 
    System.out.println("Mappings of hTable5: " + hTable5); 
    System.out.println("Mappings of hTable6: " + hTable6); 

    System.out.println("\n\t----Hashtable(Map<? extends K,? extends V> m) constructor----\n"); 
    // No need to mention the Generic type twice 
    Map<Integer, String> hMap = new HashMap<>(); 
    
    // Inserting the Elements using put() method 
    hMap.put(1, "one"); 
    hMap.put(2, "two"); 
    hMap.put(3, "three"); 
    System.out.println("Mappings of hMap: " + hMap); 
    
    // Initialization of a Hashtable using Generics 
    Hashtable<Integer, String> hTable7 = new Hashtable<Integer, String>(hMap); 
    
    // Print mappings to the console 
    System.out.println("Mappings of hTable7(hMap): " + hTable7); 
  }  
}