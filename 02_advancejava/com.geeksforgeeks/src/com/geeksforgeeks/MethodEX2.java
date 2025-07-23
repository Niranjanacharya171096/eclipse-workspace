package com.geeksforgeeks;

import java.io.*; 

class Test1 { 
  public static int i = 0; 
  // constructor of class which counts the number of the objects of the class. 
  Test1() { 
    i++;   
  } 
  // static method is used to access static members of the class  
  // and for getting total no of objects of the same class created so far 
  public static int get() { 
    // statements to be executed.... 
    return i; 
  } 
  
  // Instance method calling object directly that is created inside another class 'MethodEX2'. 
  // Can also be called by object directly created in the same class  
  // and from another method defined in the same class  
  // and return integer value as return type is int. 
  public int m1() { 
    System.out.println("Inside the method m1 by object of GFG class"); 
    // calling m2() method within the same class. 
    this.m2();  
    // statements to be executed if any 
    return 1; 
  } 
  
  // It doesn't return anything as return type is 'void'. 
  public void  m2() { 
    System.out.println("In method m2 came from method m1"); 
  } 
} 

class MethodEX2 { 
  public static void main(String[] args) { 
    // Creating an instance of the class 
    Test1 obj = new Test1(); 
    
    // Calling the m1() method by the object created in above step. 
    int i = obj.m1(); 
    System.out.println("Control returned after method m1:" + i); 
    
    // Call m2() method obj.m2(); 
    int no_of_objects = Test1.get(); 
    
    System.out.print("No of instances created till now: "); 
    System.out.println(no_of_objects);     
  } 
} 
