package com.collections;

import java.util.Iterator; 
import java.util.Map; 
import java.util.Set; 
import java.util.SortedMap; 
import java.util.TreeMap; 

public class chapter85_SortedMapInterface { 
  public static void main(String[] args) { 
    SortedMap<Integer, String> tMap = new TreeMap<Integer, String>(); 
    tMap.put(new Integer(2), "practice"); 
    tMap.put(new Integer(3), "quiz"); 
    tMap.put(new Integer(5), "code"); 
    tMap.put(new Integer(4), "contribute"); 
    tMap.put(new Integer(1), "geeksforgeeks"); 
    Set s = tMap.entrySet(); 

    System.out.println("Using iterator in SortedMap");
    Iterator itr = s.iterator(); 

    // Traversing map. Note that the traversal 
    // produced sorted (by keys) output . 
    while (itr.hasNext()) { 
      Map.Entry m = (Map.Entry)itr.next(); 

      int key = (Integer)m.getKey(); 
      String value = (String)m.getValue(); 

      System.out.println("Key: " + key + " value: " + value); 
    } 
 
    System.out.println("\nUsing for each in SortedMap");
    for (Map.Entry<Integer, String> e: tMap.entrySet()) 
      System.out.println("Key: " + e.getKey() + " value: " + e.getValue()); 
  } 
}