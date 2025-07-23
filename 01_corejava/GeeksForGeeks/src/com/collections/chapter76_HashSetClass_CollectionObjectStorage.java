package com.collections;

import java.io.*; 
import java.util.*; 

class chapter76_HashSetClass_CollectionObjectStorage {    
  public static void main(String[] args) { 
    // Instantiate an object of HashSet 
    HashSet<ArrayList> hSet = new HashSet<>(); 

    // create ArrayList list1 
    ArrayList<Integer> aList1 = new ArrayList<>(); 
    // create ArrayList list2 
    ArrayList<Integer> aList2 = new ArrayList<>(); 
    // create ArrayList list3 
    ArrayList<Integer> aList3 = new ArrayList<>(); 

    // Add elements using add method 
    aList1.add(1); 
    aList1.add(2); 
    
    aList2.add(1); 
    aList2.add(2); 
    
    aList3.add(3); 
    aList3.add(4); 
    
    hSet.add(aList1); 
    hSet.add(aList2); 
    hSet.add(aList3); 
    
    // print the set size to understand the internal storage of ArrayList in Set 
    System.out.println(aList1 + " " +aList2+ " " +aList3); 
    System.out.println(hSet.size()); 
    System.out.println(hSet); 
  } 
}
