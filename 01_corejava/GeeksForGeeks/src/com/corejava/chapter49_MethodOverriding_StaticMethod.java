package com.corejava;

class Parent4 { 
  //Static method in base class which will be hidden in subclass 
  static void m1() { 
    System.out.println("From parent static m1()"); 
  } 
  
  //Non-static method which will be overridden in derived class 
  void m2() { 
    System.out.println("From parent non-static(instance) m2()"); 
  } 
} 

class Child6 extends Parent4 { 
  //This method hides m1() in Parent4 
  static void m1() { 
    System.out.println("From child static m1()"); 
  } 
  
  //This method overrides m2() in Parent4 
  @Override
  public void  m2() { 
    System.out.println("From child non-static(instance) m2()"); 
  } 
} 

//Driver class 
class chapter49_MethodOverriding_StaticMethod { 
  public static void main(String[] args) { 
    Parent4 obj1 = new Child6(); 
       
    //As per overriding rules this should call to class Child6 static overridden method.
    //Since static method can not be overridden, it calls Parent4's m1() 
    obj1.m1(); 
    
    //Here overriding works and Child6's m2() is called 
    obj1.m2(); 
  } 
}
