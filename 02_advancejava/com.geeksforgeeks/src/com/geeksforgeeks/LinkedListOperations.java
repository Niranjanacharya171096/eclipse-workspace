package com.geeksforgeeks;

import java.util.*;

public class LinkedListOperations {
    public static void main(String args[]) {  
    	// Java program to add elements  
    	// in a LinkedList  
        LinkedList<String> ll1 = new LinkedList<>();  
    
        ll1.add("Geeks");  
        ll1.add("Geeks");  
        ll1.add(1, "For");  
    
        System.out.println(ll1);  
     // Java program to change elements  
     // in a LinkedList  
        LinkedList<String> ll2 = new LinkedList<>();  
        
        ll2.add("Geeks");  
        ll2.add("Geeks");  
        ll2.add(1, "Geeks");  
    
        System.out.println("Initial LinkedList " + ll2);  
    
        ll2.set(1, "For");  
    
        System.out.println("Updated LinkedList " + ll2);  
     // Java program to remove elements  
     // in a LinkedList  
         LinkedList<String> ll3 = new LinkedList<>();  
     
         ll3.add("Geeks");  
         ll3.add("Geeks");  
         ll3.add(1, "For");  
     
         System.out.println("Initial LinkedList " + ll3);  
     
         ll3.remove(1);  
     
         System.out.println("After the Index Removal " + ll3);  
     
         ll3.remove("Geeks");  
     
         System.out.println("After the Object Removal " + ll3);  
      // Java program to iterate the elements  
      // in an LinkedList 
          LinkedList<String> ll4  = new LinkedList<>();  
      
          ll4.add("Geeks");  
          ll4.add("Geeks");  
          ll4.add(1, "For");  
      
          // Using the Get method and the  
          // for loop  
          for (int i = 0; i < ll4.size(); i++) {  
              System.out.print(ll4.get(i) + " ");  
          }  
      
          System.out.println();  
      
          // Using the for each loop  
          for (String str: ll4)  
              System.out.print(str + " ");  
    }  
}
