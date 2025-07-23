package com.collections;

import java.util.*; 

public class chapter84_LinkedHashMapClass { 
  public static void main(String a[]) { 
    // create an instance of LinkedHashMap 
    LinkedHashMap<String, String> lhMap = new LinkedHashMap<String, String>(); 

    // Add mappings using put method 
    lhMap.put("one", "A"); 
    lhMap.put("two", "B"); 
    lhMap.put("four", "C"); 

    // It prints the elements in same order 
    // as they were inserted 
    System.out.println(lhMap); 

    System.out.println("Getting value for key 'one': " + lhMap.get("one")); 
    System.out.println("Size of the map: " + lhMap.size()); 
    System.out.println("Is map empty? " + lhMap.isEmpty()); 
    System.out.println("Contains key 'two'? " + lhMap.containsKey("two")); 
    System.out.println("Contains value A: " + lhMap.containsValue("A")); 
    
    System.out.println("delete element 'one': " + lhMap.remove("one")); 

    // print mappings to the console 
    System.out.println("Mappings of LinkedHashMap: " + lhMap); 
  } 
}
