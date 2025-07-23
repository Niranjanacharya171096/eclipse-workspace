package com.corejava;

import java.io.File; 
import java.io.FileNotFoundException;
import java.io.FileReader;

class chapter50_Exceptions_ExceptionHandling { 
  // It throws the Exception(ArithmeticException). 
  // Appropriate Exception handler is not found within this method. 
  static int divideByZero(int a, int b){ 
    // this statement will cause ArithmeticException(/ by zero) 
    int i = a/b;           
    return i; 
  } 
    
  // The runTime System searches the appropriate Exception handler 
  // in this method also but couldn't have found. So looking forward 
  // on the call stack. 
  static int computeDivision(int a, int b) { 
    int res =0; 
    try { 
      res = divideByZero(a,b); 
    } 
    // doesn't matches with ArithmeticException 
    catch(NumberFormatException ex) { 
      System.out.println("NumberFormatException is occured");  
    } 
    return res; 
  } 
    
  // In this method found appropriate Exception handler. 
  // i.e. matching catch block. 
  public static void main(String args[]){     
    int a = 1; 
    int b = 0; 
      
    try { 
      int i = computeDivision(a,b); 
    }  
    // matching ArithmeticException 
    catch(ArithmeticException ex) { 
      // getMessage will print description of exception(here / by zero) 
      System.out.println("ArithmeticException: " + ex.getMessage()); 
    }
    
    try{
      int arr[] = new int[5];
      arr[6] = 9; // accessing 7th element in an array of
                  // size 5
    } catch(ArrayIndexOutOfBoundsException e){
      System.out.println ("ArrayIndexOutOfBoundsException: " + e.getMessage());
    }
    
    try {
      // Following file does not exist
      File file = new File("E:\\Programs\\h.txt");
      FileReader fr = new FileReader(file);
    } catch (FileNotFoundException e) {
      System.out.println("FileNotFoundException: " + e.getMessage());
    }
    
    try {
      String s = null; //null value
      System.out.println(s.charAt(0));
    } catch(NullPointerException e) {
      e.printStackTrace(); 
      System.out.println("NullPointerException: " + e.getMessage());
    }
    
    try {
      // "akki" is not a number
      int num = Integer.parseInt ("akki") ;
      System.out.println(num);
    } catch(NumberFormatException e) {
      System.out.println("NumberFormatException: " + e.getMessage());
    }

    try {
      String str = "This is like chipping "; // length is 22
      char ch = str.charAt(24); // accessing 25th element
      System.out.println(ch);
    } catch(StringIndexOutOfBoundsException e) {
      System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
    }
    finally {
      System.out.println("Finally Block");
    }
    System.out.println("Main block");
  } 
} 
