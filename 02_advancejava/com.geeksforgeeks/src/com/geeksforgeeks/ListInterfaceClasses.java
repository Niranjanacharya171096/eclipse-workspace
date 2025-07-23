package com.geeksforgeeks;

import java.io.*;  
import java.util.*; 
import java.util.List; 

class ListInterfaceClasses /*implements List<Integer>*/{ 
 public static void main(String[] args) { 
//creation of list object using the 
//ArrayList class 
     System.out.println("\t----ArrayList----"); 
     // Size of ArrayList 
     int alSize = 5; 

     // Declaring the List with initial size n 
     List<Integer> arrli = new ArrayList<Integer>(alSize); 

     // Appending the new elements 
     // at the end of the list 
     for (int i = 1; i <= alSize; i++) 
         arrli.add(i); 

     // Printing elements 
     System.out.println("Initial ArrayList: " + arrli); 

     // Remove element at index 3 
     arrli.remove(3); 

     // Displaying the list after deletion 
     System.out.println("ArrayList(-3): " + arrli); 

     // Printing elements one by one 
     System.out.print("Final ArrayList: "); 
     for (int i = 0; i < arrli.size(); i++) 
         System.out.print(arrli.get(i) + " "); 
// creation of list object using the 
// Vector class 
     System.out.println("\n\t----Vector----"); 
	  // Size of the vector 
	  int vSize = 5; 
	
	  // Declaring the List with initial size n 
	  List<Integer> v = new Vector<Integer>(vSize); 
	
	  // Appending the new elements 
	  // at the end of the list 
	  for (int i = 1; i <= vSize; i++) 
	      v.add(i); 
	
	  // Printing elements 
	  System.out.println("Initial Vector: " + v); 
	
	  // Remove element at index 3 
	  v.remove(3); 
	
	  // Displaying the list after deletion 
	  System.out.println("Vector(-3): " + v); 
	
	  // Printing elements one by one 
	  System.out.print("Final Vector: "); 
	  for (int i = 0; i < v.size(); i++) 
	      System.out.print(v.get(i) + " "); 
// creation of list object using the 
// Stack class 
	  System.out.println("\n\t----Stack----"); 
       // Size of the stack 
       int sSize = 5; 
 
       // Declaring the List 
       List<Integer> s = new Stack<Integer>(); 
 
       // Appending the new elements 
       // at the end of the list 
       for (int i = 1; i <= sSize; i++) 
           s.add(i); 
 
       // Printing elements 
       System.out.println("Initial Stack: " + s); 
 
       // Remove element at index 3 
       s.remove(3); 
 
       // Displaying the list after deletion 
       System.out.println("Stack(-3): " + s); 
 
       // Printing elements one by one 
       System.out.print("Final Stack: "); 
       for (int i = 0; i < s.size(); i++) 
           System.out.print(s.get(i) + " "); 
// creation of list object using the 
// LinkedList class 
       System.out.println("\n\t----LinkedLists----"); 
        // Size of the LinkedList 
        int llSize = 5; 
  
        // Declaring the List with initial size n 
        List<Integer> ll = new LinkedList<Integer>(); 
  
        // Appending the new elements 
        // at the end of the list 
        for (int i = 1; i <= llSize; i++) 
            ll.add(i); 
  
        // Printing elements 
        System.out.println("Initial Linked List: " + ll); 
  
        // Remove element at index 3 
        ll.remove(3); 
  
        // Displaying the list after deletion 
        System.out.println("LinkedList(-3): " + ll); 
  
        // Printing elements one by one 
        System.out.print("Final LinkedList: "); 
        for (int i = 0; i < ll.size(); i++) 
            System.out.print(ll.get(i) + " ");         
    } 
} 
