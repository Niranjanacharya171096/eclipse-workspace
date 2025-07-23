package com.geeksforgeeks;

//Java program to demonstrate 
//adding elements to Hashtable 

import java.io.*; 
import java.util.*; 

class HashTableConstructors { 
 public static void main(String args[]) { 
     // No need to mention the 
     // Generic type twice 
     Hashtable<Integer, String> ht1 = new Hashtable<>(); 

     // Initialization of a Hashtable 
     // using Generics 
     Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(); 

     // Inserting the Elements 
     // using put() method 
     ht1.put(1, "one"); 
     ht1.put(2, "two"); 
     ht1.put(3, "three"); 

     ht2.put(4, "four"); 
     ht2.put(5, "five"); 
     ht2.put(6, "six"); 

     // Print mappings to the console 
     System.out.println("Mappings of ht1: " + ht1); 
     System.out.println("Mappings of ht2: " + ht2); 

     // No need to mention the 
     // Generic type twice 
     Hashtable<Integer, String> ht3 = new Hashtable<>(4); 

     // Initialization of a Hashtable 
     // using Generics 
     Hashtable<Integer, String> ht4 = new Hashtable<Integer, String>(2); 

     // Inserting the Elements 
     // using put() method 
     ht3.put(1, "one"); 
     ht3.put(2, "two"); 
     ht3.put(3, "three"); 
     
     ht4.put(4, "four"); 
     ht4.put(5, "five"); 
     ht4.put(6, "six"); 

     // Print mappings to the console 
     System.out.println("Mappings of ht3: " + ht3); 
     System.out.println("Mappings of ht4: " + ht4); 

     // No need to mention the 
     // Generic type twice 
     Hashtable<Integer, String> ht5 = new Hashtable<>(4, 0.75f); 

     // Initialization of a Hashtable 
     // using Generics 
     Hashtable<Integer, String> ht6 = new Hashtable<Integer, String>(3, 0.5f); 

     // Inserting the Elements 
     // using put() method 
     ht5.put(1, "one"); 
     ht5.put(2, "two"); 
     ht5.put(3, "three"); 
     
     ht6.put(4, "four"); 
     ht6.put(5, "five"); 
     ht6.put(6, "six"); 

     // Print mappings to the console 
     System.out.println("Mappings of ht5: " + ht5); 
     System.out.println("Mappings of ht6: " + ht6); 

     // No need to mention the 
     // Generic type twice 
     Map<Integer, String> hm = new HashMap<>(); 

     // Inserting the Elements 
     // using put() method 
     hm.put(1, "one"); 
     hm.put(2, "two"); 
     hm.put(3, "three"); 
     System.out.println("Mappings of hm: " + hm); 

     // Initialization of a Hashtable 
     // using Generics 
     Hashtable<Integer, String> ht7 = new Hashtable<Integer, String>(hm); 

     // Print mappings to the console 
     System.out.println("Mappings of ht7(hm): " + ht7); 
 } 
}