package com.collections;
import java.util.*; 

public class chapter74_ArrayDequeClass_Operations { 
  public static void main(String[] args) {
    // Initializing a deque since deque is an interface it is assigned the ArrayDeque class 
    Deque<String> aDeque1 = new ArrayDeque<String>(); 
      
    // add() method to insert 
    aDeque1.add("The"); 
    aDeque1.addFirst("To"); 
    aDeque1.addLast("Geeks"); 

    // offer() method to insert 
    aDeque1.offer("For"); 
    aDeque1.offerFirst("Welcome"); 
    aDeque1.offerLast("Geeks"); 

    // printing Elements of ArrayDeque to the console 
    System.out.println("ArrayDeque: " + aDeque1);

    // Creating an empty ArrayDeque
    ArrayDeque<String> aDeque2 = new ArrayDeque<String>(); 

    // Use add() method to add elements into the Deque 
    aDeque2.add("Welcome"); 
    aDeque2.add("To"); 
    aDeque2.add("Geeks"); 
    aDeque2.add("4"); 
    aDeque2.add("Geeks"); 

    // Displaying the ArrayDeque
    System.out.println("ArrayDeque: " + aDeque2); 

    // Displaying the First element 
    System.out.println("The first element is: " + aDeque2.getFirst()); 

    // Displaying the Last element 
    System.out.println("The last element is: " + aDeque2.getLast()); 
   
    // Initializing a deque 
    Deque<String> aDeque3 = new ArrayDeque<String>(); 

    // add() method to insert 
    aDeque3.add("One"); 

    // addFirst inserts at the front 
    aDeque3.addFirst("Two"); 

    // addLast inserts at the back 
    aDeque3.addLast("Three"); 

    // print elements to the console 
    System.out.println("ArrayDeque: " + aDeque3); 
  
    // remove element as a stack from top/front 
    System.out.println(aDeque3.pop()); 

    // remove element as a queue from front 
    System.out.println(aDeque3.poll()); 

    // remove element from front 
    System.out.println(aDeque3.pollFirst()); 

    // remove element from back 
    System.out.println(aDeque3.pollLast()); 
  } 
}