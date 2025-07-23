package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class chapter71_QueueInterface_Operations {
  public static void main(String[] args) {
    Queue<String> pQueue = new PriorityQueue<>(); 
      
    pQueue.add("Hi"); 
    pQueue.add("MyName"); 
    pQueue.add("Is"); 
    pQueue.add("Geeks"); 
    pQueue.add("For"); 
    pQueue.add("Geeks"); 
    System.out.println("Initial Queue " + pQueue); 
    
    pQueue.remove("MyName"); 
    System.out.println("After Remove " + pQueue); 
    
    System.out.println("Poll Method: " + pQueue.poll()); 
    
    System.out.println("Final Queue " + pQueue); 
      
    Iterator iterator = pQueue.iterator(); 
    
    while (iterator.hasNext()) { 
      System.out.print(iterator.next() + " "); 
    } 
  }
}
