package com.corejava;

import java.io.*; 

class Geek2 { 
  int num; 
  String name; 
  
  // this would be invoked while an object of that class is created. 
  Geek2(){ 
    System.out.println("Constructor called"); 
  } 
} 

class chapter38_Constructors_DefaultConstructor { 
  public static void main (String[] args) {
    // this would invoke default constructor. 
    Geek2 geek2 = new Geek2(); 
    
    // Default constructor provides the default values to the object like 0, null 
    System.out.println(geek2.name); 
    System.out.println(geek2.num); 
  } 
} 
