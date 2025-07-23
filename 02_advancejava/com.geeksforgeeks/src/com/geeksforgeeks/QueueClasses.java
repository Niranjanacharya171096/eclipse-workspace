package com.geeksforgeeks;

import java.util.PriorityQueue;

public class QueueClasses {
	public static void main(String[] args) {
	     // Creating empty priority queue 
	     PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(); 
	
	     // Adding items to the pQueue using add() 
	     pQueue.add(10); 
	     pQueue.add(20); 
	     pQueue.add(15); 
	
	     //for (int i = 0; i < pQueue.size(); i++) 
	     	//System.out.println(pQueue[i]);
	     System.out.println(pQueue);
	     
	     // Printing the top element of PriorityQueue 
	     System.out.println(pQueue.peek()); 
	
	     // Printing the top element and removing it 
	     // from the PriorityQueue container 
	     System.out.println(pQueue.poll()); 
	
	     // Printing the top element again 
	     System.out.println(pQueue.peek()); 
	}

}
