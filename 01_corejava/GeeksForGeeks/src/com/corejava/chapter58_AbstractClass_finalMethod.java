package com.corejava;

abstract class Base4 { 
  final void fun() { System.out.println("Derived fun() called"); } 
} 

class Derived4 extends Base4 { } 

class chapter58_AbstractClass_finalMethod { 
  public static void main(String args[]) { 
    Base4 b = new Derived4(); 
    b.fun(); 
  } 
}
