package com.geeksforgeeks;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetInterfaceOperations {
	public static void main(String[] args) {
	    NavigableSet<String> ts1 = new TreeSet<String>();
	
	    // Elements are added using add() method
	    ts1.add("A");
	    ts1.add("B");
	    ts1.add("C");
	    ts1.add("A");
	
	    System.out.println(ts1);

        NavigableSet<String> ts2 = new TreeSet<String>();
        
        // Elements are added using add() method
        ts2.add("A");
        ts2.add("B");
        ts2.add("C");
        ts2.add("A");
 
        System.out.println("Navigable Set is " + ts2);
 
        String check = "D";
 
        // Check if the above string exists in
        // the NavigableSet or not
        System.out.println("Contains " + check + " " +  ts2.contains(check));
 
        // Print the first element in
        // the NavigableSet
        System.out.println("First Value " + ts2.first());
 
        // Print the last element in
        // the NavigableSet
        System.out.println("Last Value " + ts2.last());
        
        NavigableSet<String> ts3 = new TreeSet<String>();
        
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
 
        // Remove the First element of TreeSet
        ts3.pollFirst();
 
        System.out.println("After the removal of First Element " + ts3);
 
        // Remove the Last element of TreeSet
        ts3.pollLast();
 
        System.out.println("After the removal of Last Element " + ts3);
	    
        NavigableSet<String> ts4 = new TreeSet<String>();
        
        // Elements are added using add() method
        ts4.add("C");
        ts4.add("D");
        ts4.add("E");
        ts4.add("A");
        ts4.add("B");
        ts4.add("Z");
 
        // Iterating though the NavigableSet
        for (String value: ts4)
            System.out.print(value + ", ");
        System.out.println();
	}
}