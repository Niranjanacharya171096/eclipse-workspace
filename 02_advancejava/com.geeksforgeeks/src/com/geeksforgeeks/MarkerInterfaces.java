package com.geeksforgeeks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Cloneable; 

//By implementing Cloneable interface 
//we make sure that instances of class A 
//can be cloned. 
class A implements Cloneable { 
	 int i; 
	 String s; 
	
	 // A class constructor 
	 public A(int i,String s) { 
	     this.i = i; 
	     this.s = s; 
	 } 
	
	 // Overriding clone() method 
	 // by simply calling Object class 
	 // clone() method. 
	 @Override
	 protected Object clone() throws CloneNotSupportedException { 
	     return super.clone(); 
	 } 
} 

//By implementing Serializable interface 
//we make sure that state of instances of class A 
//can be saved in a file. 
class B implements Serializable { 
    int i; 
    String s; 
  
    // B class constructor 
    public B(int i,String s) { 
        this.i = i; 
        this.s = s; 
    } 
} 

public class MarkerInterfaces { 
    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException { 

	     System.out.println("Clonable Interfacce"); 

    	A a = new A(20, "GeeksForGeeks"); 
	
	     // cloning 'a' and holding 
	     // new cloned object reference in b 
	
	     // down-casting as clone() return type is Object 
	     A cln = (A)a.clone(); 
	
	     System.out.println(cln.i); 
	     System.out.println(cln.s); 
	     
	     System.out.println("\nSerializable Interfacce"); 

	     B b = new B(20,"GeeksForGeeks"); 
	     
	     // Serializing 'b' 
	     FileOutputStream fos = new FileOutputStream("xyz.txt"); 
	     ObjectOutputStream oos = new ObjectOutputStream(fos); 
	     oos.writeObject(b); 
	
	     // De-serializing 'b' 
	     FileInputStream fis = new FileInputStream("xyz.txt"); 
	     ObjectInputStream ois = new ObjectInputStream(fis); 
	     B srl = (B)ois.readObject();//down-casting object 
	
	     System.out.println(srl.i+"\n"+srl.s); 
	
	     // closing streams 
	     oos.close(); 
	     ois.close(); 
    } 
}
