package com.multithreading;

class thread implements Runnable { 
  public void run() { 
    System.out.println("\n\t----thread class 1----" + Thread.currentThread().getName());
    // moving thread2 to timed waiting state 
    try { 
      System.out.println(Thread.currentThread().getName() + " Sleep()" + Thread.currentThread().getState());
      Thread.sleep(1500); 
    } catch (InterruptedException e) { 
      e.printStackTrace(); 
    } 
    
    System.out.println(Thread.currentThread().getName() + " thread1 state while it called join() on thread2 -"+ chapter88_LifeCyclesandStates_ThreadStates.thread1.getState()); 
    try { 
      System.out.println(Thread.currentThread().getName() + " Sleep()");
      Thread.sleep(200); 
    } catch (InterruptedException e) { 
      e.printStackTrace(); 
    }      
  } 
} 

public class chapter88_LifeCyclesandStates_ThreadStates implements Runnable { 
  public static Thread thread1; 
  public static chapter88_LifeCyclesandStates_ThreadStates obj; 
  
  public static void main(String[] args) { 
    System.out.println("\n\t----main method----" + Thread.currentThread().getName());
    
    obj = new chapter88_LifeCyclesandStates_ThreadStates(); 
    thread1 = new Thread(obj); 
    
    // thread1 created and is currently in the NEW state. 
    System.out.println(Thread.currentThread().getName() + " thread1 state after creating it - " + thread1.getState()); 
    thread1.start(); 
    
    // thread1 moved to Runnable state 
    System.out.println("thread1 state after calling .start() on it - " + thread1.getState()); 
  } 
     
  public void run() { 
    System.out.println("\n\t----thread class 0---" + Thread.currentThread().getName());
    thread myThread = new thread(); 
    Thread thread2 = new Thread(myThread); 
    System.out.println(myThread + " " + thread2);
       
    // thread1 created and is currently in the NEW state. 
    System.out.println(Thread.currentThread().getName() + " thread2 state after creating it - "+ thread2.getState()); 
    thread2.start(); 
    
    // thread2 moved to Runnable state 
    System.out.println("thread2 state after calling .start() on it - " +  thread2.getState()); 
    
    // moving thread1 to timed waiting state 
    try { 
      //moving thread1 to timed waiting state 
      System.out.println(Thread.currentThread().getName() + " Sleep()");
      Thread.sleep(200); 
    } catch (InterruptedException e) { 
      e.printStackTrace(); 
    } 
    System.out.println("thread2 state after calling .sleep() on it - "+ thread2.getState() ); 
    try { 
      System.out.println(Thread.currentThread().getName() + " join()");
      // waiting for thread2 to die 
      thread2.join(); 
    } catch (InterruptedException e) { 
      e.printStackTrace(); 
    } 
    System.out.println("thread2 state when it has finished it's execution - " + thread2.getState()); 
  }  
} 
