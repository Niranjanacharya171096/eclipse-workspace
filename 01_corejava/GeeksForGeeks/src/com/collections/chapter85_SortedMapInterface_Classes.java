package com.collections;

import java.util.*; 

class chapter85_SortedMapInterface_Classes {  
  public static void main(String[] args) { 
    SortedMap<String, String> tMap = new TreeMap<String, String>(
        new Comparator<String>() { 
          public int compare(String a, String b) { 
            return b.compareTo(a); 
          } 
        }
        ); 

    // Adding elements into the TreeMap using put() 
    tMap.put("India", "1"); 
    tMap.put("Australia", "2"); 
    tMap.put("South Africa", "3"); 
    tMap.put("India", "5"); 
    tMap.put("Africa", "Africa"); 
    
    // Displaying the TreeMap 
    System.out.println(tMap); 

    // Removing items from TreeMap using remove() 
    tMap.remove("Australia"); 
    System.out.println("Map after removing " + "Australia:" + tMap); 
  } 
}
