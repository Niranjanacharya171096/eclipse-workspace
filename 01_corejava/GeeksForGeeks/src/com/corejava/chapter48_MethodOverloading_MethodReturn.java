package com.corejava;

class A2 { 
  public static int foo(int a) { return 10; } 
  public static char foo(int a, int b) { return'a'; } 
} 

public class chapter48_MethodOverloading_MethodReturn { 
  public static void main(String args[]) { 
    A2 a = new A2(); 
    System.out.println(a.foo(1)); 
    System.out.println(a.foo(1, 2)); 
  } 
} 
