package com.collections;

import java.util.*; 

public class chapter75_SetInterface_Operations { 
  public static void main(String[] args) {
    Set<String> hSet1 = new HashSet<String>();
      
    // Elements are added using add() method
    hSet1.add("B");
    hSet1.add("B");
    hSet1.add("C");
    hSet1.add("A");
    
    System.out.println(hSet1);
    
    Set<String> hSet2 = new HashSet<String>();
    
    // Elements are added using add() method
    hSet2.add("A");
    hSet2.add("B");
    hSet2.add("C");
    hSet2.add("A");
      
    System.out.println("Set is " + hSet2);
      
    String check = "D";
      
    // Check if the above string exists in the SortedSet or not
    System.out.println("Contains " + check + " "+ hSet2.contains(check));
  
    Set<String> hSet3 = new HashSet<String>();
    
    // Elements are added using add() method
    hSet3.add("A");
    hSet3.add("B");
    hSet3.add("C");
    hSet3.add("B");
    hSet3.add("D");
    hSet3.add("E");
      
    System.out.println("Initial HashSet " + hSet3);
      
    // Removing the element b
    hSet3.remove("B");
      
    System.out.println("After removing element " + hSet3);

    Set<String> hSet4 = new HashSet<String>();
    
    // Elements are added using add() method
    hSet4.add("A");
    hSet4.add("B");
    hSet4.add("C");
    hSet4.add("B");
    hSet4.add("D");
    hSet4.add("E");
    
    // Iterating though the Set
    for (String value : hSet4)
      System.out.print(value + ", ");
    System.out.println();
  }
}
