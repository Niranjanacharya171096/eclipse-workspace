package com.geeksforgeeks;

//Java program to demonstrate an 
//example of TreeMap using the 
//default constructor 

import java.util.*; 
import java.util.concurrent.*; 

public class TreeMapConstructors { 
	// Driver code 
	 public static void main(String[] args) { 
	     System.out.println("\n\t----TreeMap() constructor----"); 
	     TreeMapConstructor(); 
	     System.out.println("\n\t----TreeMap(Comparator) constructor----"); 
	     TreeMapComparatorConstructor(); 
	     System.out.println("\n\t----TreeMap(Map) constructor----"); 
	     TreeMapMapConstructor(); 
	     System.out.println("\n\t----TreeMap(SortedMap) constructor----"); 
	     TreeMapSortedMapConstructor(); 
	     
	 }  // Function to show TreeMap() 
 // constructor example 
 static void TreeMapConstructor() { 
     // Creating an empty TreeMap 
     TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(); 

     // Mapping string values to int keys 
     tree_map.put(10, "Geeks"); 
     tree_map.put(15, "4"); 
     tree_map.put(20, "Geeks"); 
     tree_map.put(25, "Welcomes"); 
     tree_map.put(30, "You"); 

     // Displaying the TreeMap 
     System.out.println("TreeMap: "+ tree_map); 
 } 
 static void TreeMapComparatorConstructor() { 
     // Creating an empty TreeMap 
     TreeMap<StudentX, Integer> tree_map = new TreeMap<StudentX, Integer>(new SortbyrollNo()); 

     // Mapping string values to int keys 
     tree_map.put(new StudentX(195, "b", "DE"), 2); 
     tree_map.put(new StudentX(131, "a", "PT"), 3); 
     tree_map.put(new StudentX(121, "c", "AU"), 1); 
     tree_map.put(new StudentX(184, "d", "IN"), 4); 

     // Displaying the TreeMap 
     System.out.println("TreeMap: "+ tree_map); 
 } 

 static void TreeMapMapConstructor() { 
     // Creating a Map 
     Map<Integer, String> hash_map = new HashMap<Integer, String>(); 

     // Mapping string values to int keys 
     hash_map.put(10, "Geeks"); 
     hash_map.put(15, "4"); 
     hash_map.put(20, "Geeks"); 
     hash_map.put(25, "Welcomes"); 
     hash_map.put(30, "You"); 

     // Creating the TreeMap using the Map 
     TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(hash_map); 

     // Displaying the TreeMap 
     System.out.println("TreeMap: " + tree_map); 
 } 

 static void TreeMapSortedMapConstructor() { 
     // Creating a SortedMap 
     SortedMap<Integer, String> sorted_map = new ConcurrentSkipListMap<Integer, String>(); 

     // Mapping string values to int keys 
     sorted_map.put(10, "Geeks"); 
     sorted_map.put(15, "4"); 
     sorted_map.put(20, "Geeks"); 
     sorted_map.put(25, "Welcomes"); 
     sorted_map.put(30, "You"); 

     // Creating the TreeMap using the SortedMap 
     TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(sorted_map); 

     // Displaying the TreeMap 
     System.out.println("TreeMap: "+ tree_map); 
 } 
}

class StudentX { 
 int rollno; 
 String name, address; 

 // Constructor 
 public StudentX(int rollno, String name, String address) { 
     this.rollno = rollno; 
     this.name = name; 
     this.address = address; 
 } 

 // Used to print student details 
 // in main() 
 public String toString() { 
     return this.rollno + " " + this.name + " " + this.address; 
 } 
} 

//Comparator implementattion 
class SortbyrollNo implements Comparator<StudentX> { 
 // Used for sorting in ascending order of 
 // roll number 
 public int compare(StudentX a, StudentX b) { 
	 System.out.println(a.name + " "+ b.name);
	 System.out.println(a.rollno + " - "+ b.rollno + " = " + (a.rollno - b.rollno));
     return a.rollno - b.rollno; 
 } 
}