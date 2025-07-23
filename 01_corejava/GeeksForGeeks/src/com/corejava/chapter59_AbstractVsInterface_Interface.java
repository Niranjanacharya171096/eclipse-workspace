package com.corejava;

import java.io.*; 

interface Shape3 { 
  // abstract method 
  void draw(); 
  double area(); 
} 
  
class rectangle3 implements Shape3 { 
  int length, width; 
     
  // constructor 
  rectangle3(int length, int width) { 
    this.length = length; 
    this.width = width; 
  } 
     
  @Override
  public void draw() { 
    System.out.println("rectangle has been drawn ");  
  } 
     
  @Override
  public double area() { 
    return (double)(length*width); 
  } 
}  

class circle3 implements Shape3 { 
  double pi = 3.14; 
  int radius; 
  
  //constructor 
  circle3(int radius) { 
    this.radius = radius; 
  } 
     
  @Override
  public void draw() { 
    System.out.println("circle has been drawn ");  
  } 
     
  @Override
  public double area() { 
    return (double)((pi*radius*radius)/2); 
  } 
} 

class chapter59_AbstractVsInterface_Interface { 
  public static void main (String[] args) { 
    System.out.println("\n\tInterface"); 
   
    // creating the Object of rectangle class 
    // and using Shape interface reference. 
    //Shape3 sh2 = new Shape3(); // not possible for Interface class
    Shape3 rect3 = new rectangle3(2,3); 
    System.out.println("Area of rectangle: " + rect3.area()); 
    rect3.draw();
    
    // creating the Objects of circle class 
    Shape3 crcle3 = new circle3(2); 
    System.out.println("Area of circle: " + crcle3.area()); 
    crcle3.draw();
  }   
} 
