package com.geeksforgeeks;

//Java program to demonstrate the working 
//of a Deque in Java 

import java.util.*; 

public class DequeInterface { 
 public static void main(String[] args) { 
     Deque<String> deque = new LinkedList<String>(); 

     // We can add elements to the queue 
     // in various ways 
     System.out.println(deque + "\n"); 

     // Add at the last 
     deque.add("1 (Tail)"); 
     System.out.println(deque + "\n"); 

     // Add at the first 
     deque.addFirst("2 (Head)"); 
     System.out.println(deque + "\n"); 

     // Add at the last 
     deque.addLast("3 (Tail)"); 
     System.out.println(deque + "\n"); 

     // Add at the first 
     deque.push("4 (Head)"); 
     System.out.println(deque + "\n"); 

     // Add at the last 
     deque.offer("5 (Tail)"); 
     System.out.println(deque + "\n"); 

     // Add at the first 
     deque.offerFirst("6 (Head)"); 

     System.out.println(deque + "\n"); 

     // We can remove the first element 
     // or the last element. 
     deque.removeFirst(); 
     deque.removeLast(); 
     System.out.println("Deque after removing first and last: " + deque); 
 } 
} 
