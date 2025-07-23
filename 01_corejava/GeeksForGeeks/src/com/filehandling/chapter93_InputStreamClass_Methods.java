package com.filehandling;

import java.io.*; 

public class chapter93_InputStreamClass_Methods { 
  public static void main(String[] args) throws Exception { 
    InputStream is = null; 
    try { 
      is = new FileInputStream("Friend.txt"); 
      
      // read() method: reading and printing Characters one by one 
      System.out.println("Char: "+(char)is.read()); 
      System.out.println("Char: "+(char)is.read()); 
      System.out.println("Char: "+(char)is.read()); 
      
      // mark(): read limiting the 'is' input stream 
      is.mark(0); 
      
      // skip(): it results in reading of 'e' in G'e'eeks 
      is.skip(1); 
      System.out.println("skip() method comes to play"); 
      System.out.println("mark() method comes to play"); 
      System.out.println("Char: "+(char)is.read()); 
      System.out.println("Char: "+(char)is.read()); 
      System.out.println("Char: "+(char)is.read()); 
      
      boolean check = is.markSupported(); 
      if (is.markSupported()) { 
        // reset() method: repositioning the stream to marked positions. 
        is.reset(); 
        System.out.println("reset() invoked"); 
        System.out.println("Char: "+(char)is.read()); 
        System.out.println("Char: "+(char)is.read()); 
      } else
        System.out.println("reset() method not supported."); 
      
      System.out.println("is.markSupported() supported"+ " reset(): "+check); 
    } 
    catch(Exception excpt) { 
      // in case of I/O error 
      excpt.printStackTrace(); 
    }   
    finally{ 
      // releasing the resources back to the GarbageCollector when closes 
      if (is!=null) { 
        // Use of close(): closing the file and releasing resources 
        is.close(); 
      } 
    } 
  } 
} 
