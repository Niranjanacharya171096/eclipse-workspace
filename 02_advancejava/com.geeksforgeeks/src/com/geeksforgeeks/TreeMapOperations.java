package com.geeksforgeeks;

// Java program to demonstrate 
//the working of TreeMap 

import java.util.*; 

class TreeMapOperations { 
 public static void main(String args[]) { 
     // Default Initialization of a 
     // TreeMap 
     TreeMap tm1 = new TreeMap(); 

     // Initialization of a TreeMap 
     // using Generics 
     TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>(); 

     // Inserting the Elements 
     tm1.put(3, "Geeks"); 
     tm1.put(2, "For"); 
     tm1.put(1, "Geeks"); 

     tm2.put(new Integer(3), "Geeks"); 
     tm2.put(new Integer(2), "For"); 
     tm2.put(new Integer(1), "Geeks"); 

     System.out.println("tm1: " + tm1); 
     System.out.println("tm2: " + tm2); 
     
     // Initialization of a TreeMap 
     // using Generics 
     TreeMap<Integer, String> tm3 = new TreeMap<Integer, String>(); 

     // Inserting the Elements 
     tm3.put(3, "Geeks"); 
     tm3.put(2, "Geeks"); 
     tm3.put(1, "Geeks"); 

     System.out.println("tm3: " + tm3); 

     tm3.put(2, "For"); 

     System.out.println("tm3: " + tm3); 
     
     // Initialization of a TreeMap 
     // using Generics 
     TreeMap<Integer, String> tm4 = new TreeMap<Integer, String>(); 

     // Inserting the Elements 
     tm4.put(3, "Geeks"); 
     tm4.put(2, "Geeks"); 
     tm4.put(1, "Geeks"); 
     tm4.put(4, "For"); 

     System.out.println("tm4: " + tm4); 

     tm4.remove(4); 

     System.out.println("tm4: " + tm4); 

     // Initialization of a TreeMap 
     // using Generics 
     TreeMap<Integer, String> tm5 = new TreeMap<Integer, String>(); 

     // Inserting the Elements 
     tm5.put(3, "Geeks"); 
     tm5.put(2, "For"); 
     tm5.put(1, "Geeks"); 
     System.out.println("tm5: " + tm5); 

     for (Map.Entry mapElement: tm5.entrySet()) { 
         int key = (int)mapElement.getKey(); 

         // Finding the value 
         String value = (String)mapElement.getValue(); 

         System.out.println(key + ": " + value); 
     } 
 } 
} 

