package com.geeksforgeeks;

//Java program to illustrate the 
//concept of abstract class 

import java.io.*; 

//abstract class 
abstract class Shape1 { 
	 // declare fields 
	 String objectName = " "; 
	   
	 Shape1(String name) { 
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

class rectangle1 extends Shape1 { 
	 int length, width; 
	   
	 // constructor 
	 rectangle1(int length, int width, String name) { 
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

class circle1 extends Shape1 { 
	 double pi = 3.14; 
	 int radius; 
	   
	 //constructor 
	 circle1(int radius, String name) { 
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

//Java program to illustrate the 
//concept of interface  

interface Shape2 { 
	 // abstract method 
	 void draw(); 
	 double area(); 
} 
	
class rectangle2 implements Shape2 { 
	 int length, width; 
	   
	 // constructor 
	 rectangle2(int length, int width) { 
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

class circle2 implements Shape2 { 
	 double pi = 3.14; 
	 int radius; 
	
	 //constructor 
	 circle2(int radius) { 
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

class AbstractInterface { 
 public static void main (String[] args) { 
	 System.out.println("\n\tAbstract"); 

	 // creating the Object of rectangle class 
	 // and using Shape class reference. 
	 //Shape1 sh1 = new Shape1(); // not possible for Abstract class
	 Shape1 rect1 = new rectangle1(2,3, "rectangle"); 
	 System.out.println("Area of rectangle: " + rect1.area()); 
	 rect1.moveTo(1,2); 
	 rect1.draw();
	 
	 // creating the Objects of circle class 
	 Shape1 circle1 = new circle1(2, "Circle"); 
	 System.out.println("Area of circle: " + circle1.area()); 
	 circle1.moveTo(2,4); 
	 circle1.draw();
	 System.out.println("\n\tInterface"); 
	 
	 // creating the Object of rectangle class 
	 // and using Shape interface reference. 
	 //Shape2 sh2 = new Shape2(); // not possible for Interface class
	 Shape2 rect2 = new rectangle2(2,3); 
	 System.out.println("Area of rectangle: " + rect2.area()); 
	 rect2.draw();
	 
	 // creating the Objects of circle class 
	 Shape2 circle2 = new circle2(2); 
	 System.out.println("Area of circle: " + circle2.area()); 
	 circle2.draw();
 } 
} 
