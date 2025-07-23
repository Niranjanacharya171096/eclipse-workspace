package com.corejava;

class Parent1 {   
  void Print() { 
    System.out.println("parent class"); 
  } 
} 

class subclass1 extends Parent1 { 
  void Print() { 
    System.out.println("subclass1"); 
  } 
} 

class subclass2 extends Parent1 { 
  void Print() { 
    System.out.println("subclass2"); 
  } 
} 

class chapter47_Polymorphism_MethodOverriding1 { 
  public static void main(String[] args) { 
    Parent1 a; 
    
    a = new subclass1(); 
    a.Print(); 
    
    a = new subclass2(); 
    a.Print(); 
  } 
} 
 
