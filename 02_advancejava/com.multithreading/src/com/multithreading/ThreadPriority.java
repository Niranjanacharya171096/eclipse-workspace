package com.multithreading;

//Java program to demonstrate getPriority() and 
//setPriority() 

import java.lang.*; 

class ThreadPriority extends Thread { 
 public void run() { 
     System.out.println(currentThread() + " " + Thread.currentThread() + " " + ThreadPriority.currentThread());  
     System.out.println("Inside run method"); 
 } 

 public static void main(String[] args) throws InterruptedException { 
     ThreadPriority t1 = new ThreadPriority(); 
     ThreadPriority t2 = new ThreadPriority(); 
     ThreadPriority t3 = new ThreadPriority(); 

     System.out.println(currentThread() + " " + Thread.currentThread() + " " + ThreadPriority.currentThread());  
     // Default 5 
     System.out.println("t1 thread priority: "+ t1.getPriority() + " " + t1.currentThread().getName());  
     
     // Default 5 
     System.out.println("t2 thread priority: "+ t2.getPriority() + " " + t2.currentThread().getName());  
     
     // Default 5 
     System.out.println("t3 thread priority: "+ t3.getPriority() + " " + t3.currentThread().getName());  

     t1.setPriority(2); 
     t2.setPriority(10); 
     t3.setPriority(8); 

     // t3.setPriority(21); will throw 
     // IllegalArgumentException 
     
     // 2 
     System.out.println("t1 thread priority: "+ t1.getPriority());  
     
     // 5 
     System.out.println("t2 thread priority: "+ t2.getPriority());  
     
     // 8 
     System.out.println("t3 thread priority: "+ t3.getPriority());  

     // Main thread 
     
     // Displays the name of 
     // currently executing Thread 
     System.out.println("Currently Executing Thread: "+ Thread.currentThread().getName()); 
     
     System.out.println("Main thread priority: "+ Thread.currentThread().getPriority()); 

     // Main thread priority is set to 10 
     Thread.currentThread().setPriority(10); 
     System.out.println("Main thread priority: "+ Thread.currentThread().getPriority());
     
     System.out.println("\nBelow threads execute according high priorities");
     
     t1.start();
//     t1.join();
     t2.start();
//     t2.join();
     t3.start();
//     t3.join();
 } 
}
