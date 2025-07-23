package com.corejava;

import java.lang.*; 

public class chapter32_ConvertArraytoString_append {
  public static void main(String[] args) { 
    StringBuilder strbldr = new StringBuilder("We are geeks "); 
    System.out.println(strbldr); 
    
    // Char array 
    char[] astr = new char[] { 'G', 'E', 'E', 'k', 'S' }; 
    
    // Appends string representation of char array to this String Builder 
    strbldr.append(astr); 
    System.out.println("Result after appending = " + strbldr); 
    
    strbldr = new StringBuilder("We are -"); 
    System.out.println(strbldr); 
    
    // Char array 
    astr = new char[] { 'a', 'b', 'c', 'd' }; 
    
    /* Appends string representation of char array to this StringBuilder */
    strbldr.append(astr); 
    System.out.println("Result after appending = " + strbldr); 
  } 
} 
