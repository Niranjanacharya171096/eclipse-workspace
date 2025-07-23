package com.corejava;

public class chapter12_ScopeOfVariables_LocalVariable {
  static int x = 11;
  private int y = 33;
  public void  method1(int x) {
    chapter12_ScopeOfVariables_LocalVariable t = new chapter12_ScopeOfVariables_LocalVariable();
    this.x = 22;
    y = 44;
    
    System.out.println("chapter37_LocalVariable.x: " + chapter12_ScopeOfVariables_LocalVariable.x);
    System.out.println("t.x: " + t.x);
    System.out.println("t.y: " + t.y);
    System.out.println("y: " + y);
  }
    
  public static void main(String args[]){
    chapter12_ScopeOfVariables_LocalVariable t = new chapter12_ScopeOfVariables_LocalVariable();
    t.method1(5);
  }
}
