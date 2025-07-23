package com.geeksforgeeks;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueInterfaceClasses {
	public static void main(String[] args) {
        System.out.println("\n\t----PriorityQueue----\n"); 
		// creation of queue object using the 
		// PriorityQueue class 
		  
        // Creating empty priority queue 
        Queue<Integer> pQueue = new PriorityQueue<Integer>(); 
  
        // Adding items to the pQueue 
        // using add() 
        pQueue.add(10); 
        pQueue.add(20); 
        pQueue.add(15); 
        System.out.println(pQueue); 
  
        // Printing the top element of 
        // the PriorityQueue 
        System.out.println(pQueue.peek()); 
  
        // Printing the top element and removing it 
        // from the PriorityQueue container 
        System.out.println(pQueue.poll()); 
        System.out.println(pQueue); 
  
        // Printing the top element again 
        System.out.println(pQueue.peek()); 

        System.out.println("\n\t----LinkedList----\n"); 

        // Creating empty LinkedList 
        Queue<Integer> ll = new LinkedList<Integer>(); 
  
        // Adding items to the ll 
        // using add() 
        ll.add(10); 
        ll.add(20); 
        ll.add(15); 
        System.out.println(ll); 

        // Printing the top element of 
        // the LinkedList 
        System.out.println(ll.peek()); 
  
        // Printing the top element and removing it 
        // from the LinkedList container 
        System.out.println(ll.poll()); 
        System.out.println(ll); 
 
        // Printing the top element again 
        System.out.println(ll.peek()); 
        
        System.out.println("\n\t----PriorityBlockingQueue----\n"); 
        // Creating empty priority 
        // blocking queue 
        Queue<Integer> pbq = new PriorityBlockingQueue<Integer>(); 
  
        // Adding items to the pbq 
        // using add() 
        pbq.add(10); 
        pbq.add(20); 
        pbq.add(15); 
        System.out.println(pbq); 
 
        // Printing the top element of 
        // the PriorityBlockingQueue 
        System.out.println(pbq.peek()); 
  
        // Printing the top element and 
        // removing it from the 
        // PriorityBlockingQueue 
        System.out.println(pbq.poll()); 
        System.out.println(pbq); 
  
        // Printing the top element again 
        System.out.println(pbq.peek()); 

	}

}
