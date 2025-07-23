package com.collections;

import java.util.*;

public class chapter72_PriorityQueueClass_Operations {
  public static void main(String args[]) {
    PriorityQueue<String> pQueue1 = new PriorityQueue<>();
 
    pQueue1.add("A");
    pQueue1.add("C");
    pQueue1.add("B");
    pQueue1.add("D");
    
    System.out.println(pQueue1);
    
    PriorityQueue<String> pQueue2 = new PriorityQueue<>();
    
    pQueue2.add("A");
    pQueue2.add("C");
    pQueue2.add("B");
    pQueue2.add("D");
    
    System.out.println("Initial PriorityQueue " + pQueue2);
        
    // using the method
    pQueue2.remove("A");
    
    System.out.println("After Remove : " + pQueue2);
 
    System.out.println("Poll Method : " + pQueue2.poll());
    
    System.out.println("Final PriorityQueue : " + pQueue2);
    
    PriorityQueue<String> pQueue3 = new PriorityQueue<>();

    pQueue3.add("A");
    pQueue3.add("C");
    pQueue3.add("B");
    pQueue3.add("D");
    System.out.println("PriorityQueue: " + pQueue3);
 
    // Using the peek() method
    String element = pQueue3.peek();
    System.out.println("Accessed Element: " + element);
    
    PriorityQueue<String> pQueue4 = new PriorityQueue<>();
        
    pQueue4.add("A");
    pQueue4.add("C");
    pQueue4.add("B");
    pQueue4.add("D");
 
    Iterator iterator = pQueue4.iterator();
    
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
  }
}
