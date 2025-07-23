package com.collections;

import java.io.*;  
import java.util.*; 

class chapter68_LinkedListClass { 
  public static void main(String[] args) { 
    //creation of list object using the LinkedList class 
    System.out.println("\t----LinkedList----"); 

    LinkedList<String> lList  = new LinkedList<String>(); 
    System.out.println("Before adding elements: " + lList); 

    // Adding elements to the linked list 
    lList.add("A"); 
    lList.add("B"); 
    lList.addLast("C"); 
    lList.addFirst("D"); 
    lList.add(2, "E"); 
   
    System.out.println("After adding elements: " + lList); 

    // removing elements to the linked list 
    lList.remove("B"); 
    lList.remove(3); 
    lList.removeFirst(); 
    lList.removeLast(); 
   
    System.out.println("After removing elements: " + lList);   
  } 
}