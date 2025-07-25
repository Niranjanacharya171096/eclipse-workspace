package com.multithreading;

//Java code for thread creation by implementing
//the Runnable Interface
class MultithreadingDemo2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 try {
		     // Displaying the thread that is running
			 System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		 }catch (Exception e) {
			 // Throwing an exception
		     System.out.println("Exception is caught");
		 }		
	}
}

//Main Class
class ThreadImplementRunnable {
	public static void main(String[] args) {
	     int n = 8; // Number of threads
	     for (int i = 0; i < n; i++) {
	         Thread object = new Thread(new MultithreadingDemo2());
	         object.start();
	     }
	 }
}
