package com.geeksforgeeks;

//Java program to demonstrate working of 
//interface inside a class. 

import java.util.*; 

class ClassInterface { 
	 interface Yes { 
	     void show(); 
	 } 
} 

class InterfaceInterface { 
	 interface Yes { 
	     void show(); 
	 } 
} 

class Testing1 implements ClassInterface.Yes { 
	 public void show() { 
	     System.out.println("show method of ClassInterface.Yes"); 
	 } 
} 

class Testing2 implements InterfaceInterface.Yes { 
	 public void show() { 
	     System.out.println("show method of InterfaceInterface.Yes"); 
	 } 
} 
class NestedInterface { 
	 public static void main(String[] args) { 
	     ClassInterface.Yes obj1; 
	     Testing1 t1 = new Testing1(); 
	     obj1=t1; 
	     obj1.show(); 
	     
	     InterfaceInterface.Yes obj2; 
	     Testing2 t2 = new Testing2(); 
	     obj2=t2; 
	     obj2.show(); 
	 } 
} 
