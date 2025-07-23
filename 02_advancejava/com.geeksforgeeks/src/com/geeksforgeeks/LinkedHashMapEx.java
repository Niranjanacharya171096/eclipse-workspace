package com.geeksforgeeks;

//Java program to demonstrate working of LinkedHashMap 

import java.util.*; 

public class LinkedHashMapEx { 
 public static void main(String a[]) { 
     // create an instance of LinkedHashMap 
     LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>(); 

     // Add mappings using put method 
     lhm.put("one", "A"); 
     lhm.put("two", "B"); 
     lhm.put("four", "C"); 

     // It prints the elements in same order 
     // as they were inserted 
     System.out.println(lhm); 

     System.out.println("Getting value for key 'one': " + lhm.get("one")); 
     System.out.println("Size of the map: " + lhm.size()); 
     System.out.println("Is map empty? " + lhm.isEmpty()); 
     System.out.println("Contains key 'two'? " + lhm.containsKey("two")); 
     System.out.println("Contains value A: " + lhm.containsValue("A")); 

     System.out.println("delete element 'one': " + lhm.remove("one")); 

     // print mappings to the console 
     System.out.println("Mappings of LinkedHashMap: " + lhm); 
 } 
}
