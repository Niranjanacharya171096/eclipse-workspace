package com.geeksforgeeks;

//Java program to demonstrate the 
//creation of SortedMap object using 
//the TreeMap class 

import java.util.*; 

class SortedMapInterfaceClass {  
 public static void main(String[] args) { 
     SortedMap<String, String> tm = new TreeMap<String, String>(
    		 new Comparator<String>() { 
    			 public int compare(String a, String b) { 
    				 return b.compareTo(a); 
    			 } 
    		 }
    		); 

     // Adding elements into the TreeMap 
     // using put() 
     tm.put("India", "1"); 
     tm.put("Australia", "2"); 
     tm.put("South Africa", "3"); 
     tm.put("India", "5"); 
     tm.put("Africa", "Africa"); 

     // Displaying the TreeMap 
     System.out.println(tm); 

     // Removing items from TreeMap 
     // using remove() 
     tm.remove("Australia"); 
     System.out.println("Map after removing " + "Australia:" + tm); 
 } 
}
