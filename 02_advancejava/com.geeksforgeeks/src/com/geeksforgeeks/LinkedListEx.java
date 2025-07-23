package com.geeksforgeeks;

//Java program to demonstrate the 
//working of LinkedList in Java 

import java.io.*; 
import java.util.*; 

class LinkedListEx { 
 public static void main(String[] args) { 
     System.out.println("\n\t----LinkedList EX1----\n"); 

     // Declaring the LinkedList 
     LinkedList<Integer> ll = new LinkedList<Integer>(); 

     // Appending new elements at 
     // the end of the list 
     for (int i = 1; i <= 5; i++) 
         ll.add(i); 

     // Printing elements 
     System.out.println(ll); 

     // Remove element at index 3 
     ll.remove(3); 

     // Displaying the List 
     // after deletion 
     System.out.println(ll); 

     // Printing elements one by one 
     for (int i = 0; i < ll.size(); i++) 
         System.out.print(ll.get(i) + " "); 

     System.out.println("\n\t----LinkedList EX2----\n"); 

     // Creating object of the 
     // class linked list 
     LinkedList<String> ll2  = new LinkedList<String>(); 

     // Adding elements to the linked list 
     ll2.add("A"); 
     ll2.add("B"); 
     ll2.addLast("C"); 
     ll2.addFirst("D"); 
     ll2.add(2, "E"); 

     System.out.println(ll2); 

     ll2.remove("B"); 
     ll2.remove(3); 
     ll2.removeFirst(); 
     ll2.removeLast(); 

     System.out.println(ll2); 
 } 
}