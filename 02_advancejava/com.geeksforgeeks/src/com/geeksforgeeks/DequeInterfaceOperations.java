package com.geeksforgeeks;

import java.util.*;

public class DequeInterfaceOperations {
    public static void main(String[] args) { 
        // Initializing an deque 
        Deque<String> dq1 = new ArrayDeque<String>(); 
  
        // add() method to insert 
        dq1.add("B"); 
        dq1.addFirst("A"); 
        dq1.addLast("C"); 
  
        System.out.println(dq1); 
        // Initializing an deque 
        Deque<String> dq2 = new ArrayDeque<String>(); 
  
        // add() method to insert 
        dq2.add("B"); 
        dq2.addFirst("A"); 
        dq2.addLast("C"); 
  
        System.out.println(dq2); 
        System.out.println(dq2.pop());
        System.out.println(dq2); 
        System.out.println(dq2.poll());
        System.out.println(dq2); 
        System.out.println(dq2.pollFirst());
        System.out.println(dq2); 
        System.out.println(dq2.pollLast()); 
        System.out.println(dq2); 
        
        // Initializing an deque 
        Deque<String> dq3 = new ArrayDeque<String>(); 
  
        // add() method to insert 
        dq3.add("B"); 
        dq3.addFirst("A"); 
        dq3.addLast("C"); 
        dq3.add("D"); 
        System.out.println(dq3); 
  
        for (Iterator itr = dq3.iterator(); itr.hasNext();) { 
            System.out.print(itr.next() + " "); 
        } 
  
        System.out.println(); 
  
        for (Iterator itr = dq3.descendingIterator(); itr.hasNext();) { 
            System.out.print(itr.next() + " "); 
        } 
    }
}
