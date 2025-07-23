package com.corejava;

class Employee { 
  public int roll_no; 
  public String name; 
  
  Employee(int roll_no, String name) { 
    this.roll_no = roll_no; 
    this.name = name; 
  } 
} 

// Elements of the array are objects of a class Employee. 
public class chapter28_Arrays_ObjectArray { 
  public static void main (String[] args) { 
    // declares an Array of integers. 
    Employee[] arr; 
    
    // allocating memory for 5 objects of type Employee. 
    arr = new Employee[5]; 
    
    // initialize the first elements of the array 
    arr[0] = new Employee(1,"aman");   
    // initialize the second elements of the array 
    arr[1] = new Employee(2,"vaibhav"); 
    // so on... 
    arr[2] = new Employee(3,"shikar"); 
    arr[3] = new Employee(4,"dharmesh"); 
    arr[4] = new Employee(5,"mohit"); 
    
    // accessing the elements of the specified array 
    for (int i = 0; i<arr.length; i++) 
      System.out.println("Element at " + i + ": " + arr[i].roll_no +" "+ arr[i].name); 
  } 
} 
