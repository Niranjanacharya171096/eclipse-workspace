package com.collections;

import java.util.*;

public class chapter68_LinkedListClass_Operations {
  public static void main(String args[]) { 
    LinkedList<String> lList = new LinkedList<>(); 
    System.out.println("Initial LinkedList " + lList); 

    //Java program to add elements in a LinkedList  
    lList.add("Hi"); 
    lList.add("is"); 
    lList.add(1, "My Name"); 
    System.out.println("First LinkedList " + lList); 
 
    lList.add("Geeks"); 
    lList.add("Geeks"); 
    lList.add(4, "hi"); 
    System.out.println("Initial LinkedList " + lList);  
    
    //Java program to change elements in a LinkedList 
    lList.set(4, "For"); 
    System.out.println("Updated LinkedList " + lList); 
    
    //Java program to remove elements in a LinkedList  
    lList.remove(1); 
    System.out.println("After the Index 1 Removal " + lList); 
    lList.remove("Geeks"); 
    System.out.println("After the Object Geeks Removal " + lList); 
  
    lList.add(2, "Geeks"); //first inserted 
    lList.add(1, "My Name"); 
    System.out.println("Final LinkedList " + lList); 
    
    //Java program to iterate the elements in an LinkedList  
    System.out.print("Using the Get method and the for loop: ");
    for (int i = 0; i < lList.size(); i++) { 
      System.out.print(lList.get(i) + " "); 
    } 

    System.out.print("\nUsing the for each loop: ");
    for (String str: lList) 
      System.out.print(str + " "); 
  }
}
