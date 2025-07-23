package com.geeksforgeeks;

//Java program that demonstrates the use of throw
class ThrowException {
	 static void fun() {
	     try {
	         throw new NullPointerException("demo");
	     } catch(NullPointerException e) {
	         System.out.println("Caught inside fun()." + e.getMessage());
	         throw e; // rethrowing the exception
	     }
	 }
	 public static void main(String args[]) {

		 try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	     try {
	         fun();
	     } catch(NullPointerException e) {
	         System.out.println("Caught in main." + e.getMessage());
	     }
	     System.out.println("Hello Geeks");
	 }
}