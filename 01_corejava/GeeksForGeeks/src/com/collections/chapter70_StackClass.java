package com.collections;

import java.util.*; 

public class chapter70_StackClass { 
  // Java code for stack1 implementation 
  public static void main(String args[]) { 
    System.out.print("\n\t----Stack EX1----\n"); 
    Stack<String> stack1 = new Stack<String>(); 
    stack1.push("Hi"); 
    stack1.push("MyName"); 
    stack1.push("Is"); 
    stack1.push("Geeks"); 
    
    System.out.println("Stack: " + stack1); 
  
    // Iterator for the stack1 
    Iterator<String> itr = stack1.iterator(); 
    
    System.out.print("Stack Iteraction: "); 
    // Printing the stack1 
    while (itr.hasNext()) { 
      System.out.print(itr.next() + " "); 
    } 
  
    System.out.println(); 
    
    //stack1.pop(); 
    System.out.println("Stack Pop: " + stack1.pop() + "\nStack: " + stack1); 
    //stack1.peek();
    System.out.println("Stack peek: " + stack1.peek()); 
    //stack1.search("Geeks");
    System.out.println("Stack search(MyName): " + stack1.search("MyName")); 
    System.out.println("Stack search(Geeks): " + stack1.search("Geeks")); 
    
    System.out.print("Stack Iteraction: "); 
    // Iterator for the stack1 
    itr = stack1.iterator(); 
    
    // Printing the stack1 
    while (itr.hasNext()) { 
      System.out.print(itr.next() + " "); 
    } 
  
    System.out.print("\n\t----Stack EX2----\n"); 
    
    Stack<Integer> stack2 = new Stack<Integer>(); 
    System.out.println("Stack2:" + stack2); 
    
    stack_push(stack2); 
    stack_pop(stack2); 
    stack_push(stack2); 
    stack_peek(stack2); 
    stack_search(stack2, 2); 
    stack_search(stack2, 6); 
  }   

  // Pushing element on the top of the stack 
  static void stack_push(Stack<Integer> stack) { 
    System.out.println("Push Operation:"); 
    for(int i = 0; i < 5; i++) { 
      System.out.println(stack.push(i)); 
    } 
    System.out.println("Stack2:" + stack); 
  } 
      
  // Popping element from the top of the stack 
  static void stack_pop(Stack<Integer> stack) { 
    System.out.println("Pop Operation:"); 
    
    for(int i = 0; i < 5; i++) { 
      Integer y = (Integer) stack.pop();  //int y = (int) stack.pop(); 
      System.out.println(y); 
    } 
    System.out.println("Stack2:" + stack); 
  } 
  
  // Displaying element on the top of the stack 
  static void stack_peek(Stack<Integer> stack) { 
    Integer element = (Integer) stack.peek(); 
    System.out.println("Element on stack top: " + element); 
  } 
  
  // Searching element in the stack 
  static void stack_search(Stack<Integer> stack, int element) { 
    Integer pos = (Integer) stack.search(element); 
    
    if(pos == -1) 
      System.out.println("Element not found"); 
    else
      System.out.println("Element is found at position: " + pos); 
  } 
} 
