package com.corejava;
import java.io.*; 

class chapter26_StringBufferClass_reverse { 
  public static void main(String[] args) { 
    StringBuffer strbfr = new StringBuffer("GeeksGeeks"); 
    strbfr.reverse(); 
    System.out.println(strbfr); // returns skeeGrofskeeG
  } 
} 
