package com.geeksforgeeks;

import java.util.*;

public class PriorityQueueOperations {
	public static void main(String args[]) {
        PriorityQueue<String> pq1 = new PriorityQueue<>();
 
        pq1.add("A");
        pq1.add("C");
        pq1.add("B");
        pq1.add("D");
 
        System.out.println(pq1);
        
        PriorityQueue<String> pq2 = new PriorityQueue<>();
        
        pq2.add("A");
        pq2.add("C");
        pq2.add("B");
        pq2.add("D");
 
        System.out.println("Initial PriorityQueue " + pq2);
 
          // using the method
        pq2.remove("A");
 
        System.out.println("After Remove : " + pq2);
 
        System.out.println("Poll Method : " + pq2.poll());
 
        System.out.println("Final PriorityQueue : " + pq2);
        
        PriorityQueue<String> pq3 = new PriorityQueue<>();

        pq3.add("A");
        pq3.add("C");
        pq3.add("B");
        pq3.add("D");
        System.out.println("PriorityQueue: " + pq3);
 
        // Using the peek() method
        String element = pq3.peek();
        System.out.println("Accessed Element: " + element);
        
        PriorityQueue<String> pq4 = new PriorityQueue<>();
        
        pq4.add("A");
        pq4.add("C");
        pq4.add("B");
        pq4.add("D");
 
        Iterator iterator = pq4.iterator();
 
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }


	}
}
