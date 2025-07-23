package com.geeksforgeeks;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterfaceOperations {
    public static void main(String[] args) { 
        SortedSet<String> ts1 = new TreeSet<String>(); 
  
        // Elements are added using add() method 
        ts1.add("A"); 
        ts1.add("B"); 
        ts1.add("C"); 
        ts1.add("A"); 
  
        System.out.println(ts1); 

        SortedSet<String> ts2 = new TreeSet<String>(); 
        
        // Elements are added using add() method 
        ts2.add("A"); 
        ts2.add("B"); 
        ts2.add("C"); 
        ts2.add("A"); 
  
        System.out.println("Sorted Set is " + ts2); 
  
        // Check if the above string exists in 
        // the SortedSet or not 
        System.out.println("Contains D: " + ts2.contains("D")); 
  
        // Print the first element in 
        // the SortedSet 
        System.out.println("First Value " + ts2.first()); 
  
        // Print the last element in 
        // the SortedSet 
        System.out.println("Last Value " + ts2.last()); 

        SortedSet<String> ts3 = new TreeSet<String>(); 
        
        // Elements are added using add() method 
        ts3.add("A"); 
        ts3.add("B"); 
        ts3.add("C"); 
        ts3.add("B"); 
        ts3.add("D"); 
        ts3.add("E"); 
  
        System.out.println("Initial TreeSet " + ts3); 
  
        // Removing the element b 
        ts3.remove("B"); 
  
        System.out.println("After removing element " + ts3); 

        SortedSet<String> ts4 = new TreeSet<String>(); 
        
        // Elements are added using add() method 
        ts4.add("C"); 
        ts4.add("D"); 
        ts4.add("E"); 
        ts4.add("A"); 
        ts4.add("B"); 
        ts4.add("Z"); 
   
        // Iterating though the SortedSet 
        for (String value: ts4) 
            System.out.print(value + ", "); 
        System.out.println(); 
    } 
}
