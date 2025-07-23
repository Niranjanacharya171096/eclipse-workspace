package com.corejava;

import javafx.util.Pair; 

class chapter36_ReturningMultipleValues_DifferentTypeElements { 
  public static  Pair<Integer, String>getTwo(){ 
    return new Pair<Integer, String>(10, "GeeksforGeeks"); 
  } 

  // Return multiple values from a method in Java 8 
  public static void main(String[] args) { 
    Pair<Integer, String>p = getTwo(); 
    System.out.println(p.getKey() + " " + p.getValue()); 
  } 
}
