package com.corejava;

import java.io.*; 

//abstract class 
abstract class Shape2 { 
  // declare fields 
  String objectName = " "; 
   
  Shape2(String name) { 
    this.objectName = name; 
  } 
   
  // declare non-abstract methods 
  // it has default implementation 
  public void moveTo(int x, int y) { 
    System.out.println(this.objectName + " " + "has been moved to" + " x = " + x + " and y = " + y); 
  } 
   
  // abstract methods which will be 
  // implemented by its subclass(es) 
  abstract public void draw(); 
  abstract public double area(); 
} 

class rectangle2 extends Shape2 { 
  int length, width; 
     
  // constructor 
  rectangle2(int length, int width, String name) { 
    super(name); 
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

class circle2 extends Shape2 { 
  double pi = 3.14; 
  int radius; 
  
  //constructor 
  circle2(int radius, String name) { 
    super(name); 
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

class chapter59_AbstractVsInterface_AbstractClass { 
  public static void main (String[] args) { 
    System.out.println("\n\tAbstract"); 
    
    // creating the Object of rectangle class 
    // and using Shape class reference. 
    //Shape2 sh1 = new Shape2(); // not possible for Abstract class
    Shape2 rect2 = new rectangle2(2,3, "rectangle"); 
    System.out.println("Area of rectangle: " + rect2.area()); 
    rect2.moveTo(1,2); 
    rect2.draw();
    
    // creating the Objects of circle class 
    Shape2 crcle2 = new circle2(2, "Circle"); 
    System.out.println("Area of circle: " + crcle2.area()); 
    crcle2.moveTo(2,4); 
    crcle2.draw();
  } 
} 
