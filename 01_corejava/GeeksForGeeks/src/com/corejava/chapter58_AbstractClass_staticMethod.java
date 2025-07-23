package com.corejava;

abstract class Base5 { 
  static void fun() { System.out.println("Derived fun() called"); } 
} 

class chapter58_AbstractClass_staticMethod { 
  public static void main(String args[]) { 
    Base5.fun(); 
  } 
}
