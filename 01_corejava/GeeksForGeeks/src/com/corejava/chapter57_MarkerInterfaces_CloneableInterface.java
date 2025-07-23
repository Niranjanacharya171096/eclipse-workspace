package com.corejava;

import java.io.IOException;
import java.lang.Cloneable; 

//By implementing Cloneable interface 
//we make sure that instances of class cloneA 
//can be cloned. 
class cloneA implements Cloneable { 
  int i; 
  String s; 
    
  // cloneA class constructor 
  public cloneA(int i,String s) { 
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

public class chapter57_MarkerInterfaces_CloneableInterface { 
  public static void main(String[] args) 
      throws IOException, ClassNotFoundException, CloneNotSupportedException {     
    System.out.println("Clonable Interfacce"); 
    
    cloneA a = new cloneA(20, "GeeksForGeeks"); 
    
    // cloning 'a' and holding 
    // new cloned object reference in b 
    
    // down-casting as clone() return type is Object 
    cloneA cln = (cloneA)a.clone(); 
    
    System.out.println(cln.i); 
    System.out.println(cln.s);      
  } 
}
