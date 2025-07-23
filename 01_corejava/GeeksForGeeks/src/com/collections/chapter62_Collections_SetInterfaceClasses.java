package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

class HashSetEx1 { 
  public static void HashSetFunc() { 
    // Creating HashSet and adding elements 
    System.out.print("\n\t----HashSet Class----\n"); 
    HashSet<String> hSet = new HashSet<String>(); 
    System.out.println("Initial HashSet: "+hSet); 

    hSet.add("Geeks"); 
    hSet.add("For"); 
    hSet.add("Geeks"); 
    hSet.add("Is"); 
    hSet.add("helpful"); 
    System.out.println("After adding elements: "+hSet); 
      
    System.out.println("Iterating using Iterator: "+hSet); 
    // Traversing elements 
    Iterator<String> itr = hSet.iterator(); 
    
    while (itr.hasNext()) { 
      System.out.println(itr.next()); 
    } 
  } 
}

class LinkedHashSetEx1 { 
  public static void LinkedHashSetFunc() { 
    // Creating LinkedHashSet and adding elements 
    System.out.print("\n\t----LinkedHashSet Class----\n"); 
    LinkedHashSet<String> lhSet = new LinkedHashSet<String>(); 
    System.out.println("Initial LinkedHashSet: "+lhSet); 

    lhSet.add("Geeks"); 
    lhSet.add("For"); 
    lhSet.add("Geeks"); 
    lhSet.add("Is"); 
    lhSet.add("helpful"); 
    System.out.println("After adding elements: "+lhSet); 
    
    System.out.println("Iterating using Iterator: "+lhSet); 
    // Traversing elements 
    Iterator<String> itr = lhSet.iterator(); 
    
    while (itr.hasNext()) { 
      System.out.println(itr.next()); 
    } 
  } 
}

public class chapter62_Collections_SetInterfaceClasses {
  public static void main(String args[]) { 
    System.out.print("\t----Set Interface Classes----\n"); 
    
    HashSetEx1 hs = new HashSetEx1();
    hs.HashSetFunc();
        
    LinkedHashSetEx1 lhs = new LinkedHashSetEx1();
    lhs.LinkedHashSetFunc();
  } 
}