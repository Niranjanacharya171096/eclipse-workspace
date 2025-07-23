package com.corejava;

class Scope {
  static int z = 12; //static variable
  private int a = 15; //instance variable
  public void method() {
    int b = 3; //local variable
    System.out.println("a: " + a);
    System.out.println("b: " + b);
  }
}

public class chapter12_ScopeOfVariables {
  static int x = 11;
  private int y = 33;
    
  public void method1(int x) {
    //chapter12_ScopeOfVariables t = new chapter12_ScopeOfVariables();
    //this.x = x;
    y = 44;
    System.out.println("x: " + x);
    System.out.println("this.x: " + this.x);
    System.out.println("chapter12_ScopeOfVariables.x: " + chapter12_ScopeOfVariables.x);     
    System.out.println("y: " + y);
    System.out.println("this.y: " + this.y);
    //System.out.println("chapter12_ScopeOfVariables.y: " + chapter12_ScopeOfVariables.y);     
  }
 
  public static void main(String args[]){
    chapter12_ScopeOfVariables t = new chapter12_ScopeOfVariables();
        
    System.out.println("x: " + x);
    //System.out.println("this.x: " + this.x); //cannot use this in static
    System.out.println("chapter12_ScopeOfVariables.x: " + chapter12_ScopeOfVariables.x);
    System.out.println("t.x: " + t.x);
    //System.out.println("y: " + y);
    System.out.println("t.y: " + t.y);
    //System.out.println("chapter12_ScopeOfVariables.y: " + chapter12_ScopeOfVariables.y);     
    t.method1(5);
    
    Scope s = new Scope();
    //System.out.println("z: " + z);
    System.out.println("Scope.z: " + Scope.z);
    System.out.println("s.z: " + s.z);
    //System.out.println(a + s.a + Scope.a);
    //System.out.println(b + s.b + Scope.b);
    s.method();
  }
}