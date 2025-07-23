package com.corejava;
import java.io.*; 

class chapter26_StringBufferClass_append { 
  public static void main(String[] args) { 
    StringBuffer strbfr = new StringBuffer("Geeksfor"); 
    strbfr.append("Geeks"); 
    System.out.println(strbfr); // returns GeeksforGeeks
    strbfr.append(1); 
    System.out.println(strbfr); // returns GeeksforGeeks1 
  } 
} 
