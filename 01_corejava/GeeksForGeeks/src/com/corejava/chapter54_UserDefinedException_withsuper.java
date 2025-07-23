package com.corejava;

class MyException1 extends Exception { 
  public MyException1(String s) { 
    // Call constructor of parent Exception 
    super(s); 
  } 
} 

// A Class that uses above MyException1
public class chapter54_UserDefinedException_withsuper { 
// Driver Program 
  public static void main(String args[]) { 
    try { 
      // Throw an object of user defined exception 
      throw new MyException1("GeeksGeeks"); 
    } catch (MyException1 ex) { 
      System.out.println("Caught"); 
      // Print the message from MyException1 object 
      System.out.println(ex.getMessage()); 
    } 
  } 
} 
