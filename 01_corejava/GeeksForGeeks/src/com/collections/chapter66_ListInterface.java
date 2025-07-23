package com.collections;

import java.util.ArrayList;
import java.util.List; 

public class chapter66_ListInterface { 
  public static void main(String[] args) { 
    // Creating a list 
    List<Integer> aList1 = new ArrayList<Integer>(); 
    
    // Adds 1 at 0 index 
    aList1.add(0, 1); 
    
    // Adds 2 at 1 index 
    aList1.add(1, 2); 
    System.out.println(aList1); 
    
    // Creating another list 
    List<Integer> aList2 = new ArrayList<Integer>(); 
    
    aList2.add(1); 
    aList2.add(2); 
    aList2.add(3); 
    
    // Will add list aList2 from 1 index 
    aList1.addAll(1, aList2); 
    System.out.println(aList1); 
    
    // Removes element from index 1 
    aList1.remove(1); 
    System.out.println(aList1); 
    
    // Prints element at index 3 
    System.out.println(aList1.get(3)); 
    
    // Replace 0th element with 5 
    aList1.set(0, 5); 
    System.out.println(aList1); 
  } 
}
