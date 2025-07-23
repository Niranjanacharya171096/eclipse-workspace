package com.geeksforgeeks;

//Java program to demonstrate the working of ArrayList in Java 

import java.io.*;  
import java.util.*; 

class ArrayListEx { 
   public static void main(String[] args) { 
     System.out.println("\n\t----ArrayList EX1----"); 
    
     // Declaring the ArrayList with initial size n 
     ArrayList<Integer> al = new ArrayList<Integer>(); 
    
     // Appending new elements at the end of the list 
     for (int i = 1; i <= 5; i++) 
       al.add(i); 
    
     // Printing elements 
     System.out.println(al); 
    
     // Remove element at index 3 
     al.remove(3); 
    
     // Displaying the ArrayList after deletion 
     System.out.println(al); 
    
     // Printing elements one by one 
     for (int i = 0; i < al.size(); i++) 
       System.out.print(al.get(i) + " "); 
    
     System.out.println("\n\t----ArrayList EX2----"); 
     // Size of the ArrayList 
     int n = 5; 
    
     // Declaring the ArrayList with initial size n 
     ArrayList<Integer> arrli = new ArrayList<Integer>(n); 
    
     // Appending new elements at the end of the list 
     for (int i = 1; i <= n; i++) 
       arrli.add(i); 
    
     // Printing elements 
     System.out.println(arrli); 
    
     // Remove element at index 3 
     arrli.remove(3); 
    
     // Displaying the ArrayList after deletion 
     System.out.println(arrli); 
    
     // Printing elements one by one 
     for (int i = 0; i < arrli.size(); i++) 
       System.out.print(arrli.get(i) + " "); 
   } 
}