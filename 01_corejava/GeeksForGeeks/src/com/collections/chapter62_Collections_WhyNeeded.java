package com.collections;

import java.io.*;     
import java.util.*; 

class chapter62_Collections_WhyNeeded {  
  public static void main(String[] args) { 
    // Creating instances of the array, vector and hashtable 
    int arr[] = new int[] { 1, 2, 3, 4 };     
    Vector<Integer> vec = new Vector(); 
    Hashtable<Integer, String> hTable = new Hashtable(); 
  
    // Adding the elements into the vector 
    vec.addElement(3); 
    vec.addElement(5); 
    
    // Adding the element into the hashtable 
    hTable.put(0, "geeks"); 
    hTable.put(1, "4geeks"); 
    
    // Array instance creation requires [], while Vector and hashtable require () 
    // Vector element insertion requires addElement(), 
    //but hashtable element insertion requires put() 
    
    // Accessing the first element of the array, vector and hashtable 
    System.out.println("arr[0]: " + arr[0]); 
    System.out.println("vec.elementAt(0): " + vec.elementAt(0)); 
    System.out.println("hTable.get(0): " + hTable.get(0)); 
  
    // Array elements are accessed using [], vector elements using elementAt() 
    // and hashtable elements using get() 
  } 
} 
