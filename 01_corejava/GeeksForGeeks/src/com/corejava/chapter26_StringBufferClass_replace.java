package com.corejava;
import java.io.*; 

class chapter26_StringBufferClass_replace { 
  public static void main(String[] args) { 
    StringBuffer strbfr = new StringBuffer("GeeksforGeeks"); 
    strbfr.replace(5, 8, "are"); 
    System.out.println(strbfr); // GeeksareGeeks
  } 
} 
