package com.geeksforgeeks;

//Java program for adding 
//elements to LinkedHashSet 

import java.util.*; 
import java.io.*; 

class LinkedHashSetOperations { 
 public static void main(String[] args) { 
     // create an instance of 
     // LinkedHashSet 
     LinkedHashSet<String> lhs1 = new LinkedHashSet<String>(); 

     // Elements are added using add() method 
     // insertion order is maintained 
     lhs1.add("Geek"); 
     lhs1.add("For"); 
     lhs1.add("Geeks"); 

     // print elements to the console 
     System.out.println("LinkedHashSet: " + lhs1); 
     
     // create an instance of 
     // LinkedHashSet 
     LinkedHashSet<String> lhs2 = new LinkedHashSet<String>(); 

     // Elements are added using add() method 
     lhs2.add("Geek"); 
     lhs2.add("For"); 
     lhs2.add("Geeks"); 
     lhs2.add("A"); 
     lhs2.add("B"); 
     lhs2.add("Z"); 

     // print elements to the console 
     System.out.println("Initial HashSet " + lhs2); 

     // Removing the element b 
     lhs2.remove("B"); 

     System.out.println("After removing element " + lhs2); 

     // Returns false if the element is not present 
     System.out.println(lhs2.remove("AC")); 

     // Instantiate an object of Set 
     // Since LinkedHashSet implements Set 
     // Set points to LinkedHashSet 
     Set<String> lhs3 = new LinkedHashSet<String>(); 

     // Elements are added using add() method 
     lhs3.add("Geek"); 
     lhs3.add("For"); 
     lhs3.add("Geeks"); 
     lhs3.add("A"); 
     lhs3.add("B"); 
     lhs3.add("Z"); 

     // Iterating though the LinkedHashSet 
     Iterator itr = lhs3.iterator(); 
     while (itr.hasNext()) 
         System.out.print(itr.next() + ", "); 
     System.out.println(); 

     // Using enhanced for loop 
     for (String s: lhs3) 
         System.out.print(s + ", "); 
     System.out.println(); 

 } 
}
