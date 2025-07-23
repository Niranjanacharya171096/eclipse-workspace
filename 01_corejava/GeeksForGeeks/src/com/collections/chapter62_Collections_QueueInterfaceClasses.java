package com.collections;

import java.util.*;

class PriorityQueueEx1 { 
  public void PriorityQueueFunc() { 
    System.out.print("\n\t----PriorityQueue Class----\n"); 
    PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(); 
    System.out.println("Initial PriorityQueue: "+pQueue); 
    // Adding items to the pQueue using add() 
    pQueue.add(10); 
    pQueue.add(20); 
    pQueue.add(15); 
    System.out.println("After adding elements: "+pQueue); 

    //for (int i = 0; i < pQueue.size(); i++) 
    //System.out.println(pQueue[i]);
  
    // Printing the top element of PriorityQueue 
    System.out.println("Top element: "+pQueue.peek()); 
  
    // Printing the top element and removing it from the PriorityQueue container 
    System.out.println("Removing Top element: "+pQueue.poll()); 
  
    // Printing the top element again 
    System.out.println("Top element after removing top: "+pQueue.peek()); 
  } 
} 

public class chapter62_Collections_QueueInterfaceClasses {
  public static void main(String[] args) {
    System.out.print("\t----Queue Interface Classes----\n"); 
    PriorityQueueEx1 pQ = new PriorityQueueEx1(); 
    pQ.PriorityQueueFunc();
  }
}
