package com.collections;

import java.util.*; 

class ArrayDequeEx1 { 
  public void ArrayDequeFunc() { 
    // Initializing an deque 
    System.out.print("\n\t----ArrayDeque Class----\n"); 
    Deque<Integer> aDeque = new ArrayDeque<Integer>(10); 
    System.out.println("Initial ArrayDeque: "+aDeque); 

    // add() method to insert 
    aDeque.add(10); 
    aDeque.add(20); 
    aDeque.add(30); 
    aDeque.add(40); 
    aDeque.add(50); 
    System.out.println("After adding elements: "+aDeque); 
    
    // clear() method 
    aDeque.clear(); 
    System.out.println("After clearing element: "+aDeque); 

    // addFirst() method to insert the elements at the head 
    aDeque.addFirst(564); 
    aDeque.addFirst(291); 
    // addLast() method to insert the elements at the tail 
    aDeque.addLast(24); 
    aDeque.addLast(14); 

    System.out.println("After adding head and tail elements: "+aDeque); 
  } 
} 

public class chapter62_Collections_DeQueueInterfaceClasses {
  public static void main(String[] args) {
    System.out.print("\t----Deque Interface Classes----\n"); 

    ArrayDequeEx1 adq = new ArrayDequeEx1(); 
    adq.ArrayDequeFunc();
  }
}
