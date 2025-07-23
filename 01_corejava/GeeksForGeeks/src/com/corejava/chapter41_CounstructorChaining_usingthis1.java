package com.corejava;

class Temp1 { 
  // default constructor 1 
  // default constructor will call another constructor using this keyword from same class 
  Temp1() { 
    // calls constructor 2 
    this(5); 
    System.out.println("The Default constructor"); 
  } 
  
  // parameterized constructor 2 
  Temp1(int x) { 
    // calls constructor 3 
    this(5, 15); 
    System.out.println(x); 
  } 
  
  // parameterized constructor 3 
  Temp1(int x, int y) { 
    System.out.println(x * y); 
  } 
}

class chapter41_CounstructorChaining_usingthis1 {
  public static void main(String args[]) { 
    // invokes default constructor first 
    new Temp1(); 
  } 
} 
