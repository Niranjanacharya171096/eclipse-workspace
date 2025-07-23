package com.corejava;

public class chapter27_StringBuilderClass_Methods { 
  public static void main(String[] argv) throws Exception { 
    // create a StringBuilder object with a String pass as parameter 
    StringBuilder strbldr = new StringBuilder("AAAABBBCCCC"); 
    
    // print string 
    System.out.println("String = " + strbldr.toString()); 
    
    // reverse the string 
    StringBuilder reverseStr = strbldr.reverse(); 
    
    // print string 
    System.out.println("Reverse String = " + reverseStr.toString()); 
    
    // Append ', '(44) to the String 
    strbldr.appendCodePoint(44); 
    
    // Print the modified String 
    System.out.println("Modified StringBuilder = " + strbldr); 
    
    // get capacity 
    int capacity = strbldr.capacity(); 
    
    // print the result 
    System.out.println("StringBuilder = " + strbldr); 
    System.out.println("Capacity of StringBuilder = " + capacity); 
  } 
} 
