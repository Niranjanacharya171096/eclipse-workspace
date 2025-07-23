package com.geeksforgeeks;

import java.io.*; 
import java.util.*; 

class HashMapConstructors { 
 public static void main(String args[]) { 
     System.out.println("\n\t----HashMap() constructor----\n"); 

	 // No need to mention the 
     // Generic type twice 
     HashMap<Integer, String> hm1 = new HashMap<>(); 

     // Initialization of a HashMap 
     // using Generics 
     HashMap<Integer, String> hm2 = new HashMap<Integer, String>(); 

     // Add Elements using put method 
     hm1.put(1, "one"); 
     hm1.put(2, "two"); 
     hm1.put(3, "three"); 

     hm2.put(4, "four"); 
     hm2.put(5, "five"); 
     hm2.put(6, "six"); 

     System.out.println("Mappings of HashMap hm1 are: " + hm1); 
     System.out.println("Mapping of HashMap hm2 are: " + hm2); 

     System.out.println("\n\t----HashMap(int initialCapacity)----\n"); 
     // No need to mention the 
     // Generic type twice 
     HashMap<Integer, String> hm3 = new HashMap<>(10); 

     // Initialization of a HashMap 
     // using Generics 
     HashMap<Integer, String> hm4 = new HashMap<Integer, String>(2); 

     // Add Elements using put method 
     hm3.put(1, "one"); 
     hm3.put(2, "two"); 
     hm3.put(3, "three"); 

     hm4.put(4, "four"); 
     hm4.put(5, "five"); 
     hm4.put(6, "six"); 
     
//     hm3.put(7, "one"); 
//     hm3.put(8, "two"); 
//     hm3.put(9, "three"); 
//
//     hm4.put(10, "four"); 
//     hm4.put(11, "five"); 
//     hm4.put(12, "six"); 

     System.out.println("Mappings of HashMap hm3 are: " + hm3); 
     System.out.println("Mapping of HashMap hm4 are: " + hm4); 

     System.out.println("\n\t----HashMap(int initialCapacity, float loadFactor)----\n"); 
     // No need to mention the 
     // Generic type twice 
     HashMap<Integer, String> hm5 = new HashMap<>(5, 0.75f); 

     // Initialization of a HashMap 
     // using Generics 
     HashMap<Integer, String> hm6 = new HashMap<Integer, String>(3, 0.5f); 

     // Add Elements using put method 
     hm5.put(1, "one"); 
     hm5.put(2, "two"); 
     hm5.put(3, "three"); 

     hm6.put(4, "four"); 
     hm6.put(5, "five"); 
     hm6.put(6, "six"); 

     System.out.println("Mappings of HashMap hm5 are: " + hm5); 
     System.out.println("Mapping of HashMap hm6 are: " + hm6); 

     System.out.println("\n\t----HashMap(Map map)----\n"); 
     // No need to mention the 
     // Generic type twice 
     Map<Integer, String> hm7 = new HashMap<>(); 

     // Add Elements using put method 
     hm7.put(1, "one"); 
     hm7.put(2, "two"); 
     hm7.put(3, "three"); 

     // Initialization of a HashMap 
     // using Generics 
     HashMap<Integer, String> hm8 = new HashMap<Integer, String>(hm7); 

     System.out.println("Mappings of HashMap hm7 are: " + hm7); 
     System.out.println("Mapping of HashMap hm8 are: " + hm8); 
 } 
}
