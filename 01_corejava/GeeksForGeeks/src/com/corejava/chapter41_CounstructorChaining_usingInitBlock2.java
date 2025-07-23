package com.corejava;

class Temp4 { 
  // block to be executed first 
  { 
    System.out.println("init"); 
  } 
  Temp4(){ 
    System.out.println("default constructor"); 
  } 
  Temp4(int x) { 
    System.out.println("Parameterized constructor:" + x); 
  } 
  
  // block to be executed after the first block which has been defined above. 
  { 
    System.out.println("second"); 
  } 
}

class chapter41_CounstructorChaining_usingInitBlock2 {
  public static void main(String[] args) { 
    new Temp4(); 
    new Temp4(10); 
  } 
} 
