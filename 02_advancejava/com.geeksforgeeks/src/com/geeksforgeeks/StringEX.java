package com.geeksforgeeks;

import java.io.*;  
import java.lang.*;

class StringEX {
  public static void main(String[] args) {
    // Declare String without using new operator
    String s = "GeeksforGeeks";
    // Prints the String.
    System.out.println("String s = " + s);
    
    // Declare String using new operator
    String s1 = new String("GeeksforGeeks");
    // Prints the String.
    System.out.println("String s1 = " + s1);
  }
}
