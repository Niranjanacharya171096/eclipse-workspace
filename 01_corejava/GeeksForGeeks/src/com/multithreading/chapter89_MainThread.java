package com.multithreading;

//Child Thread class 
class ChildThread extends Thread { 
  @Override
  public void run() { 
    System.out.println("Current thread in Child: " + Thread.currentThread());
    for (int i = 0; i < 5; i++) 
      System.out.println("Child thread"); 
  } 
} 

public class chapter89_MainThread extends Thread { 
  public static void main(String[] args) { 
    // getting reference to Main thread 
    Thread currentT = Thread.currentThread(); 
    Thread t1 = new Thread();//Thread.currentThread(); or currentThread();
    System.out.println("Current thread in Main: " + Thread.currentThread());
       
    // getting name of Main thread 
    System.out.println("Current thread: " + currentT.getName() + " " + t1.getName()); 
    
    // changing the name of Main thread 
    currentT.setName("Geeks"); 
    t1.setName("James"); 
    System.out.println("After name change: " + currentT.getName() + " " + t1.getName()); 
       
    // getting priority of Main thread 
    System.out.println("Main thread priority: "+ currentT.getPriority() + " " + t1.getPriority()); 
       
    // setting priority of Main thread to MAX(10) 
    currentT.setPriority(MAX_PRIORITY); 
    t1.setPriority(NORM_PRIORITY); 
    
    System.out.println("Main thread new priority: "+ currentT.getPriority() + " " + t1.getPriority());
    
    for (int i = 0; i < 5; i++) 
      System.out.println("Main thread"); 
    
    // Main thread creating a child thread 
    ChildThread ct = new ChildThread(); 
       
    // getting priority of child thread 
    // which will be inherited from Main thread 
    // as it is created by Main thread 
    System.out.println("Current thread in Main: " + Thread.currentThread());
    
    System.out.println("Child thread priority: "+ ct.getPriority()); 
    
    // setting priority of Main thread to MIN(1) 
    ct.setPriority(MIN_PRIORITY); 
    
    System.out.println("Child thread new priority: "+ ct.getPriority()); 
       
    // starting child thread 
    ct.start(); 
  } 
} 