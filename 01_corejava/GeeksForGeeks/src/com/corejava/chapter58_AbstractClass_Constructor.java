package com.corejava;

abstract class Base2 { 
  Base2() { 
    System.out.println("Base Constructor Called"); 
  } 
  abstract void fun(); 
} 

class Derived2 extends Base2 { 
  void fun() { 
    System.out.println("Derived2 fun() called"); 
  } 
} 

class chapter58_AbstractClass_Constructor { 
  public static void main(String args[]) { 
    Derived2 d = new Derived2(); 
    d.fun(); 
  } 
}
