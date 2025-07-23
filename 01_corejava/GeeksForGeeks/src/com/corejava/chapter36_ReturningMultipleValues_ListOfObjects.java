package com.corejava;

import java.util.*;
import java.util.List; 

class chapter36_ReturningMultipleValues_ListOfObjects { 
  public static  List<Object> getDetails(){ 
    String name = "Geek"; 
    int age = 35; 
    char gender = 'M'; 

    return Arrays.asList(name, age, gender); 
  } 

  // Driver code 
  public static void main(String[] args) { 
    List<Object> person = getDetails(); 
    System.out.println(person); 
  } 
} 
