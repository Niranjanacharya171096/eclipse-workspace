package com.collections;

import java.util.NavigableSet; 
import java.util.TreeSet;

public class chapter79_NavigableSetInterface_Operations {
  public static void main(String[] args) {
    NavigableSet<String> tSet1 = new TreeSet<String>();
  
    // ElementSet are added using add() method
    tSet1.add("A");
    tSet1.add("B");
    tSet1.add("C");
    tSet1.add("A");
    
    System.out.println(tSet1);
    
    NavigableSet<String> tSet2 = new TreeSet<String>();
    
    // ElementSet are added using add() method
    tSet2.add("A");
    tSet2.add("B");
    tSet2.add("C");
    tSet2.add("A");
 
    System.out.println("Navigable Set is " + tSet2);
    
    String check = "D";
    
    // Check if the above string existSet in
    // the NavigableSet or not
    System.out.println("Contains " + check + " " +  tSet2.contains(check));
    
    // Print the first element in
    // the NavigableSet
    System.out.println("First Value " + tSet2.first());
 
    // Print the last element in
    // the NavigableSet
    System.out.println("Last Value " + tSet2.last());
    
    NavigableSet<String> tSet3 = new TreeSet<String>();
    
    // ElementSet are added using add() method
    tSet3.add("A");
    tSet3.add("B");
    tSet3.add("C");
    tSet3.add("B");
    tSet3.add("D");
    tSet3.add("E");
    
    System.out.println("Initial TreeSet " + tSet3);
 
    // Removing the element b
    tSet3.remove("B");
    
    System.out.println("After removing element " + tSet3);
    
    // Remove the First element of TreeSet
    tSet3.pollFirst();
    
    System.out.println("After the removal of First Element " + tSet3);
    
    // Remove the Last element of TreeSet
    tSet3.pollLast();
    
    System.out.println("After the removal of Last Element " + tSet3);
      
    NavigableSet<String> tSet4 = new TreeSet<String>();
    
    // ElementSet are added using add() method
    tSet4.add("C");
    tSet4.add("D");
    tSet4.add("E");
    tSet4.add("A");
    tSet4.add("B");
    tSet4.add("Z");
    
    // Iterating though the NavigableSet
    for (String value: tSet4)
      System.out.print(value + ", ");
    System.out.println();
  }
}