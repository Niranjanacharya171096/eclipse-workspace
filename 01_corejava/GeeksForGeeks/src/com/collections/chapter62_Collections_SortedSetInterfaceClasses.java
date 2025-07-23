package com.collections;

import java.util.Iterator; 
import java.util.TreeSet;

class TreeSetEx1 { 
  public static void TreeSetFunc() { 
    // Creating TreeSet and adding elements 
    System.out.print("\n\t----TreeSet Class----\n"); 
    TreeSet<String> tSet = new TreeSet<String>(); 
    System.out.println("Initial TreeSet: "+tSet); 

    tSet.add("Geeks"); 
    tSet.add("For"); 
    tSet.add("Geeks"); 
    tSet.add("Is"); 
    tSet.add("helpful"); 
    System.out.println("After adding elements: "+tSet); 
    
    System.out.println("Iterating using Iterator: "+tSet); 
    // Traversing elements 
    Iterator<String> itr = tSet.iterator(); 

    while (itr.hasNext()) { 
      System.out.println(itr.next()); 
    } 
  } 
} 

public class chapter62_Collections_SortedSetInterfaceClasses {
  public static void main(String args[]) { 
    System.out.print("\t----SortedSet Interface Classes----\n"); 
 
    TreeSetEx1 ts = new TreeSetEx1();
    ts.TreeSetFunc();
  } 
}