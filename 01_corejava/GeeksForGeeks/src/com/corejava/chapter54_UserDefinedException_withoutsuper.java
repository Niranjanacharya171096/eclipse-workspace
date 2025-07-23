package com.corejava;

class MyException2 extends Exception { }

//A Class that uses above MyException2
public class chapter54_UserDefinedException_withoutsuper { 
// Driver Program 
  public static void main(String args[]) { 
    try{
      // Throw an object of user defined exception 
      throw new MyException2(); 
    } catch (MyException2 ex) { 
      System.out.println("Caught"); 
      System.out.println(ex.getMessage()); 
    } 
  } 
} 
