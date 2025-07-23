package com.corejava;

import java.io.*; 

class chapter26_StringBufferClass_LengthCapacity { 
  public static void main(String[] args) { 
    StringBuffer strbfr = new StringBuffer("GeeksforGeeks"); 
    int len = strbfr.length(); 
    int cap = strbfr.capacity(); 
    System.out.println("Length of string GeeksforGeeks=" + len); 
    System.out.println("Capacity of string GeeksforGeeks=" + cap); 
  } 
} 
