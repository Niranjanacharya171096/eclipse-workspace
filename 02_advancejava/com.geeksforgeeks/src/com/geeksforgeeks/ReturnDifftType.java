package com.geeksforgeeks;

import java.util.*;  
import java.util.List;

class MultiDivAdd { 
    int mul; // To store multiplication 
    double div; // To store division 
    int add; // To store addition 
    String str;
    MultiDivAdd(int m, double d, int a, String s) { 
        mul = m; 
        div = d; 
        add = a; 
        str = s;
    } 
} 

public class ReturnDifftType {
	// Returns an array such that first element 
  // of array is a+b, and second element is a-b 
  static int[] getSumAndSub(int a, int b) { 
        int[] ans = new int[2]; 
        ans[0] = a + b; 
        ans[1] = a - b; 
  
        // returning array of elements 
        return ans; 
    } 

	static MultiDivAdd getMultDivAdd(int a, int b) { 
        // Returning multiple values of different 
        // types by returning an object 
        return new MultiDivAdd(a * b, (double)a / b, (a + b), "ni"); 
    } 
		 
    public static List<Object> getDetails(){ 
        String name = "Geek"; 
        int age = 35; 
        char gender = 'M'; 
  
        return Arrays.asList(name, age, gender); 
    } 
  
    // Driver code 
    public static void main(String[] args) { 
        int[] ans = getSumAndSub(100, 50); 
        System.out.println("Sum = " + ans[0]); 
        System.out.println("Sub = " + ans[1]); 

        MultiDivAdd res = getMultDivAdd(10, 20); 

        System.out.println("Multiplication = " + res.mul); 
        System.out.println("Division = " + res.div);
        System.out.println("Addition = " + res.add);
        System.out.println("String = " + res.str);
        
        List<Object> person = getDetails(); 
        System.out.println(person); 
    } 
}