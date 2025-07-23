package com.multithreading;

//Java code for thread creation by extending
//the Thread class
class MultithreadingDemo1 extends Thread {
	public void run() {
	     try {
	         // Displaying the thread that is running
	         System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getId()+ " is running");
	     }
	     catch (Exception e) {
	         // Throwing an exception
	         System.out.println("Exception is caught");
	     }
	 }
}

//Main Class
public class ThreadThreadClass {
 public static void main(String[] args) {
     int n = 8; // Number of threads
     for (int i = 0; i < n; i++) {
         MultithreadingDemo1 object = new MultithreadingDemo1();
         object.start();
         System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getId()+ " is running");

     }
 }
}
