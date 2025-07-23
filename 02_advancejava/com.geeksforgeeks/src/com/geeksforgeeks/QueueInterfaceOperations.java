package com.geeksforgeeks;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> pq1 = new PriorityQueue<>(); 
		  
        pq1.add("Hi"); 
        pq1.add("MyName"); 
        pq1.add("Is"); 
        pq1.add("Geeks"); 
  
        System.out.println(pq1); 
        
        Queue<String> pq2 = new PriorityQueue<>(); 
        
        pq2.add("Hi"); 
        pq2.add("MyName"); 
        pq2.add("Is"); 
        pq2.add("Geeks"); 
  
        System.out.println("Initial Queue " + pq2); 
        
        pq2.remove("MyName"); 
  
        System.out.println("After Remove " + pq2); 
  
        System.out.println("Poll Method: " + pq2.poll()); 
  
        System.out.println("Final Queue " + pq2); 
        
        Queue<String> pq3 = new PriorityQueue<>(); 
        
        pq3.add("Hi"); 
        pq3.add("MyName"); 
        pq3.add("Is"); 
        pq3.add("Geeks"); 
  
        Iterator iterator = pq3.iterator(); 
  
        while (iterator.hasNext()) { 
            System.out.print(iterator.next() + " "); 
        } 
	}

}
