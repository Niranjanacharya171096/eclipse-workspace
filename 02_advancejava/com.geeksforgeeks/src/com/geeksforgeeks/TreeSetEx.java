package com.geeksforgeeks;

//Java program to demonstrate the 
//working of a TreeSet 

import java.util.*; 

public class TreeSetEx { 
 public static void main(String args[]) { 
     // Creating TreeSet and 
     // adding elements 
     TreeSet<String> ts1 = new TreeSet<String>(); 

     ts1.add("Geeks"); 
     ts1.add("For"); 
     ts1.add("Geeks"); 
     ts1.add("Is"); 
     ts1.add("Very helpful"); 


     System.out.println(ts1); 
     
     // Traversing elements 
     Iterator<String> itr = ts1.iterator(); 

     while (itr.hasNext()) { 
         System.out.println(itr.next()); 
     } 
     
     TreeSet<String> ts2 = new TreeSet<String>(); 
     
     // Elements are added using add() method 
     ts2.add("A"); 
     ts2.add("B"); 
     ts2.add("C"); 

     // Duplicates will not get insert 
     ts2.add("C"); 

     // Elements get stored in default natural 
     // Sorting Order(Ascending) 
     System.out.println(ts2); 
 } 
} 
