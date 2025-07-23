package com.geeksforgeeks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

class ArrayListEx1 { 
	 public static void ArrayListFunc() { 

	     // Declaring the ArrayList with 
	     // initial size n 
	     ArrayList<Integer> al = new ArrayList<Integer>(); 

	     // Appending new elements at 
	     // the end of the list 
	     for (int i = 1; i <= 5; i++) 
	         al.add(i); 

	     // Printing elements 
	     System.out.println(al); 

	     // Remove element at index 3 
	     al.remove(3); 

	     // Displaying the ArrayList 
	     // after deletion 
	     System.out.println(al); 

	     // Printing elements one by one 
	     for (int i = 0; i < al.size(); i++) 
	         System.out.print(al.get(i) + " "); 
	 } 
}

class LinkedListEx1 { 
	 public static void LinkedListFunc() { 

	     // Declaring the LinkedList 
	     LinkedList<Integer> ll = new LinkedList<Integer>(); 

	     // Appending new elements at 
	     // the end of the list 
	     for (int i = 1; i <= 5; i++) 
	         ll.add(i); 

	     // Printing elements 
	     System.out.println(ll); 

	     // Remove element at index 3 
	     ll.remove(3); 

	     // Displaying the List 
	     // after deletion 
	     System.out.println(ll); 

	     // Printing elements one by one 
	     for (int i = 0; i < ll.size(); i++) 
	         System.out.print(ll.get(i) + " "); 
	 } 
}

class VectorEx1 { 
	 public static void VectorFunc() { 

	     // Declaring the Vector 
	     Vector<Integer> v = new Vector<Integer>(); 

	     // Appending new elements at 
	     // the end of the list 
	     for (int i = 1; i <= 5; i++) 
	         v.add(i); 

	     // Printing elements 
	     System.out.println(v); 

	     // Remove element at index 3 
	     v.remove(3); 

	     // Displaying the Vector 
	     // after deletion 
	     System.out.println(v); 

	     // Printing elements one by one 
	     for (int i = 0; i < v.size(); i++) 
	         System.out.print(v.get(i) + " "); 
	 } 
} 

class StackEx1 { 
	 public void StackFunc() { 
	     Stack<String> stack = new Stack<String>(); 
	     stack.push("Geeks"); 
	     stack.push("For"); 
	     stack.push("Geeks"); 
	     stack.push("Geeks"); 

	     // Iterator for the stack 
	     Iterator<String> itr = stack.iterator(); 

	     // Printing the stack 
	     while (itr.hasNext()) { 
	         System.out.print(itr.next() + " "); 
	     } 

	     System.out.println(); 

	     stack.pop(); 

	     // Iterator for the stack 
	     itr = stack.iterator(); 

	     // Printing the stack 
	     while (itr.hasNext()) { 
	         System.out.print(itr.next() + " "); 
	     } 
	 } 
} 


public class ListClasses {
	public static void main(String args[]) { 
        System.out.print("\t----List Interface Classes----\n"); 
        
        System.out.print("\n\tArrayList Class\n"); 
        ArrayListEx1 al = new ArrayListEx1();
        al.ArrayListFunc();
        
        System.out.print("\n\tLinkedList Class\n"); 
        LinkedListEx1 ll = new LinkedListEx1();
        ll.LinkedListFunc();
        
        System.out.print("\n\tVector Class\n"); 
        VectorEx1 vc = new VectorEx1();
        vc.VectorFunc();

        System.out.print("\n\tStack Class\n"); 
        StackEx1 st = new StackEx1();
        st.StackFunc();
	}	
}