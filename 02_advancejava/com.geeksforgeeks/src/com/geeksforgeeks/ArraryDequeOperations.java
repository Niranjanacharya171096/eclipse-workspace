package com.geeksforgeeks;

import java.util.*;

public class ArraryDequeOperations {
    public static void main(String[] args) {
        // Initializing a deque 
        // since deque is an interface 
        // it is assigned the 
        // ArrayDeque class 
        Deque<String> dq1 = new ArrayDeque<String>(); 
  
        // add() method to insert 
        dq1.add("The"); 
        dq1.addFirst("To"); 
        dq1.addLast("Geeks"); 
  
        // offer() method to insert 
        dq1.offer("For"); 
        dq1.offerFirst("Welcome"); 
        dq1.offerLast("Geeks"); 
  
        // printing Elements of ArrayDeque to the console 
        System.out.println("ArrayDeque: " + dq1); 
        
        // Creating an empty ArrayDeque 
        ArrayDeque<String> dq2 = new ArrayDeque<String>(); 
  
        // Use add() method to add elements into the Deque 
        dq2.add("Welcome"); 
        dq2.add("To"); 
        dq2.add("Geeks"); 
        dq2.add("4"); 
        dq2.add("Geeks"); 
  
        // Displaying the ArrayDeque 
        System.out.println("ArrayDeque: " + dq2); 
  
        // Displaying the First element 
        System.out.println("The first element is: " + dq2.getFirst()); 
  
        // Displaying the Last element 
        System.out.println("The last element is: " + dq2.getLast()); 
 
        // Initializing a deque 
        Deque<String> dq3 = new ArrayDeque<String>(); 
  
        // add() method to insert 
        dq3.add("One"); 
  
        // addFirst inserts at the front 
        dq3.addFirst("Two"); 
  
        // addLast inserts at the back 
        dq3.addLast("Three"); 
  
        // print elements to the console 
        System.out.println("ArrayDeque: " + dq3); 
  
        // remove element as a stack from top/front 
        System.out.println(dq3.pop()); 
  
        // remove element as a queue from front 
        System.out.println(dq3.poll()); 
  
        // remove element from front 
        System.out.println(dq3.pollFirst()); 
  
        // remove element from back 
        System.out.println(dq3.pollLast()); 

        // Initializing an deque 
        Deque<String> dq4 = new ArrayDeque<String>(); 
  
        // add() method to insert 
        // at the back 
        dq4.add("For"); 
  
        // add element at the front 
        dq4.addFirst("Geeks"); 
  
        // add element at the back 
        dq4.addLast("Geeks"); 
  
        dq4.add("is so good"); 
  
        // Iterate using Iterator interface 
        // from the front of the queue 
        for (Iterator itr = dq4.iterator(); itr.hasNext();) 
            System.out.print(itr.next() + " "); 
  
        System.out.println(); 
  
        // Iterate in reverse 
        // sequence in a queue 
        for (Iterator itr = dq4.descendingIterator(); itr.hasNext();) 
            System.out.print(itr.next() + " "); 

    } 
}
