package com.geeksforgeeks;

import java.util.*;

public class MapInterfaceClasses {
    public static void main(String[] args) { 
        System.out.println("\n\t----Hashmap----\n");       

    	// Java Program to illustrate the Hashmap Class 
    	Map<String, Integer> hm = new HashMap<>(); 
  
        hm.put("vishal", 10); 
        hm.put("sachin", 30); 
        hm.put("vaibhav", 20); 
  
        for (Map.Entry<String, Integer> e: hm.entrySet()) 
            System.out.println(e.getKey() + " " + e.getValue()); 

        System.out.println("\n\t----LinkedHashMap----\n");       
        // Java Program to illustrate the LinkedHashmap Class 
        Map<String, Integer> lhm = new LinkedHashMap<>(); 
        
        lhm.put("vishal", 10); 
        lhm.put("sachin", 30); 
        lhm.put("vaibhav", 20); 
  
        for (Map.Entry<String, Integer> e: lhm.entrySet()) 
            System.out.println(e.getKey() + " " + e.getValue()); 

        System.out.println("\n\t----TreeMap----\n");               
        // Java Program to illustrate the TreeMap Class 
        Map<String, Integer> tm = new TreeMap<>(); 
        
        tm.put("vishal", 10); 
        tm.put("sachin", 30); 
        tm.put("vaibhav", 20); 
  
        for (Map.Entry<String, Integer> e: tm.entrySet()) 
            System.out.println(e.getKey() + " " + e.getValue());       
    } 
}
