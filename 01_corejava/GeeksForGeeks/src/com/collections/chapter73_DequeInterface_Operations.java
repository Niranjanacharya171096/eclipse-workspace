package com.collections;

import java.util.*;

public class chapter73_DequeInterface_Operations {
  public static void main(String[] args) { 
    // Initializing an deque 
    Deque<String> aDeque1 = new ArrayDeque<String>(); 
  
    // add() method to insert 
    aDeque1.add("B"); 
    aDeque1.addFirst("A"); 
    aDeque1.addLast("C"); 
  
    System.out.println(aDeque1); 
    // Initializing an deque 
    Deque<String> aDeque2 = new ArrayDeque<String>(); 
  
    // add() method to insert 
    aDeque2.add("B"); 
    aDeque2.addFirst("A"); 
    aDeque2.addLast("C"); 
    
    System.out.println(aDeque2); 
    System.out.println(aDeque2.pop());
    System.out.println(aDeque2); 
    System.out.println(aDeque2.poll());
    System.out.println(aDeque2); 
    System.out.println(aDeque2.pollFirst());
    System.out.println(aDeque2); 
    System.out.println(aDeque2.pollLast()); 
    System.out.println(aDeque2); 
    
    // Initializing an deque 
    Deque<String> aDeque3 = new ArrayDeque<String>(); 
      
    // add() method to insert 
    aDeque3.add("B"); 
    aDeque3.addFirst("A"); 
    aDeque3.addLast("C"); 
    aDeque3.add("D"); 
    System.out.println(aDeque3); 
    
    for (Iterator itr = aDeque3.iterator(); itr.hasNext();) 
      System.out.print(itr.next() + " "); 
    
    System.out.println(); 
    
    for (Iterator itr = aDeque3.descendingIterator(); itr.hasNext();) 
      System.out.print(itr.next() + " "); 
  }
}
