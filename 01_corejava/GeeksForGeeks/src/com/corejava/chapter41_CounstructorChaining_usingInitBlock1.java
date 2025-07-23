package com.corejava;

class Temp3 { 
  // block to be executed before any constructor. 
  { 
    System.out.println("init block"); 
  } 

  // no-arg constructor 
  Temp3(){ 
    System.out.println("default"); 
  } 

  // constructor with one arguemnt. 
  Temp3(int x) { 
    System.out.println(x); 
  } 
}

class chapter41_CounstructorChaining_usingInitBlock1 {
  public static void main(String[] args) { 
    // Object creation by calling no-argument constructor. 
    new Temp3(); 
    
    // Object creation by calling parameterized constructor with one parameter. 
    new Temp3(10); 
  } 
} 
