package com.collections;

import java.util.*; 

class chapter78_SortedSetInterface{ 
  public static void main(String[] args) { 
    SortedSet<String> tSet = new TreeSet<String>(); 

    // Adding elementSet into the TreeSet using add() 
    tSet.add("India"); 
    tSet.add("Australia"); 
    tSet.add("South Africa"); 
    
    // Adding the duplicate element 
    tSet.add("India"); 
    
    // Displaying the TreeSet 
    System.out.println(tSet); 
    
    // Removing items from TreeSet using remove() 
    tSet.remove("Australia"); 
    System.out.println("Set after removing " + "Australia:" + tSet); 
    
    // Iterating over Tree set items 
    System.out.println("Iterating over set:"); 
    Iterator<String> itr = tSet.iterator(); 
    while (itr.hasNext()) 
      System.out.println(itr.next()); 
  } 
} 
