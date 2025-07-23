package com.collections;

import java.util.List; 
import java.util.ArrayList;

public class chapter66_ListInterface_Operations { 
  public static void main(String args[]) { 
    List<String> aList = new ArrayList<>(); 
    System.out.println("Initial ArrayList " + aList); 

    //Java program to add elements in a ArrayList  
    aList.add("Hi"); 
    aList.add("is"); 
    aList.add(1, "My Name"); 
    System.out.println("First ArrayList " + aList); 
 
    aList.add("Geeks"); 
    aList.add("Geeks"); 
    aList.add(4, "hi"); 
    System.out.println("Initial ArrayList " + aList);  
    
    //Java program to change elements in a ArrayList 
    aList.set(4, "For"); 
    System.out.println("Updated ArrayList " + aList); 
    
    //Java program to remove elements in a ArrayList  
    aList.remove(1); 
    System.out.println("After the Index 1 Removal " + aList); 
    aList.remove("Geeks"); 
    System.out.println("After the Object Geeks Removal " + aList); 
  
    aList.add(2, "Geeks"); //first inserted 
    aList.add(1, "My Name"); 
    System.out.println("Final ArrayList " + aList); 
    
    //Java program to iterate the elements in an ArrayList  
    System.out.print("Using the Get method and the for loop: ");
    for (int i = 0; i < aList.size(); i++) { 
      System.out.print(aList.get(i) + " "); 
    } 

    System.out.print("\nUsing the for each loop: ");
    for (String str: aList) 
      System.out.print(str + " "); 
  } 
}