package com.geeksforgeeks;

class ArrayElementAccess { 
  public static void main (String[] args) {          
    // declares an Array of integers. 
    int[] arr; 
    
    // allocating memory for 5 integers. 
    arr = new int[5]; 
    
    // initialize the first elements of the array 
    arr[0] = 10; 
    // initialize the second elements of the array 
    arr[1] = 20; 
    //so on... 
    arr[2] = 30; 
    arr[3] = 40; 
    arr[4] = 50; 
    
    // accessing the elements of the specified array 
    for (int i = 0; i<arr.length; i++) 
      System.out.println("Element at index " + i+  ": "+ arr[i]);           
  } 
} 
