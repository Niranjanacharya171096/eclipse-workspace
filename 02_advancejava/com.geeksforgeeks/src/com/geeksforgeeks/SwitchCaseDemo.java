package com.geeksforgeeks;

class SwitchCaseDemo { 
  public static void main(String args[]){ 
    int i = 9; 
    switch (i) { 
      case 0: 
        System.out.println("i is zero."); 
        break; 
      case 1: 
        System.out.println("i is one."); 
        break; 
      case 2: 
        System.out.println("i is two."); 
        break; 
      default: 
        System.out.println("i is greater than 2."); 
    } 
  } 
} 

/*
public class SwitchCaseDemo { 
  public static void main(String[] args) { 
    int day = 5; 
    String dayString; 
    
    // switch statement with int data type 
    switch (day) { 
      case 1: 
        dayString = "Monday"; 
        break; 
      case 2: 
        dayString = "Tuesday"; 
        break; 
      case 3: 
        dayString = "Wednesday"; 
        break; 
      case 4: 
        dayString = "Thursday"; 
        break; 
      case 5: 
        dayString = "Friday"; 
        break; 
      case 6: 
        dayString = "Saturday"; 
        break; 
      case 7: 
        dayString = "Sunday"; 
        break; 
      default: 
        dayString = "Invalid day"; 
    } 
    System.out.println(dayString); 
  } 
}
*/