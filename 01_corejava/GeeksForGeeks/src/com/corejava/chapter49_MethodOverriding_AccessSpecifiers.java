package com.corejava;

class Parent3 { 
  //private methods are not overridden 
  private void m1() { 
    System.out.println("From parent m1()"); 
  } 

  protected void m2() { 
    System.out.println("From parent m2()"); 
  } 
} 

class Child5 extends Parent3 { 
  //new m1() method unique to Child5 class 
  private void m1() { 
    System.out.println("From child m1()"); 
  } 
  
  //overriding method with more accessibility 
  @Override
  public void  m2() { 
    System.out.println("From child m2()"); 
  } 
} 

//Driver class 
class chapter49_MethodOverriding_AccessSpecifiers { 
  public static void main(String[] args) { 
    Parent3 obj1 = new Parent3(); 
    obj1.m2(); 
    Parent3 obj2 = new Child5(); 
    obj2.m2(); 
  } 
} 
