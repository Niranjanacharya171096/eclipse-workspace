package com.geeksforgeeks;

import java.util.*;

public class MapInterfaceOperations {
    public static void main(String args[]) { 
        // Default Initialization of a 
        // Map 
        Map<Integer, String> hm1 = new HashMap<>(); 
  
        // Initialization of a Map 
        // using Generics 
        Map<Integer, String> hm2 = new HashMap<Integer, String>(); 
  
        // Inserting the Elements 
        hm1.put(1, "Geeks"); 
        hm1.put(2, "For"); 
        hm1.put(3, "Geeks"); 
  
        hm2.put(new Integer(1), "Geeks"); 
        hm2.put(new Integer(2), "For"); 
        hm2.put(new Integer(3), "Geeks"); 
  
        System.out.println(hm1); 
        System.out.println(hm2); 
        
        // Initialization of a Map 
        // using Generics 
        Map<Integer, String> hm3 = new HashMap<Integer, String>(); 
  
        // Inserting the Elements 
        hm3.put(new Integer(1), "Geeks"); 
        hm3.put(new Integer(2), "Geeks"); 
        hm3.put(new Integer(3), "Geeks"); 
  
        System.out.println("Initial Map " + hm3); 
        hm3.put(new Integer(2), "For"); 
        System.out.println("Updated Map " + hm3); 
        
        // Initialization of a Map 
        // using Generics 
        Map<Integer, String> hm4 = new HashMap<Integer, String>(); 
  
        // Inserting the Elements 
        hm4.put(new Integer(1), "Geeks"); 
        hm4.put(new Integer(2), "For"); 
        hm4.put(new Integer(3), "Geeks"); 
        hm4.put(new Integer(4), "For"); 
        hm4.put(new Integer(5), "For"); 
  
        // Initial Map 
        System.out.println("Before removing" + hm4); 
  
        hm4.remove(new Integer(4)); 
  
        hm4.remove("Geeks"); //doesnt work
        // Final Map 
        System.out.println("After removing" + hm4); 
        
        // Initialization of a Map 
        // using Generics 
        Map<Integer, String> hm5 = new HashMap<Integer, String>(); 
        
        // Inserting the Elements 
        hm5.put(new Integer(1), "Geeks"); 
        hm5.put(new Integer(2), "For"); 
        hm5.put(new Integer(3), "Geeks"); 
  
        for (Map.Entry mapElement: hm5.entrySet()) { 
            int key = (int)mapElement.getKey(); 
  
            // Finding the value 
            String value = (String)mapElement.getValue(); 
  
            System.out.println(key + ": " + value); 
        }
    }
}
