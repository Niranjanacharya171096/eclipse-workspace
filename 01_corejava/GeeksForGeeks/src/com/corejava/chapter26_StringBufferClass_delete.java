package com.corejava;
import java.io.*; 

class chapter26_StringBufferClass_delete { 
  public static void main(String[] args) { 
    StringBuffer strbfr = new StringBuffer("GeeksforGeeks"); 
    strbfr.delete(0, 5); 
    System.out.println(strbfr); // returns forGeeks
    strbfr.deleteCharAt(7); 
    System.out.println(strbfr); // returns forGeek
  } 
} 
