package com.geeksforgeeks;
// Note that this program does not work on IDEs as System.console() may require console 

public class ConsoleEX { 
  public static void main(String[] args) { 
    // Using Console to input data from user 
    String name = System.console().readLine(); 

    System.out.println("You entered string " + name); 
  } 
}
