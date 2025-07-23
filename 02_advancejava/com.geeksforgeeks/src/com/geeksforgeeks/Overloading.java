package com.geeksforgeeks;

class Demo { 
    public void show(int x) { 
        System.out.println("In int " + x); 
    } 
    public void show(String s) { 
        System.out.println("In String " + s); 
    } 
    public void show(byte b) { 
        System.out.println("In byte " + b); 
    } 
    public void show(double x) { 
        System.out.println("In double " + x); 
    } 
} 

class Sum { 
    // Overloaded sum(). This sum takes two int parameters 
    public int sum(int x, int y) { 
        return (x + y); 
    } 
  
    // Overloaded sum(). This sum takes three int parameters 
    public int sum(int x, int y, int z) { 
        return (x + y + z); 
    } 
  
    // Overloaded sum(). This sum takes two double parameters 
    public double sum(double x, double y) { 
        return (x + y); 
    } 
} 

public class Overloading {
	 // Driver code 
    public static void main(String args[]) { 
        Sum s = new Sum(); 
        System.out.println(s.sum(10, 20)); 
        System.out.println(s.sum(10, 20, 30)); 
        System.out.println(s.sum(10.5, 20.5)); 
        
        byte a = 25; 
        Demo obj = new Demo(); 
        obj.show(a); // it will go to 
        // byte argument 
        obj.show("hello"); // String 
        obj.show(250); // Int 
        obj.show('A'); // Since char is 
        // not available, so the datatype 
        // higher than char in terms of 
        // range is int. 
        obj.show("A"); // String 
        obj.show(7.5); // since float datatype 
        // is not available and so it's higher 
        // datatype, so at this step their 
        // will be an error. 
    } 
}
