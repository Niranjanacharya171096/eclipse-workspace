package com.collections;

import java.util.*;

public class chapter76_HashSetClass_Operations {
  public static void main(String[] args) { 
    // Instantiate an object of HashSet 
    HashSet<String> hSet1 = new HashSet<String>(); 
  
    // Elements are added using add() method 
    hSet1.add("Geek"); 
    hSet1.add("For"); 
    hSet1.add("Geeks"); 
    
    // Print the contents on the console 
    System.out.println("HashSet elements: " + hSet1); 
    // Instantiate an object of HashSet     
    HashSet<String> hSet2 = new HashSet<String>(); 
  
    // Elements are added using add() method 
    hSet2.add("Geek"); 
    hSet2.add("For"); 
    hSet2.add("Geeks"); 
    hSet2.add("A"); 
    hSet2.add("B"); 
    hSet2.add("Z"); 
  
    // Print the contents on the console 
    System.out.println("Initial HashSet " + hSet2); 
    
    // Removing the element B 
    hSet2.remove("B"); 
  
    // Print the contents on the console 
    System.out.println("After removing element " + hSet2); 
  
    // Returns false if the element is not present 
    System.out.println("Element AC exists in the Set: " + hSet2.remove("AC")); 
    System.out.println("Element A exists in the Set: " + hSet2.remove("A")); 

    // Instantiate an object of HashSet 
    HashSet<String> hSet3 = new HashSet<String>(); 
    
    // Elements are added using add() method 
    hSet3.add("Geek"); 
    hSet3.add("For"); 
    hSet3.add("Geeks"); 
    hSet3.add("A"); 
    hSet3.add("B"); 
    hSet3.add("Z"); 
    
    // Iterating though the HashSet 
    Iterator itr = hSet3.iterator(); 
    while (itr.hasNext()) 
      System.out.print(itr.next() + ", "); 
    System.out.println(); 
  
    // Using enhanced for loop 
    for (String s: hSet3) 
      System.out.print(s + ", "); 
    System.out.println();   
  }
}
