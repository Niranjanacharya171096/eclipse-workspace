package com.corejava;

import java.io.*; 

class Geek4 { 
  // constructor with one argument 
  Geek4(String name) { 
    System.out.println("Constructor with one argument - String: " + name); 
  } 
  
  // constructor with two arguments 
  Geek4(String name, int age) { 
    System.out.println("Constructor with two arguments: String and Integer: " + name + " "+ age); 
  } 
  
  // Constructor with one argument but with different type than previous..
  Geek4(long id) { 
    System.out.println("Constructor with one argument: Long: " + id); 
  } 
} 

class chapter38_Constructors_Overloading { 
  public static void main(String[] args) { 
    // Creating the objects of the class named 'Geek4' by passing different arguments 
  
    // Invoke the constructor with one argument of type 'String'. 
    Geek4 geek1 = new Geek4("Shikhar"); 
  
    // Invoke the constructor with two arguments 
    Geek4 geek2 = new Geek4("Dharmesh", 26); 
  
    // Invoke the constructor with one argument of type 'Long'. 
    Geek4 geek3 = new Geek4(325614567); 
  } 
} 
