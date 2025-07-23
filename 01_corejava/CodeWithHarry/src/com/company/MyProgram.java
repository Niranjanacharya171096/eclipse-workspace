package com.company;

import java.util.*;

public class MyProgram {
	public static void main(String[] args) {
      
	  int n, i, sum;
	  Scanner sc = new Scanner(System.in);
	  
	  // Practice Problem 1
	  System.out.print("Enter number of rows:");
	  n = sc.nextInt();
      for (i=n; i>0; i--){
          for(int j=0;j<i;j++){
              System.out.print("*");
          }
          System.out.print("\n");
      }

      // Practice Problem 2
      System.out.print("Enter number to calculate sum of its even numbers using for:");
	  n = sc.nextInt();
	  sum = 0;
      for(i=0;i<n;i++){
          sum = sum + (2*i);
      }
      System.out.print("Sum of even numbers is: ");
      System.out.println(sum);
      // First 4 even numbers are - 0 2 4 6
      
      // Practice Problem 2
      System.out.print("Enter number to calculate sum of its even numbers using while:");
	  n = sc.nextInt();
      i = 0;
      sum = 0;
      while(i<n){
          sum = sum + (2*i);
          i++;
      }
      System.out.print("Sum of even numbers is: ");
      System.out.println(sum);
    
      // Practice Problem 3
      System.out.print("Enter multiplication number:");
	  n = sc.nextInt();
      //for(int i=0; i<10; i++) - Goes from i=0 to i=9
      for(i=1;i<=10;i++){
          System.out.printf("%d X %d = %d\n", n, i, n*i);
      }

      // Practice Problem 4
      System.out.print("Enter multiplication number to print in reverse order:");
	  n = sc.nextInt();
      //for(int i=0; i<10; i++) - Goes from i=0 to i=9
      i = 10;
      while(i>=1){
          System.out.printf("%d X %d = %d\n", n, i, n*i);
          i--;
      }
      
      // Practice Problem 5
      System.out.print("Enter number to calculate sum of its multiplicaton:");
	  n = sc.nextInt();
      sum = 0;
      //for(int i=0; i<10; i++) - Goes from i=0 to i=9
      for(i=1;i<=10;i++){
          sum += n*i;
      }
      System.out.println(sum);
      
      // Practice Problem 6
      System.out.print("Enter number to calculate sum of its factorial using for:");
	  n = sc.nextInt();
	  // What is factorial n = n * n-1 * n-2 ..... 1
      // 5! = 5*4*3*2*1 = 120
      int factorial = 1;
      for(i = 1; i <= n; i++){
          factorial *= i;
      }
      System.out.println(factorial);
      
      // Practice Problem 6
      System.out.print("Enter number to calculate sum of its factorial using while:");
	  n = sc.nextInt();
	  // What is factorial n = n * n-1 * n-2 ..... 1
      // 5! = 5*4*3*2*1 = 120
      i = 1;
      factorial = 1;
      while(i<=n){
          factorial *= i;
          i++;
      }
      System.out.println(factorial);
	}
}