package com.corejava;

abstract class Base1 { 
  abstract void fun(); 
} 

class Derived1 extends Base1 { 
  void fun() { 
    System.out.println("Derived1 fun() called"); 
  } 
} 

class chapter58_AbstractClass_NoInstance { 
  public static void main(String args[]) { 
    // Uncommenting the following line will cause compiler error as 
    //the line tries to create an instance of abstract class. 
    // Base1 b = new Base1(); 

    // We can have references of Base1 type. 
    Base1 b = new Derived1(); 
    b.fun(); 
  } 
}
