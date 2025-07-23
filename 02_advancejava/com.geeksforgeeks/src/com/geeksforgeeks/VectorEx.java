package com.geeksforgeeks;

//Java program to demonstrate the 
//working of Vector in Java 

import java.io.*; 
import java.util.*; 

class VectorEx { 
 public static void main(String[] args) { 
     System.out.println("\n\t----Vector EX1----"); 

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
     
     System.out.println("\n\t----Vector EX2----"); 
     
     // Size of the 
     // Vector 
     int n = 5; 

     // Declaring the Vector with 
     // initial size n 
     Vector<Integer> v1 = new Vector<Integer>(n); 

     // Appending new elements at 
     // the end of the vector 
     for (int i = 1; i <= n; i++) 
         v1.add(i); 

     // Printing elements 
     System.out.println(v1); 

     // Remove element at index 3 
     v.remove(3); 

     // Displaying the vector 
     // after deletion 
     System.out.println(v1); 

     // Printing elements one by one 
     for (int i = 0; i < v1.size(); i++) 
         System.out.print(v1.get(i) + " "); 
 } 
} 
