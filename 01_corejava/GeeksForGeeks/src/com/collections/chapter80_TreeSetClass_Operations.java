package com.collections;

import java.util.*; 

class chapter80_TreeSetClass_Operations { 
  public static void main(String[] args) { 
    TreeSet<String> tSet1 = new TreeSet<String>(); 
     
    // ElementSet are added using add() method 
    tSet1.add("Geek"); 
    tSet1.add("For"); 
    tSet1.add("Geeks"); 
     
    System.out.println(tSet1); 
     
    TreeSet<String> tSet2 = new TreeSet<String>(); 
     
    // ElementSet are added using add() method 
    tSet2.add("Geeks"); 
    tSet2.add("For"); 
    tSet2.add("Geeks"); 
    
    System.out.println("Tree Set: " + tSet2); 

    String check = "Geeks"; 
    
    // Check if the above string existSet in the treeset or not 
    System.out.println("Contains " + check + ": " + tSet2.contains(check)); 
    
    // Print the first element in TreeSet 
    System.out.println("First Value: " + tSet2.first()); 
    
    // Print the last element in the TreeSet 
    System.out.println("Last Value: " + tSet2.last()); 
    
    String val = "I"; 
    
    // Find the values just greater and smaller than the above string 
    System.out.println("Higher(I): " + tSet2.higher(val)); 
    System.out.println("Lower(I): " + tSet2.lower(val)); 
    
    TreeSet<String> tSet3 = new TreeSet<String>(); 
    
    // ElementSet are added using add() method 
    tSet3.add("Geek"); 
    tSet3.add("For"); 
    tSet3.add("Geeks"); 
    tSet3.add("A"); 
    tSet3.add("B"); 
    tSet3.add("Z"); 
    
    System.out.println("Initial TreeSet: " + tSet3); 

    // Removing the element b 
    tSet3.remove("B"); 

    System.out.println("After removing B: " + tSet3); 
    
    // Removing the first element 
    tSet3.pollFirst(); 
    
    System.out.println("After removing first: " + tSet3); 
    
    // Removing the last element 
    tSet3.pollLast(); 

    System.out.println("After removing last: " + tSet3); 

    TreeSet<String> tSet4 = new TreeSet<String>(); 
     
    // ElementSet are added using add() method 
    tSet4.add("Geek"); 
    tSet4.add("For"); 
    tSet4.add("Geeks"); 
    tSet4.add("A"); 
    tSet4.add("B"); 
    tSet4.add("Z"); 

    // Iterating though the TreeSet 
    for (String value: tSet4) 
      System.out.print(value + ", "); 
    System.out.println(); 
  } 
} 
