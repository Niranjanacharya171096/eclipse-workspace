package com.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class chapter71_QueueInterface_Classes {
  public static void main(String[] args) {
    System.out.println("\n\t----PriorityQueue----"); 
    // creation of queue object using the PriorityQueue class 
      
    // Creating empty priority queue 
    Queue<Integer> pQueue = new PriorityQueue<Integer>(); 
  
    // Adding items to the pQueue using add() 
    pQueue.add(10); 
    pQueue.add(20); 
    pQueue.add(15); 
    System.out.println(pQueue); 
  
    // Printing the top element of the PriorityQueue 
    System.out.println(pQueue.peek()); 
  
    // Printing the top element and removing it from the PriorityQueue container 
    System.out.println(pQueue.poll()); 
    System.out.println(pQueue); 
  
    // Printing the top element again 
    System.out.println(pQueue.peek()); 

    System.out.println("\n\t----LinkedList----"); 
    
    // Creating empty LinkedList 
    Queue<Integer> lList = new LinkedList<Integer>(); 
  
    // Adding items to the lList using add() 
    lList.add(10); 
    lList.add(20); 
    lList.add(15); 
    System.out.println(lList); 

    // Printing the top element of the LinkedList 
    System.out.println(lList.peek()); 
  
    // Printing the top element and removing it from the LinkedList container 
    System.out.println(lList.poll()); 
    System.out.println(lList); 
    
    // Printing the top element again 
    System.out.println(lList.peek()); 
        
    System.out.println("\n\t----PriorityBlockingQueue----"); 
    // Creating empty priority blocking queue 
    Queue<Integer> pbQueue = new PriorityBlockingQueue<Integer>(); 
  
    // Adding items to the pbQueue using add() 
    pbQueue.add(10); 
    pbQueue.add(20); 
    pbQueue.add(15); 
    System.out.println(pbQueue); 
 
    // Printing the top element of the PriorityBlockingQueue 
    System.out.println(pbQueue.peek()); 
  
    // Printing the top element and removing it from the PriorityBlockingQueue 
    System.out.println(pbQueue.poll()); 
    System.out.println(pbQueue); 
  
    // Printing the top element again 
    System.out.println(pbQueue.peek()); 
  }
}
