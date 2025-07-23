package com.collections;

import java.util.*;

public class chapter71_QueueInterface {
  public static void main(String[] args) {
    Queue<Integer> que = new LinkedList<>(); 
        
    // Adds elements {0, 1, 2, 3, 4} to the queue 
    for (int i = 0; i < 5; i++) 
      que.add(i); 
  
    // Display contents of the queue. 
    System.out.println("Elements of queue " + que); 
    
    // To remove the head of queue. 
    int removedele = que.remove(); 
    System.out.println("removed element: " + removedele); 
    
    System.out.println(que); 
      
    // To view the head of queue 
    int head = que.peek(); 
    System.out.println("head of queue: " + head); 
  
    // Rest all methods of collection interface like size and contains 
    // can be used with this implementation. 
    int size = que.size(); 
    System.out.println("Size of queue: " + size); 
  }
}
