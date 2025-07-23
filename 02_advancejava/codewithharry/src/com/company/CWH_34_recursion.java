package com.company;

import java.util.*;

public class CWH_34_recursion {
    static int factorial(int n){
	    if(n==0 || n==1){
	        return 1;
	    }else{
	        return n * factorial(n-1);
	    }
    }
	static  int factorial_iterative(int n){
        if( n==0 || n==1){
             return 1;
        }else{     
            int fact = 1;
            for (int i=1;i<=n;i++){ // 1 to n
                fact *= i;
            }
            return fact;
        }
	}
   public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        System.out.println("The value of factorial x is: " + factorial(x));
        System.out.println("The value of factorial x is: " + factorial_iterative(x));
    }
}
