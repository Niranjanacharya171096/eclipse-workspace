package com.corejava;

import java.util.Scanner; 

class chapter15_ReadInput_Scanner { 
  public static void main(String args[]) { 
    // Using Scanner for Getting Input from User 
//    try {
    Scanner sc = new Scanner(System.in); 

    String str = sc.nextLine(); 
    System.out.println("You entered string " + str); 

    int a = sc.nextInt(); 
    System.out.println("You entered integer " + a); 
    
    float b = sc.nextFloat(); 
    System.out.println("You entered float " + b); 
//  } catch(Exception e) {System.out.println(e);  }
    }
}
