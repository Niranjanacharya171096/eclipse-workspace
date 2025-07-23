package com.geeksforgeeks;

class Complex {  
    private double re, im; 
      
    public Complex() { 
        this.re = 0; 
        this.im = 0; 
        System.out.println("Default Complex constructor called"); 
    } 
    
    // A normal parametrized constructor  
    public Complex(double re, double im) { 
    	//calls default constructor
    	this();
    	
        this.re = re; 
        this.im = im; 
        System.out.println("Parameterized Complex constructor called"); 
    } 
      
    // copy constructor 
    Complex(Complex c) { 
        System.out.println("Copy Complex constructor called"); 
        this.re = c.re; 
        this.im = c.im; 
    } 
       
    // Overriding the toString of Object class 
    @Override
    public String toString() { 
        return "(" + re + " + " + im + "i)"; 
    } 
} 
  
public class CopyCostructor { 
   private double re, im; 
   
   public CopyCostructor() { 
       this.re = 0; 
       this.im = 0; 
       System.out.println("Default CopyCostructor constructor called"); 
   } 
   
   // A normal parametrized constructor  
   public CopyCostructor(double re, double im) { 
	   //calls default constructor
   		this();
    	
        this.re = re; 
        this.im = im; 
        System.out.println("Parameterized CopyCostructor constructor called"); 
    } 
      
    // copy constructor 
    CopyCostructor(CopyCostructor c) { 
        System.out.println("Copy CopyCostructor constructor called"); 
        this.re = c.re; 
        this.im = c.im; 
    } 
       
    // Overriding the toString of Object class 
    @Override
    public String toString() { 
        return "(" + re + " + " + im + "i)"; 
    } 
    
    public static void main(String[] args) { 
    	CopyCostructor cc1 = new CopyCostructor(1, 5);
    	Complex c1 = new Complex(10, 15); 
          
        // Following involves a copy constructor call 
    	CopyCostructor cc2 = new CopyCostructor(cc1);
    	Complex c2 = new Complex(c1);    
  
        // Note that following doesn't involve a copy constructor call as  
        // non-primitive variables are just references. 
    	CopyCostructor cc3 = cc2;
    	Complex c3 = c2;    
        System.out.println(cc3); 
        System.out.println(c3); 
        
        System.out.println(cc2); // toString() of c2 is called here 
        System.out.println(c2); // toString() of c2 is called here 
    } 
} 
