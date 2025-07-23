package com.corejava;

//Base Class 
class Parent6 { 
  void show() { 
    System.out.println("Parent6's show()"); 
  } 
} 

//Inherited class 
class Child8 extends Parent6 { 
  //This method overrides show() of Parent6 
  void show() { 
    System.out.println("Child8's show()"); 
  } 
} 

//Inherited class 
class GrandChild extends Child8 { 
  //This method overrides show() of Parent6 
  void show() { 
    System.out.println("GrandChild'sshow()"); 
  } 
} 

//Driver class 
class chapter49_MethodOverriding_MultiLevel { 
  public static void main(String[] args) { 
    Parent6 obj1 = new GrandChild(); 
    obj1.show(); 
  } 
} 
