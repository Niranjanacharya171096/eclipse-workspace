package com.collections;

import java.util.*;  

class chapter81_MapInterface { 
  public static void main(String args[]) { 
    // Initialization of a Map using Generics 
    Map<String, Integer> hMap = new HashMap<String, Integer>(); 

    hMap.put("a", 100);//new Integer(100)); 
    hMap.put("b", new Integer(200)); 
    hMap.put("c", new Integer(300)); 
    hMap.put("d", new Integer(400)); 
    System.out.println(hMap); 

    // Traversing through the map 
    for (Map.Entry<String, Integer> me: hMap.entrySet()) { 
      System.out.print(me.getKey() + ":"); 
      System.out.println(me.getValue()); 
    } 
    for (Map.Entry<String, Integer> me: hMap.entrySet()) { 
      System.out.print(me +" ");//.getKey() + ":"); 
      //System.out.println(me.getValue()); 
    } 
  } 
} 