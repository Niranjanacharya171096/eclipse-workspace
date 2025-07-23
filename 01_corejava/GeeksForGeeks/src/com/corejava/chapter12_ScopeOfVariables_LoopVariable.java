package com.corejava;

public class chapter12_ScopeOfVariables_LoopVariable {
  public static void main(String args[]){
    {
      // The variable x has scope within brackets
      int x = 10;
      System.out.println(x);
    }
    // Uncommenting below line would produceerror since variable x is out of scope.
    // System.out.println(x); 
  }
}
