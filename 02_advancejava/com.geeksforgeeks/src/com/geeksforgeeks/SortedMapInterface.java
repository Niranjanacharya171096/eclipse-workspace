package com.geeksforgeeks;

//Java code to demonstrate SortedMap Interface 

import java.util.Iterator; 
import java.util.Map; 
import java.util.Set; 
import java.util.SortedMap; 
import java.util.TreeMap; 

public class SortedMapInterface { 
public static void main(String[] args) { 
   SortedMap<Integer, String> sm = new TreeMap<Integer, String>(); 
   sm.put(new Integer(2), "practice"); 
   sm.put(new Integer(3), "quiz"); 
   sm.put(new Integer(5), "code"); 
   sm.put(new Integer(4), "contribute"); 
   sm.put(new Integer(1), "geeksforgeeks"); 
   Set s = sm.entrySet(); 

   System.out.println("Using iterator in SortedMap");
   Iterator i = s.iterator(); 

   // Traversing map. Note that the traversal 
   // produced sorted (by keys) output . 
   while (i.hasNext()) { 
       Map.Entry m = (Map.Entry)i.next(); 

       int key = (Integer)m.getKey(); 
       String value = (String)m.getValue(); 

       System.out.println("Key: " + key + " value: " + value); 
   } 
   
   System.out.println("\nUsing for each in SortedMap");
   for (Map.Entry<Integer, String> e: sm.entrySet()) 
       System.out.println("Key: " + e.getKey() + " value: " + e.getValue()); 
} 
}