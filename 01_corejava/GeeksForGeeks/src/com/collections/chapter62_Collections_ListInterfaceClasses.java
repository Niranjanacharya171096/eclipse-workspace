package com.collections;

import java.util.ArrayList;   
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

class ArrayListEx1 { 
  public static void ArrayListFunc() { 
    System.out.print("\n\t----ArrayList Class----\n"); 
    // Declaring the ArrayList with initial size n 
    ArrayList<Integer> aList = new ArrayList<Integer>(); 
    System.out.println("Initial ArrayList: "+aList); 

    // Appending new elements at the end of the list 
    for (int i = 1; i <= 5; i++) 
      aList.add(i); 
    System.out.println("After adding elements: "+aList); 

    // Remove element at index 3 
    aList.remove(3); 
    // Displaying the ArrayList after deletion 
    System.out.println("After reomoving index 3 element: "+aList); 

    System.out.println("Iterating using for loop: "+aList); 
    // Printing elements one by one 
    for (int i = 0; i < aList.size(); i++) 
      System.out.print(aList.get(i) + " "); 
  } 
}

class LinkedListEx1 { 
  public static void LinkedListFunc() { 
    System.out.print("\n\t----LinkedList Class----\n"); 
    // Declaring the LinkedList 
    LinkedList<Integer> lList = new LinkedList<Integer>(); 
    System.out.println("Initial LinkedList: "+lList); 
 
    // Appending new elements at the end of the list 
    for (int i = 1; i <= 5; i++) 
      lList.add(i); 
    
    // Printing elements 
    System.out.println("After adding elements: "+lList); 
    
    // Remove element at index 3 
    lList.remove(3); 
    
    // Displaying the List after deletion 
    System.out.println("After reomoving index 3 element: "+lList); 
    
    System.out.println("Iterating using for loop: "+lList); 
    // Printing elements one by one 
    for (int i = 0; i < lList.size(); i++) 
      System.out.print(lList.get(i) + " "); 
  } 
}

class VectorEx1 { 
  public static void VectorFunc() { 
    System.out.print("\n\t----Vector Class----\n"); 
    // Declaring the Vector 
    Vector<Integer> vec = new Vector<Integer>(); 
    System.out.println("Initial Vector: "+vec); 

    // Appending new elements at the end of the list 
    for (int i = 1; i <= 5; i++) 
      vec.add(i); 
    
    // Printing elements 
    System.out.println("After adding elements: "+vec); 
    
    // Remove element at index 3 
    vec.remove(3); 
    
    // Displaying the Vector after deletion 
    System.out.println("After reomoving index 3 element: "+vec); 
    
    System.out.println("Iterating using for loop: "+vec); 
    // Printing elements one by one 
    for (int i = 0; i < vec.size(); i++) 
      System.out.print(vec.get(i) + " "); 
  } 
} 

class StackEx1 { 
  public void StackFunc() { 
    System.out.print("\n\t----Stack Class----\n"); 
    // Declaring the Stack 
    Stack<String> stack = new Stack<String>(); 
    System.out.println("Initial Stack: "+stack); 

    // Pushing elements in to the Stack 
    stack.push("1"); 
    stack.push("2"); 
    stack.push("3"); 
    stack.push("4"); 
    stack.push("5"); 
    System.out.println("After pushing elements: "+stack); 

    // Poping top element from Stack 
    stack.pop(); 
    System.out.println("After poping top element: "+stack); 

    System.out.println("Iterating using Iterator: "+stack); 
    // Iterator for the stack 
    Iterator<String> itr = stack.iterator();     

    // Printing the stack 
    while (itr.hasNext()) { 
      System.out.print(itr.next() + " "); 
    } 
  } 
} 

public class chapter62_Collections_ListInterfaceClasses {
  public static void main(String args[]) { 
    System.out.print("\t----List Interface Classes----\n"); 
    
    ArrayListEx1 al = new ArrayListEx1();
    al.ArrayListFunc();
        
    LinkedListEx1 ll = new LinkedListEx1();
    ll.LinkedListFunc();
        
    VectorEx1 vc = new VectorEx1();
    vc.VectorFunc();
    
    StackEx1 st = new StackEx1();
    st.StackFunc();
  } 
}