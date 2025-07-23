package com.geeksforgeeks;

//we need to import java.util.Arrays to use Arrays.equals(). 
import java.util.Arrays; 

class ArrayCompare { 
  public static void main (String[] args) { 
    int arr1[] = {1, 2, 3}; 
    int arr2[] = {1, 2, 3}; 
    if (Arrays.equals(arr1, arr2)) 
      System.out.println("Same"); 
    else
      System.out.println("Not same"); 
  } 
}

//class ArrayCompare { 
//  public static void main (String[] args) { 
//    int arr1[] = {1, 2, 3}; 
//    int arr2[] = {1, 2, 3}; 
//    if (arr1 == arr2) // Same as arr1.equals(arr2) – compares reference variables
//      System.out.println("Same"); 
//    else
//      System.out.println("Not same"); 
//  } 
//}