package com.geeksforgeeks;

//Java program to demonstrate adding 
//elements to a LinkedHashMap 

import java.util.*; 

class LinkedHashMapOperations { 
 public static void main(String args[]) { 
     // Initialization of a LinkedHashMap 
     // using Generics 
     LinkedHashMap<Integer, String> hm1 = new LinkedHashMap<Integer, String>(); 

     // Add mappings using 
     // put() method 
     hm1.put(3, "Geeks"); 
     hm1.put(2, "For"); 
     hm1.put(1, "Geeks"); 

     // print mappings to the console 
     System.out.println("Mappings of LinkedHashMap: " + hm1); 

     // Initialization of a LinkedHashMap 
     // using Generics 
     LinkedHashMap<Integer, String> hm2 = new LinkedHashMap<Integer, String>(); 

     // Insert mappings using put() method 
     hm2.put(3, "Geeks"); 
     hm2.put(2, "Geeks"); 
     hm2.put(1, "Geeks"); 

     // print mappings to the console 
     System.out.println("Initial map hm2: " + hm2); 

     // Update the value with key 2 
     hm2.put(2, "For"); 

     // print the updated map 
     System.out.println("Updated Map hm2: " + hm2); 

     // Initialization of a LinkedHashMap 
     // using Generics 
     LinkedHashMap<Integer, String> hm3 = new LinkedHashMap<Integer, String>(); 

     // Inserting the Elements 
     // using put() method 
     hm3.put(3, "Geeks"); 
     hm3.put(2, "Geeks"); 
     hm3.put(1, "Geeks"); 
     hm3.put(4, "For"); 

     // print the mappings to the console 
     System.out.println("Initial Map hm3: " + hm3); 

     // Remove the mapping with Key 4 
     hm3.remove(4); 

     // print the updated map 
     System.out.println("Updated Map hm3: " + hm3); 

     // Initialization of a LinkedHashMap 
     // using Generics 
     LinkedHashMap<Integer, String> hm4 = new LinkedHashMap<Integer, String>(); 

     // Inserting the Elements 
     hm4.put(3, "Geeks"); 
     hm4.put(2, "For"); 
     hm4.put(1, "Geeks"); 

     System.out.println("Map hm4: " + hm4); 

     for (Map.Entry<Integer, String> mapElement: hm4.entrySet()) { 

         Integer key = mapElement.getKey(); 

         // Finding the value 
         String value = mapElement.getValue(); 

         // print the key: value pair 
         System.out.println(key + ": " + value); 
     } 
 } 
}
