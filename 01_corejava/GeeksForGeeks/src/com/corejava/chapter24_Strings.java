package com.corejava;

import java.io.*; 
import java.lang.*;

class chapter24_Strings {
  public static void main(String[] args) {
    // Declare String without using new operator
    String str1 = "GeeksforGeeks";
    // Prints the String.
    System.out.println("String str1 = " + str1);
    
    // Declare String using new operator
    String str2 = new String("GeeksforGeeks");
    // Prints the String.
    System.out.println("String str2 = " + str2);
  }
}
