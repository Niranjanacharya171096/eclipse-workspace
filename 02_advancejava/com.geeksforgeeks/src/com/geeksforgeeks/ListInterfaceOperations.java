package com.geeksforgeeks;

import java.util.*;  
import java.util.List; 

public class ListInterfaceOperations { 
 public static void main(String args[]) { 
     List<String> al = new ArrayList<>(); 

     al.add("Hi"); 
     al.add("is"); 
     al.add(1, "My Name"); 

     System.out.println("First ArrayList " + al); 
//Java program to change elements 
//in a List 
     al.add("Geeks"); 
     al.add("Geeks"); 
     al.add(3, "Geeks"); 

     System.out.println("Initial ArrayList " + al); 

     al.set(4, "For"); 

     System.out.println("Updated ArrayList " + al); 
//Java program to remove elements 
//in a List  
     al.remove(1); 

     System.out.println("After the Index Removal " + al); 

     al.remove("Geeks"); 

     System.out.println("After the Object Removal " + al); 
//Java program to iterate the elements 
//in an ArrayList 
     al.add(2, "Geeks"); //first inserted 
     al.add(1, "My Name"); 
     
     System.out.println("Final ArrayList " + al); 
     
     System.out.print("Using the Get method and the for loop: ");
     for (int i = 0; i < al.size(); i++) { 
         System.out.print(al.get(i) + " "); 
     } 

     System.out.print("\nUsing the for each loop: ");
     for (String str: al) 
         System.out.print(str + " "); 
 } 
} 