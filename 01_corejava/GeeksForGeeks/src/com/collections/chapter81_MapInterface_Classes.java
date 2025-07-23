package com.collections;

import java.util.*;

public class chapter81_MapInterface_Classes {
  public static void main(String[] args) { 
    System.out.println("\n\t----Hashmap----\n");       
    
    // Java Program to illustrate the Hashmap Class 
    Map<String, Integer> hMap = new HashMap<>(); 
    
    hMap.put("vishal", 10); 
    hMap.put("sachin", 30); 
    hMap.put("vaibhav", 20); 
    
    for (Map.Entry<String, Integer> e: hMap.entrySet()) 
      System.out.println(e.getKey() + " " + e.getValue()); 
    
    System.out.println("\n\t----LinkedHashMap----\n");       
    // Java Program to illustrate the LinkedHashmap Class 
    Map<String, Integer> lhMap = new LinkedHashMap<>(); 
    
    lhMap.put("vishal", 10); 
    lhMap.put("sachin", 30); 
    lhMap.put("vaibhav", 20); 
  
    for (Map.Entry<String, Integer> e: lhMap.entrySet()) 
      System.out.println(e.getKey() + " " + e.getValue()); 
      
    System.out.println("\n\t----TreeMap----\n");               
    // Java Program to illustrate the TreeMap Class 
    Map<String, Integer> tMap = new TreeMap<>(); 
    
    tMap.put("vishal", 10); 
    tMap.put("sachin", 30); 
    tMap.put("vaibhav", 20); 
      
    for (Map.Entry<String, Integer> e: tMap.entrySet()) 
      System.out.println(e.getKey() + " " + e.getValue());       
  }   
}
