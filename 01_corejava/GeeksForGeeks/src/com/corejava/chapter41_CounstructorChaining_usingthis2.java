package com.corejava;

class Temp2 { 
  //default constructor 1 
  Temp2(){ 
    System.out.println("default"); 
  } 
  
  //parameterized constructor 2 
  Temp2(int x) { 
    //invokes default constructor 
    this(); 
    System.out.println(x); 
  } 
  
  //parameterized constructor 3 
  Temp2(int x, int y) { 
    //invokes parameterized constructor 2 
    this(5); 
    System.out.println(x * y); 
  } 
} 

class chapter41_CounstructorChaining_usingthis2 {
  public static void main(String args[]){ 
    //invokes parameterized constructor 3 
    new Temp2(8, 10); 
  } 
} 
