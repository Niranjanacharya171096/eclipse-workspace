package com.collections;

import java.util.*;  
import java.io.*; 

class chapter77_LinkedHashSetClass_Operations { 
  public static void main(String[] args) { 
    // create an instance of LinkedHashSet 
    LinkedHashSet<String> lhSet1 = new LinkedHashSet<String>(); 

    // Elements are added using add() method insertion order is maintained 
    lhSet1.add("Geek"); 
    lhSet1.add("For"); 
    lhSet1.add("Geeks"); 

    // print elements to the console 
    System.out.println("LinkedHashSet: " + lhSet1); 
    
    // create an instance of LinkedHashSet 
    LinkedHashSet<String> lhSet2 = new LinkedHashSet<String>(); 
    
    // Elements are added using add() method 
    lhSet2.add("Geek"); 
    lhSet2.add("For"); 
    lhSet2.add("Geeks"); 
    lhSet2.add("A"); 
    lhSet2.add("B"); 
    lhSet2.add("Z"); 

    // print elements to the console 
    System.out.println("Initial HashSet " + lhSet2); 
    
    // Removing the element b 
    lhSet2.remove("B"); 
    
    System.out.println("After removing element " + lhSet2); 
    
    // Returns false if the element is not present 
    System.out.println(lhSet2.remove("AC")); 
    
    // Instantiate an object of Set Since LinkedHashSet implements Set 
    // Set points to LinkedHashSet 
    Set<String> lhSet3 = new LinkedHashSet<String>(); 
    
    // Elements are added using add() method 
    lhSet3.add("Geek"); 
    lhSet3.add("For"); 
    lhSet3.add("Geeks"); 
    lhSet3.add("A"); 
    lhSet3.add("B"); 
    lhSet3.add("Z"); 
    
    // Iterating though the LinkedHashSet 
    Iterator itr = lhSet3.iterator(); 
    while (itr.hasNext()) 
      System.out.print(itr.next() + ", "); 
    System.out.println(); 

    // Using enhanced for loop 
    for (String s: lhSet3) 
      System.out.print(s + ", "); 
    System.out.println(); 
  } 
}
