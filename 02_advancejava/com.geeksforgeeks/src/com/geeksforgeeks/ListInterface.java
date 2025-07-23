package com.geeksforgeeks;

//Java program to demonstrate a List 

import java.util.*; 
import java.util.List; 

public class ListInterface { 
 public static void main(String[] args) { 
// Creating a list 
     List<Integer> l1 = new ArrayList<Integer>(); 

     // Adds 1 at 0 index 
     l1.add(0, 5); 

     // Adds 2 at 1 index 
     l1.add(1, 6); 
     System.out.println("l1: "+l1); 

// Creating another list 
     List<Integer> l2 = new ArrayList<Integer>(); 

     l2.add(7); 
     l2.add(8); 
     l2.add(9); 

     // Will add list l2 from 1 index 
     l1.addAll(1, l2); 
     System.out.println("l1: "+l1); 

     // Removes element from index 1 
     l1.remove(1); 
     System.out.println("l1(-1): "+l1); 

     // Prints element at index 3 
     System.out.println("l1(3): "+l1.get(3)); 

     // Replace 0th element with 5 
     l1.set(0, 9); 
     System.out.println("l1(0,9): "+l1); 
 } 
} 
