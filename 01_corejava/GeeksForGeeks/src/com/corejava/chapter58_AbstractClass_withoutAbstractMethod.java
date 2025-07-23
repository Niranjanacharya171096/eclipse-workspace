package com.corejava;

abstract class Base3 { 
  void fun() { System.out.println("Base fun() called"); } 
} 

class Derived3 extends Base3 { } 

class chapter58_AbstractClass_withoutAbstractMethod { 
  public static void main(String args[]) { 
    Derived3 d = new Derived3(); 
    d.fun(); 
  } 
}
