package com.collections;

import java.io.*;    
import java.util.*; 
import java.util.List; 

class chapter66_ListInterface_Classes{ 
  public static void main(String[] args) { 
//creation of list object using the ArrayList class 
    System.out.println("\t----ArrayList----"); 
    // Size of ArrayList 
    int alSize = 5; 
    
    // Declaring the List with initial size n 
    List<Integer> aList = new ArrayList<Integer>(alSize); 
    
    // Appending the new elements at the end of the list 
    for (int i = 1; i <= alSize; i++) 
      aList.add(i); 
    
    // Printing elements 
    System.out.println("Initial ArrayList: " + aList); 
    
    // Remove element at index 3 
    aList.remove(3); 

    // Displaying the list after deletion 
    System.out.println("ArrayList(-3): " + aList); 

    // Printing elements one by one 
    System.out.print("Final ArrayList: "); 
    for (int i = 0; i < aList.size(); i++) 
      System.out.print(aList.get(i) + " "); 

 // creation of list object using the LinkedList class 
    System.out.println("\n\t----LinkedLists----"); 
    // Size of the LinkedList 
    int llSize = 5; 
    
    // Declaring the List with initial size n 
    List<Integer> lList = new LinkedList<Integer>(); 
    
    // Appending the new elements at the end of the list 
    for (int i = 1; i <= llSize; i++) 
      lList.add(i); 
  
    // Printing elements 
    System.out.println("Initial Linked List: " + lList); 
  
    // Remove element at index 3 
    lList.remove(3); 
  
    // Displaying the list after deletion 
    System.out.println("LinkedList(-3): " + lList); 
  
    // Printing elements one by one 
    System.out.print("Final LinkedList: "); 
    for (int i = 0; i < lList.size(); i++) 
      System.out.print(lList.get(i) + " ");         

// creation of list object using the Vector class 
    System.out.println("\n\t----Vector----"); 
    // Size of the vector 
    int vSize = 5; 
  
    // Declaring the List with initial size n 
    List<Integer> vec = new Vector<Integer>(vSize); 
  
    // Appending the new elements at the end of the list 
    for (int i = 1; i <= vSize; i++) 
      vec.add(i); 
  
    // Printing elements 
    System.out.println("Initial Vector: " + vec); 
  
    // Remove element at index 3 
    vec.remove(3); 
  
    // Displaying the list after deletion 
    System.out.println("Vector(-3): " + vec); 
  
    // Printing elements one by one 
    System.out.print("Final Vector: "); 
    for (int i = 0; i < vec.size(); i++) 
      System.out.print(vec.get(i) + " "); 
    
// creation of list object using the Stack class 
    System.out.println("\n\t----Stack----"); 
    // Size of the stack 
    int sSize = 5; 
 
    // Declaring the List 
    List<Integer> stack = new Stack<Integer>(); 
 
    // Appending the new elements at the end of the list 
    for (int i = 1; i <= sSize; i++) 
      stack.add(i); 
 
    // Printing elements 
    System.out.println("Initial Stack: " + stack); 
 
    // Remove element at index 3 
    stack.remove(3); 
 
    // Displaying the list after deletion 
    System.out.println("Stack(-3): " + stack); 
 
    // Printing elements one by one 
    System.out.print("Final Stack: "); 
    for (int i = 0; i < stack.size(); i++) 
      System.out.print(stack.get(i) + " ");     
  } 
} 
