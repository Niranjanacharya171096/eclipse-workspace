package com.geeksforgeeks;

public class ContinueForDemo {   
  public static void main(String args[]) { 
    for (int i = 0; i<= 15; i++) { 
      //Check condition for continue 
      if (i == 10 || i == 12) { 
        //Using continue statement to skip the execution of loop when i==10 or i==12 
        continue; 
      } 
      //Printing elements to show continue statement 
      System.out.print(i + " "); 
    } 
  } 
}