package com.collections;

import java.util.*; 

public class chapter74_ArrayDequeClass { 
  public static void main(String[] args) { 
    // Initializing an deque 
    Deque<Integer> aDeque = new ArrayDeque<Integer>(10); 

    // add() method to insert 
    aDeque.add(10); 
    aDeque.add(20); 
    aDeque.add(30); 
    aDeque.add(40); 
    aDeque.add(50); 
    
    for (Integer element: aDeque) 
    System.out.println("Element: " + element); 
    
    System.out.println("Using clear() "); 
    
    // clear() method 
    aDeque.clear(); 
    
    // addFirst() method to insert at start 
    aDeque.addFirst(564); 
    aDeque.addFirst(291); 
    
    // addLast() method to insert at end 
    aDeque.addLast(24); 
    aDeque.addLast(14); 
    
    System.out.println("Above elements are removed now"); 
    
    // Iterator(): 
    System.out.println("Elements of deque using Iterator:"); 
    for(Iterator itr = aDeque.iterator(); itr.hasNext();) 
      System.out.println(itr.next()); 
    
    // descendingIterator(): to reverse the deque order 
    System.out.println("Elements of deque in reverse order:"); 
    for(Iterator dItr = aDeque.descendingIterator(); dItr.hasNext();)
      System.out.println(dItr.next());
    
    // element() method: to get Head element 
    System.out.println("\nHead Element using element(): " + aDeque.element()); 
    
    // getFirst() method: to get Head element 
    System.out.println("Head Element using getFirst(): " + aDeque.getFirst()); 
    
    // getLast() method: to get last element 
    System.out.println("Last Element using getLast(): " + aDeque.getLast()); 
    
    // toArray() method: 
    Object[] arr = aDeque.toArray(); 
    System.out.println("\nArray Size: " + arr.length); 
    
    System.out.print("Array elements: "); 
    for(int i=0; i<arr.length ; i++) 
      System.out.print(" " + arr[i]); 
    
    // peek() method: to get head 
    System.out.println("\nHead element: " + aDeque.peek()); 
    
    // poll() method: to get head 
    System.out.println("Head element poll: " + aDeque.poll()); 
    
    // push() method: 
    aDeque.push(265); 
    aDeque.push(984); 
    aDeque.push(2365); 
    
    // remove() method: to get head 
    System.out.println("Head element remove: " + aDeque.remove()); 
    
    System.out.println("The final array is: "+aDeque); 
  } 
} 
