package com.collections;

import java.util.*; 

public class chapter73_DequeInterface { 
  public static void main(String[] args) { 
    Deque<String> aDeque = new LinkedList<String>(); 

    // We can add elements to the queue in various ways 
    System.out.println(aDeque + "\n"); 

    // Add at the last 
    aDeque.add("1 (Tail)"); 
    System.out.println(aDeque + "\n"); 

    // Add at the first 
    aDeque.addFirst("2 (Head)"); 
    System.out.println(aDeque + "\n"); 

    // Add at the last 
    aDeque.addLast("3 (Tail)"); 
    System.out.println(aDeque + "\n"); 

    // Add at the first 
    aDeque.push("4 (Head)"); 
    System.out.println(aDeque + "\n"); 
     
    // Add at the last 
    aDeque.offer("5 (Tail)"); 
    System.out.println(aDeque + "\n"); 

    // Add at the first 
    aDeque.offerFirst("6 (Head)"); 

    System.out.println(aDeque + "\n"); 

    // We can remove the first element or the last element. 
    aDeque.removeFirst(); 
    aDeque.removeLast(); 
    System.out.println("Deque after removing first and last: " + aDeque); 
  } 
} 
