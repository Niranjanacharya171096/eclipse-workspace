package com.geeksforgeeks;

//A Simple Java program to demonstrate 
//Overriding and Access-Modifiers 

class Parent { 
	 // private methods are not overridden 
	 private void m1() { 
	     System.out.println("From parent m1()"); 
	 } 
	
	 protected void m2() { 
		 m1();
	     System.out.println("From parent m2()"); 
	 } 
	 final void show() {
	     System.out.println("From parent final show()"); 
	 } 
	 
	// Static method in base class 
	// which will be hidden in subclass 
	 static void m3() { 
	     System.out.println("From parent static m3()"); 
	 } 
} 

class Child extends Parent { 
	 // new m1() method 
	 // unique to Child class 
	 private void m1() { 
	     System.out.println("From child m1()"); 
	 } 
	
	 // overriding method 
	 // with more accessibility 
	 @Override
	 public void m2() { 
		 m1();
	     System.out.println("From child m2()"); 
	 } 
	 
//	 @Override
//	 void show() {
//	     System.out.println("From child final show()"); 
//	 } 
	// This method hides m1() in Parent 
	 static void m3() { 
	     System.out.println("From child static m3()"); 
	 } 
} 

//Driver class 
public class Overriding {
	public static void main(String[] args) { 
	     Parent obj1 = new Parent(); 
//	     obj1.m1(); 
	     obj1.m2(); 
	     obj1.show();
	     obj1.m3();
	     System.out.println(); 
	     
	     Child obj2 = new Child(); 
//	     obj2.m1(); 
	     obj2.m2(); 
	     obj2.m3();
	     System.out.println(); 
	     
	     Parent obj3 = new Child(); 
//	     obj3.m1(); 
	     obj3.m2(); 
	     obj3.m3();
	} 
}