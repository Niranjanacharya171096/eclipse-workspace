package com.geeksforgeeks;

//Java program to illustrate 
//Java.util.Hashtable 

import java.util.*; 

public class HashTableEx { 
 public static void main(String[] args) { 
     // Create an empty Hashtable 
     Hashtable<String, Integer> ht = new Hashtable<>(); 

     // Add elements to the hashtable 
     ht.put("vishal", 10); 
     ht.put("sachin", 30); 
     ht.put("vaibhav", 20); 

     // Print size and content 
     System.out.println("Size of map is: " + ht.size()); 
     System.out.println(ht); 

     System.out.println(ht.containsKey("vishal"));
     // Check if a key is present and if 
     // present, print value 
     if (ht.containsKey("vishal")) { 
         Integer a = ht.get("vishal"); 
         System.out.println("value for key" + " \"vishal\" is: " + a); 
     } 
 } 
}
