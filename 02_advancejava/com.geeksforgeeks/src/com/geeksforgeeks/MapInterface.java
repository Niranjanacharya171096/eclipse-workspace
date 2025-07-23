package com.geeksforgeeks;

//Java program to demonstrate   
//the working of Map interface 

import java.util.*;  

class MapInterface { 
 public static void main(String args[]) { 
	// Initialization of a Map 
     // using Generics 
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     hm.put("a", 100);//new Integer(100)); 
     hm.put("b", new Integer(200)); 
     hm.put("c", new Integer(300)); 
     hm.put("d", new Integer(400)); 
     System.out.println(hm); 

     // Traversing through the map 
     for (Map.Entry<String, Integer> me: hm.entrySet()) { 
         System.out.print(me.getKey() + ":"); 
         System.out.println(me.getValue()); 
     } 
     for (Map.Entry<String, Integer> me: hm.entrySet()) { 
         System.out.print(me +" ");//.getKey() + ":"); 
         //System.out.println(me.getValue()); 
     } 
 } 
} 