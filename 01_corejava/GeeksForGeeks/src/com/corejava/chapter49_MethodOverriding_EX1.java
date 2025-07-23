package com.corejava;

//Base Class 
class Parent2 { 
  void show() { 
    System.out.println("Parent2's show()"); 
  } 
} 

//Inherited class 
class Child4 extends Parent2 { 
  //This method overrides show() of Parent2 
  @Override
  void show() { 
    System.out.println("Child4's show()"); 
  } 
} 

//Driver class 
class chapter49_MethodOverriding_EX1 { 
  public static void main(String[] args) { 
    //If a Parent2 type reference refers to a Parent2 object, then Parent2's show is called 
    Parent2 obj1 = new Parent2(); 
    obj1.show(); 

    //If a Parent2 type reference refers to a Child4 object Child4's show() is called.
    //This is called RUN TIME POLYMORPHISM. 
    Parent2 obj2 = new Child4(); 
    obj2.show(); 
  } 
} 
