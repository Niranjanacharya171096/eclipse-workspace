package com.collections;

import java.util.*; 
import java.util.concurrent.*; 

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

//Comparator implementation 
class SortbyrollNo implements Comparator<StudentX> { 
  // Used for sorting in ascending order of 
  // roll number 
  public int compare(StudentX a, StudentX b) { 
    System.out.println(a.name + " "+ b.name);
    System.out.println(a.rollno + " - "+ b.rollno + " = " + (a.rollno - b.rollno));
    return a.rollno - b.rollno; 
  } 
}

public class chapter86_TreeMapClass_Constructors { 
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
    TreeMap<Integer, String> tMap = new TreeMap<Integer, String>(); 
    
    // Mapping string values to int keys 
    tMap.put(10, "Geeks"); 
    tMap.put(15, "4"); 
    tMap.put(20, "Geeks"); 
    tMap.put(25, "Welcomes"); 
    tMap.put(30, "You"); 
    
    // Displaying the TreeMap 
    System.out.println("TreeMap: "+ tMap); 
  } 
  static void TreeMapComparatorConstructor() { 
    // Creating an empty TreeMap 
    TreeMap<StudentX, Integer> tMap = new TreeMap<StudentX, Integer>(new SortbyrollNo()); 
    
    // Mapping string values to int keys 
    tMap.put(new StudentX(195, "b", "DE"), 2); 
    tMap.put(new StudentX(131, "a", "PT"), 3); 
    tMap.put(new StudentX(121, "c", "AU"), 1); 
    tMap.put(new StudentX(184, "d", "IN"), 4); 
    
    // Displaying the TreeMap 
    System.out.println("TreeMap: "+ tMap); 
  }  

  static void TreeMapMapConstructor() { 
    // Creating a Map 
    Map<Integer, String> hMap = new HashMap<Integer, String>(); 
    
    // Mapping string values to int keys 
    hMap.put(10, "Geeks"); 
    hMap.put(15, "4"); 
    hMap.put(20, "Geeks"); 
    hMap.put(25, "Welcomes"); 
    hMap.put(30, "You"); 
    
    // Creating the TreeMap using the Map 
    TreeMap<Integer, String> tMap = new TreeMap<Integer, String>(hMap); 

    // Displaying the TreeMap 
    System.out.println("TreeMap: " + tMap); 
  } 

  static void TreeMapSortedMapConstructor() { 
    // Creating a SortedMap 
    SortedMap<Integer, String> sMap = new ConcurrentSkipListMap<Integer, String>(); 

    // Mapping string values to int keys 
    sMap.put(10, "Geeks"); 
    sMap.put(15, "4"); 
    sMap.put(20, "Geeks"); 
    sMap.put(25, "Welcomes"); 
    sMap.put(30, "You"); 
    
    // Creating the TreeMap using the SortedMap 
    TreeMap<Integer, String> tMap = new TreeMap<Integer, String>(sMap); 
    
    // Displaying the TreeMap 
    System.out.println("TreeMap: "+ tMap); 
 }  
} 
  
