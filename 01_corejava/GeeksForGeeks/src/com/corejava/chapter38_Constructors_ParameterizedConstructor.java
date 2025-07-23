package com.corejava;

import java.io.*; 

class Geek3 { 
  // data members of the class. 
  String name; 
  int id; 

  // constructor would initialize data members with the values of passed arguments
  // while object of that class created. 
  Geek3(String name, int id) { 
    this.name = name; 
    this.id = id; 
  } 
} 

class chapter38_Constructors_ParameterizedConstructor { 
  public static void main (String[] args) { 
    // this would invoke the parameterized constructor. 
    Geek3 geek3 = new Geek3("adam", 1); 
    System.out.println("GeekName:" + geek3.name + " and GeekId:" + geek3.id); 
  } 
} 
