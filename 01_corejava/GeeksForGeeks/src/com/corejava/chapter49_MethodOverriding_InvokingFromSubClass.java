package com.corejava;

//Base Class 
class Parent5 { 
  void show() { 
    System.out.println("Parent5's show()"); 
  } 
} 

//Inherited class 
class Child7 extends Parent5 { 
  //This method overrides show() of Parent5 
  @Override
  void show() { 
    super.show(); 
    System.out.println("Child7's show()"); 
  } 
} 

//Driver class 
class chapter49_MethodOverriding_InvokingFromSubClass { 
  public static void main(String[] args) { 
    Parent5 obj = new Child7(); 
    obj.show(); 
  } 
} 
