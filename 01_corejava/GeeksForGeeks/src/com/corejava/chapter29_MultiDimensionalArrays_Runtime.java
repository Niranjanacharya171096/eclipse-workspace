package com.corejava;

import java.util.Scanner;

public class chapter29_MultiDimensionalArrays_Runtime {
  public static void main(String args[]) { 
    // Scanner class to take 
    // values from console 
    Scanner scanner = new Scanner(System.in); 

    // totalTestCases = total 
    // number of TestCases 
    // eachTestCaseValues = 
    // values in each TestCase as 
    // an Array values 
    int totalTestCases, eachTestCaseValues; 

    // takes total number of 
    // TestCases as integer number 
    System.out.println("Total Test case = "); // + (totalTestCases = scanner.nextInt()); 
    totalTestCases = scanner.nextInt(); 

    // An array is formed as row 
    // values for total testCases 
    int[][] arrayMain = new int[totalTestCases][]; 

    // for loop to take input of 
    // values in each TestCase 
    for (int i = 0; i < arrayMain.length; i++) { 
      System.out.println("Each Test case = ");// + (eachTestCaseValues = scanner.nextInt()) + " values"); 
      eachTestCaseValues = scanner.nextInt(); 
      arrayMain[i] = new int[eachTestCaseValues]; 
        
      for (int j = 0; j < arrayMain[i].length; j++) { 
        System.out.println("arrayMain["+i+"]["+j+"]"); // + (arrayMain[i][j] = scanner.nextInt())); 
        arrayMain[i][j] = scanner.nextInt();
      } 
    } // All input entry is done. 

    // Start executing output 
    // according to condition provided 
    for (int i = 0; i < arrayMain.length; i++) {  
      // Initialize total number of 
      // even & odd numbers to zero 
      int nEvenNumbers = 0, nOddNumbers = 0; 
      
      // prints TestCase number with 
      // total number of its arguments 
      System.out.println("\nTestCase " + i + " with " + arrayMain[i].length + " values:"); 
      for (int j = 0; j < arrayMain[i].length; j++) { 
        System.out.print(arrayMain[i][j] + " "); 
      
        // even & odd counter updated as 
        // eligible number is found 
        if (arrayMain[i][j] % 2 == 0) { 
          nEvenNumbers++; 
        } else { 
          nOddNumbers++; 
        } 
      } 
      System.out.println(); 
      // Prints total numbers of 
      // even & odd 
      System.out.println("Total Even numbers: "+nEvenNumbers+", Total Odd numbers: "+nOddNumbers); 
    }
  } 
}
