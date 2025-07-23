package com.collections;

import java.util.*; 

public class chapter75_SetInterface { 
  public static void main(String[] args) {
    // Set demonstration using HashSet
    Set<String> hSet = new HashSet<String>();
    
    hSet.add("Geeks");
    hSet.add("For");
    hSet.add("Geeks");
    hSet.add("Example");
    hSet.add("Set");
      
    System.out.println(hSet);
  }
} 
