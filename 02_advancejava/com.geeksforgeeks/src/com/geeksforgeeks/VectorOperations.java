package com.geeksforgeeks;

import java.util.*;   
import java.util.List; 

public class VectorOperations{ 
 public static void main(String args[]) { 
//Java program to add elements 
//in a Vector 
	// create default vector 
     Vector v1 = new Vector(); 

       // Add elements using add() method 
     v1.add(1); 
     v1.add(2); 
     v1.add("geeks"); 
     v1.add("forGeeks"); 
     v1.add(3); 
       
       // print the vector to the console 
     System.out.println("Vector v1 is " + v1); 

     // create generic vector 
     Vector<Integer> v2 = new Vector<Integer>(); 

     v2.add(1); 
     v2.add(2); 
     v2.add(3); 
     System.out.println("Vector v2 is " + v2); 
//Java program to change elements 
//in a Vector 
  // Creating an empty Vector  
     Vector<Integer> v3 = new Vector<Integer>();  

     // Use add() method to add elements in the vector  
     v3.add(12);  
     v3.add(23);  
     v3.add(22);  
     v3.add(10);  
     v3.add(20);  

     // Displaying the Vector  
     System.out.println("Vector: " + v3);  

     // Using set() method to replace 12 with 21  
     System.out.println("The Object that is replaced is: " + v3.set(0, 21) + " with " + v3.get(0));  

     // Using set() method to replace 20 with 50  
     System.out.println("The Object that is replaced is: " + v3.set(4, 50) + " with " + v3.get(4));  

     // Displaying the modified vector  
     System.out.println("The new Vector is:" + v3);  
//Java program to remove elements 
//in a Vector  
     // create default vector of capacity 10 
     Vector v4 = new Vector(); 

     // Add elements using add() method 
     v4.add(5); 
     v4.add(6); 
     v4.add("Geeks"); 
     v4.add("forGeeks"); 
     v4.add(4); 

     System.out.println("before removal: " + v4); 
     // removing first occurrence element at 1 
     v4.remove(1); 

     // checking vector 
     System.out.println("after removal: " + v4); 
//Java program to iterate the elements 
//in an Vector 
     // create an instance of vector 
   Vector<String> v5 = new Vector<>(); 

     // Add elements using add() method 
   v5.add("Geeks"); 
   v5.add("Geeks"); 
   v5.add(1, "For"); 

   System.out.println("Vector iteration: " + v5); 

   // Using the Get method and the 
   // for loop 
   for (int i = 0; i < v5.size(); i++) { 
       System.out.print(v5.get(i) + " "); 
   } 

   System.out.println(); 

   // Using the for each loop 
   for (String str: v5) 
       System.out.print(str + " "); 
 } 
} 