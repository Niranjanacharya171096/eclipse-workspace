package com.corejava;

class Base { 
  String name; 

  // constructor 1 
  Base(){ 
    this(""); 
    System.out.println("No-argument constructor of base class"); 
  } 

  // constructor 2 
  Base(String name) { 
    this.name = name; 
    System.out.println("Calling parameterized constructor of base"); 
  } 
} 

class Derived extends Base { 
  // constructor 3 
  Derived(){ 
    System.out.println("No-argument constructor of derived"); 
  } 
  
  // parameterized constructor 4 
  Derived(String name) { 
    // invokes base class constructor 2 
    super(name); 
    System.out.println("Calling parameterized constructor of derived"); 
  } 
}

class chapter41_CounstructorChaining_usingsuper1 {
  public static void main(String args[]) { 
    // calls parameterized constructor 4 
    Derived obj = new Derived("test"); 
    
    // Calls No-argument constructor 
    // Derived obj = new Derived(); 
  } 
} 
