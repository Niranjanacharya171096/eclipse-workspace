package com.corejava;

public class chapter11_Variables_LocalVariables { 
  public void StudentAge() { 
    // local variable age 
    int age = 0; 
    age = age + 5; 
    System.out.println("Student age is: " + age); 
  } 

  public static void main(String args[]) { 
    chapter11_Variables_LocalVariables obj = new chapter11_Variables_LocalVariables(); 
    obj.StudentAge(); 
  } 
} 
