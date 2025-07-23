package com.geeksforgeeks;

//Java program that demonstrates the use of throws
class ThrowsException {
    static void fun() throws IllegalAccessException {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]) throws InterruptedException {
    	
    	Thread.sleep(10000);

        try {
            fun();
        }catch(IllegalAccessException e) {
            System.out.println("caught in main." + e.getMessage());
        }
    }
}

