package com.corejava;
import java.io.*; 

class chapter26_StringBufferClass_insert { 
  public static void main(String[] args) { 
    StringBuffer strbfr = new StringBuffer("GeeksGeeks"); 
    strbfr.insert(5, "for"); 
    System.out.println(strbfr); // returns GeeksforGeeks
    
    strbfr.insert(0, 5); 
    System.out.println(strbfr); // returns 5GeeksforGeeks 
    
    strbfr.insert(3, true); 
    System.out.println(strbfr); // returns 5GetrueeksforGeeks 
    
    strbfr.insert(5, 41.35d); 
    System.out.println(strbfr); // returns 5Getr41.35ueeksforGeeks 
    
    strbfr.insert(8, 41.35f); 
    System.out.println(strbfr); // returns 5Getr41.41.3535ueeksforGeeks 
    
    char geeks_arr[] = { 'p', 'a', 'w', 'a', 'n' }; 
    
    // insert character array at offset 9 
    strbfr.insert(2, geeks_arr); 
    System.out.println(strbfr); // returns 5Gpawanetr41.41.3535ueeksforGeeks 
  } 
} 
