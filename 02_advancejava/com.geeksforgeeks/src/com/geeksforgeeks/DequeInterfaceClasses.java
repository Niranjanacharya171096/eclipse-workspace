package com.geeksforgeeks;

//Java program to demonstrate the 
//creation of deque object using the 
//ArrayDeque class in Java 

import java.util.*; 

public class DequeInterfaceClasses { 
 public static void main(String[] args) 
 { 
     // Initializing an deque 
     Deque<Integer> de_que = new ArrayDeque<Integer>(10); 

     // add() method to insert 
     de_que.add(10); 
     de_que.add(20); 
     de_que.add(30); 
     de_que.add(40); 
     de_que.add(50); 

     System.out.println(de_que); 

     // clear() method 
     de_que.clear(); 
     System.out.println(de_que); 

     // addFirst() method to insert the 
     // elements at the head 
     de_que.addFirst(564); 
     de_que.addFirst(291); 

     // addLast() method to insert the 
     // elements at the tail 
     de_que.addLast(24); 
     de_que.addLast(14); 

     System.out.println(de_que); 
 } 
} 
