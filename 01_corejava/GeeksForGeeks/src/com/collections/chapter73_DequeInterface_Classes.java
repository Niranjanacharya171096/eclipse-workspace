package com.collections;

import java.util.*;

public class chapter73_DequeInterface_Classes {
  public static void main(String[] args) { 
    // Initializing an deque 
    Deque<Integer> aDeque = new ArrayDeque<Integer>(10); 

    // add() method to insert 
    aDeque.add(10); 
    aDeque.add(20); 
    aDeque.add(30); 
    aDeque.add(40); 
    aDeque.add(50); 

    System.out.println(aDeque); 

    // clear() method 
    aDeque.clear(); 

    // addFirst() method to insert the elements at the head 
    aDeque.addFirst(564); 
    aDeque.addFirst(291); 

    // addLast() method to insert the elements at the tail 
    aDeque.addLast(24); 
    aDeque.addLast(14); 

    System.out.println(aDeque); 
  }
}
