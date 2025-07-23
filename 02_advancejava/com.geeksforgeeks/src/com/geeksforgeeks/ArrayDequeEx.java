package com.geeksforgeeks;

//Java program to demonstrate the 
//ArrayDeque class in Java 

import java.util.*; 

public class ArrayDequeEx { 
 public static void main(String[] args) { 
     // Initializing an deque 
     ArrayDeque<Integer> de_que1 = new ArrayDeque<Integer>(10); 

     // add() method to insert 
     de_que1.add(10); 
     de_que1.add(20); 
     de_que1.add(30); 
     de_que1.add(40); 
     de_que1.add(50); 

     System.out.println(de_que1); 

     // clear() method 
     de_que1.clear(); 

     // addFirst() method to insert the 
     // elements at the head 
     de_que1.addFirst(564); 
     de_que1.addFirst(291); 

     // addLast() method to insert the 
     // elements at the tail 
     de_que1.addLast(24); 
     de_que1.addLast(14); 

     System.out.println(de_que1); 
     
     System.out.println("\n\t----Stack Using ArrayDeque----"); 
     
     Deque<Character> stack = new ArrayDeque<Character>(); 
     stack.push('A'); 
     stack.push('B'); 
     stack.push('C'); 
     stack.push('D'); 
     System.out.println(stack); 
     System.out.println("Peek: " + stack.peek()); 
     System.out.println("Pop: " + stack.pop()); 
     System.out.println(stack); 
     
  // Java program to demonstrate few functions of 
  // ArrayDeque in Java 
     System.out.println("\n\t----ArrayDeque----"); 

      // Initializing an deque 
      Deque<Integer> de_que2 = new ArrayDeque<Integer>(10); 
 
      // add() method to insert 
      de_que2.add(10); 
      de_que2.add(20); 
      de_que2.add(30); 
      de_que2.add(40); 
      de_que2.add(50); 
      System.out.println(de_que2); 

      for (Integer element: de_que2) 
          System.out.println("Element: " + element); 
 
      System.out.println("Using clear() "); 

      // clear() method 
      de_que2.clear(); 
      System.out.println("Above elements are removed now: " + de_que2); 
 
      // addFirst() method to insert at start 
      de_que2.addFirst(564); 
      de_que2.addFirst(291); 
 
      // addLast() method to insert at end 
      de_que2.addLast(24); 
      de_que2.addLast(14); 
  
      // Iterator(): 
      System.out.println("Elements of deque using Iterator:"); 
      for(Iterator itr = de_que2.iterator(); itr.hasNext();) 
          System.out.println(itr.next()); 

      // descendingIterator(): to reverse the deque order 
      System.out.println("Elements of deque in reverse order:"); 
      for(Iterator dItr = de_que2.descendingIterator(); dItr.hasNext();)
          System.out.println(dItr.next());
      System.out.println(de_que2); 
 
      // element() method: to get Head element 
      System.out.println("\nHead Element using element(): " + de_que2.element()); 
      System.out.println(de_que2); 
 
      // getFirst() method: to get Head element 
      System.out.println("Head Element using getFirst(): " + de_que2.getFirst()); 
      System.out.println(de_que2); 
 
      // getLast() method: to get last element 
      System.out.println("Last Element using getLast(): " + de_que2.getLast()); 
      System.out.println(de_que2); 
 
      // toArray() method: 
      Object[] arr = de_que2.toArray(); 
      System.out.println("\nArray Size: " + arr.length); 
 
      System.out.print("Array elements: "); 
      for(int i=0; i<arr.length ; i++) 
          System.out.print(" " + arr[i]); 
            
      // peek() method: to get head 
      System.out.println("\nHead element: " + de_que2.peek()); 
      System.out.println(de_que2); 
  
      // poll() method: to get head 
      System.out.println("Head element poll: " + de_que2.poll()); 
      System.out.println(de_que2); 
        
      // push() method: 
      de_que2.push(265); 
      de_que2.push(984); 
      de_que2.push(2365); 
      System.out.println(de_que2); 
        
      // remove() method: to get head 
      System.out.println("Head element remove: " + de_que2.remove()); 
        
      System.out.println("The final array is: "+de_que2); 
 } 
} 