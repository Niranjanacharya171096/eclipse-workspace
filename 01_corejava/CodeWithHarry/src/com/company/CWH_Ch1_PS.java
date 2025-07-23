package com.company;

import java.util.Scanner;

public class CWH_Ch1_PS {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
  	  
    	System.out.println("Enter 3 numbers:");
    	int n1, n2, n3;
    	n1 = sc.nextInt();
    	n2 = sc.nextInt();
    	n3 = sc.nextInt();
    	
//        Question1
        int sum = n1 + n2 + n3;
        System.out.println(sum);

//        Question2
	    float subject1, subject2, subject3;
	    System.out.println("Enter 3 subjects:");
	    subject1 = sc.nextFloat();
	    subject2 = sc.nextFloat();
	    subject3 = sc.nextFloat();
	    float cgpa = (subject1 + subject2 +subject3)/30;
	    System.out.println(cgpa);
	    
//        Question 3
        System.out.println("What is your name");
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");

//        Question 5
        System.out.println("Enter your number");
        System.out.println(sc.hasNextInt());
        
        int y = 7;
        int x = ++y*8;
        //y=y+1; y*8;
        System.out.println(x + " " + y);
    }
}
