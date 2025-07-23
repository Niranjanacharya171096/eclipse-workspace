package com.geeksforgeeks;

import java.util.*;   
import java.util.List; 

public class StackOperations{ 
 public static void main(String args[]) { 
//Java program to add elements 
//in a Stack 
     // Default initialization of Stack 
     Stack stack1 = new Stack(); 
     // pushing the elements 
     stack1.push(4); 
     stack1.push("All"); 
     stack1.push("Geeks"); 

     // Initialization of Stack 
     // using Generics 
     Stack<String> stack2 = new Stack<String>(); 
     
     stack2.push("Geeks"); 
     stack2.push("For"); 
     stack2.push("Geeks"); 

       // Priniting the Stack Elements 
     System.out.println("Stack1: " + stack1); 
     System.out.println("Stack2: " + stack2); 
//Java program to access elements 
//in a Stack 
     // Creating an empty Stack 
     Stack<String> stack3 = new Stack<String>(); 

     // Use push() to add elements into the Stack 
     stack3.push("Welcome"); 
     stack3.push("To"); 
     stack3.push("Geeks"); 
     stack3.push("For"); 
     stack3.push("Geeks"); 

     // Displaying the Stack 
     System.out.println("Initial Stack: " + stack3); 

     // Fetching the element at the head of the Stack 
     System.out.println("The element at the top of the stack is: " + stack3.peek()); 

     // Displaying the Stack after the Operation 
     System.out.println("Final Stack: " + stack3); 
//Java program to remove elements 
//in a Stack  
     // Creating an empty Stack 
     Stack<Integer> stack4 = new Stack<Integer>(); 

     // Use add() method to add elements 
     stack4.push(10); 
     stack4.push(15); 
     stack4.push(30); 
     stack4.push(20); 
     stack4.push(5); 

     // Displaying the Stack 
     System.out.println("Initial Stack: " + stack4); 

     // Removing elements using pop() method 
     System.out.println("Popped element: " + stack4.pop()); 
     System.out.println("Popped element: " + stack4.pop()); 

     // Displaying the Stack after pop operation 
     System.out.println("Stack after pop operation " + stack4);  
 } 
} 