package com.collections;

import java.util.*; 

public class chapter80_TreeSetClass { 
  public static void main(String args[]) { 
    // Creating TreeSet and adding elementSet 
    TreeSet<String> tSet1 = new TreeSet<String>(); 

    tSet1.add("Geeks"); 
    tSet1.add("For"); 
    tSet1.add("Geeks"); 
    tSet1.add("Is"); 
    tSet1.add("helpful"); 


    System.out.println(tSet1); 
     
    // Traversing elementSet 
    Iterator<String> itr = tSet1.iterator(); 

    while (itr.hasNext()) { 
      System.out.println(itr.next()); 
    }   
     
    TreeSet<String> tSet2 = new TreeSet<String>(); 
    
    // ElementSet are added using add() method 
    tSet2.add("A"); 
    tSet2.add("B"); 
    tSet2.add("C"); 
    
    // Duplicates will not get insert 
    tSet2.add("C"); 

    // ElementSet get stored in default natural 
    // Sorting Order(Ascending) 
    System.out.println(tSet2); 
  } 
} 
