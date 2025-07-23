package com.corejava;

//A simple interface 
interface Interface { 
  // public, static and final 
  final int a = 10; 
  // public and abstract  
  void display(); 
/*  default or static void display() {
    System.out.println("Geek"); 
  }
 */
} 

//A class that implements the interface. 
class chapter55_Interface_EX1 implements Interface { 
  // Implementing the capabilities of interface. 
  public void display() { 
    System.out.println("Geek"); 
  } 
  
  // Driver Code 
  public static void main (String[] args) { 
    chapter55_Interface_EX1 t = new chapter55_Interface_EX1(); 
    t.display(); 
    System.out.println(a); 
    //Interface.display(); //for static void display(){}  
  } 
}
