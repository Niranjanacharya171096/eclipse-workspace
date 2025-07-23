package com.corejava;

public class chapter48_MethodOverloading_StaticMethodReturn {  
  public static int foo(int a) { return 10; } 
  public static char foo(int a, int b) { return'a'; } 
  
  public static void main(String args[]) { 
    System.out.println(foo(1)); 
    System.out.println(foo(1, 2)); 
  } 
} 
