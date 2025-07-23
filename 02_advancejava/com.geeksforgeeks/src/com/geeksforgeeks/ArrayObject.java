package com.geeksforgeeks;

class Student2 { 
  public int roll_no; 
  public String name; 
  
  Student2(int roll_no, String name) { 
    this.roll_no = roll_no; 
    this.name = name; 
  } 
} 

// Elements of the array are objects of a class Student2. 
public class ArrayObject { 
  public static void main (String[] args) { 
    // declares an Array of integers. 
    Student2[] arr; 
    
    // allocating memory for 5 objects of type Student2. 
    arr = new Student2[5]; 
    
    // initialize the first elements of the array 
    arr[0] = new Student2(1,"aman");   
    // initialize the second elements of the array 
    arr[1] = new Student2(2,"vaibhav"); 
    // so on... 
    arr[2] = new Student2(3,"shikar"); 
    arr[3] = new Student2(4,"dharmesh"); 
    arr[4] = new Student2(5,"mohit"); 
    
    // accessing the elements of the specified array 
    for (int i = 0; i<arr.length; i++) 
      System.out.println("Element at " + i + ": " + arr[i].roll_no +" "+ arr[i].name); 
  } 
} 
