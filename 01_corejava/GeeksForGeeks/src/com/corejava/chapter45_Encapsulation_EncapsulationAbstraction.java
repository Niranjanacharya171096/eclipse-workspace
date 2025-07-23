package com.corejava;

abstract class Shape {
  String color;
 
  // these are abstract methods
  abstract double area();
  public abstract String toString();
  
  // abstract class can have constructor
  public Shape(String color) {
    System.out.println("Shape constructor called");
    this.color = color;
  }
 
  // this is a concrete method
  public String getColor() { 
    return color; 
  }
}

class Circle extends Shape {
  double radius;
  
  public Circle(String color, double radius) {
    // calling Shape constructor
    super(color);
    System.out.println("Circle constructor called");
    this.radius = radius;
  }
 
  @Override 
  double area() {
    return Math.PI * Math.pow(radius, 2);
  }

  @Override 
  public String toString() {
    return "Circle color is " + super.getColor() + "and area is: " + area();
  }
}

class Rectangle extends Shape {
  double length;
  double width;
  
  public Rectangle(String color, double length, double width) {
    // calling Shape constructor
    super(color);
    System.out.println("Rectangle constructor called");
    this.length = length;
    this.width = width;
  }
 
  @Override 
  double area() { 
    return length * width; 
  }
 
  @Override 
  public String toString() {
    return "Rectangle color is " + super.getColor() + "and area is: " + area();
  }
}

class Encapsulate2 {
  // private variables declared
  // these can only be accessed by
  // public methods of class
  private String geekName;
  private int geekRoll;
  private int geekAge;
  
  // get method for age to access
  // private variable geekAge
  public int getAge() { return geekAge; }
  
  // get method for name to access
  // private variable geekName
  public String getName() { return geekName; }
 
  // get method for roll to access
  // private variable geekRoll
  public int getRoll() { return geekRoll; }
  
  // set method for age to access
  // private variable geekage
  public void setAge(int newAge) { geekAge = newAge; }
  
  // set method for name to access
  // private variable geekName
  public void setName(String newName) {
    geekName = newName;
  }
 
  // set method for roll to access
  // private variable geekRoll
  public void setRoll(int newRoll) { geekRoll = newRoll; }
} 

public class chapter45_Encapsulation_EncapsulationAbstraction {
  public static void main(String[] args) {
    Encapsulate2 obj = new Encapsulate2();
    
    // setting values of the variables
    obj.setName("Harsh");
    obj.setAge(19);
    obj.setRoll(51);
 
    // Displaying values of the variables
    System.out.println("Geek's name: " + obj.getName());
    System.out.println("Geek's age: " + obj.getAge());
    System.out.println("Geek's roll: " + obj.getRoll());
    
    // Direct access of geekRoll is not possible
    // due to encapsulation as it’s private
    // System.out.println("Geek's roll: " + obj.geekName);
    
    Shape s1 = new Circle("Red", 2.2);
    Shape s2 = new Rectangle("Yellow", 2, 4);
    
    System.out.println(s1.toString());
    System.out.println(s2.toString());  
  }
}
