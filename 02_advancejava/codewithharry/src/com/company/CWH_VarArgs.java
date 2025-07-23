package com.company;

public class CWH_VarArgs {

//	static int sum(int a, int b) {
//		return a + b;
//	}
//	
//	static int sum(int a, int b, int c) {
//		return a + b + c;
//	}
//	
//	static int sum(int a, int b, int c, int d) {
//		return a + b + c + d;
//	}
	
	static int add(int x, int ...arr) {
		int sum = 0;
		for(int a : arr)
			sum += a;
		sum += x;
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] sum;
		System.out.println("Sum of 4 and 5: " + add(1));
		System.out.println("Sum of 4 and 5: " + add(4, 5));
		System.out.println("Sum of 4 and 5: " + add(4, 5, 6));
		System.out.println("Sum of 4 and 5: " + add(4, 5, 6, 7));
	}
}
