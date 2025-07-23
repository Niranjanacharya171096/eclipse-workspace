package com.corejava;

import java.io.*;
import java.io.Serializable;

//By implementing Serializable interface 
//we make sure that state of instances of class A 
//can be saved in a file. 
class SerializA implements Serializable { 
  int i; 
  String s; 
  
  // SerializA class constructor 
  public SerializA(int i,String s) { 
    this.i = i; 
    this.s = s; 
  } 
} 

public class chapter57_MarkerInterfaces_SerializableInterface { 
  public static void main(String[] args) 
      throws IOException, ClassNotFoundException, CloneNotSupportedException { 
    System.out.println("\nSerializable Interfacce"); 
    
    SerializA a = new SerializA(20,"GeeksForGeeks"); 
    
    // Serializing 'a' 
    FileOutputStream fos = new FileOutputStream("xyz.txt"); 
    ObjectOutputStream oos = new ObjectOutputStream(fos); 
    oos.writeObject(a); 
    
    // De-serializing 'a' 
    FileInputStream fis = new FileInputStream("xyz.txt"); 
    ObjectInputStream ois = new ObjectInputStream(fis); 
    SerializA srl = (SerializA)ois.readObject();//down-casting object 
	
    System.out.println(srl.i+"\n"+srl.s); 
	
    // closing streams 
    oos.close(); 
    ois.close(); 
  } 
}