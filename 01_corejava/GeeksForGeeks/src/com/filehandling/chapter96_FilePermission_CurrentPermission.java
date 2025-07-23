package com.filehandling;

import java.io.*; 

public class chapter96_FilePermission_CurrentPermission { 
  public static void main(String[] args) { 
    // creating a new file instance 
    File file = new File("E:\\Software Files\\eclipse-workspace\\com.filehandling\\Friend.txt"); 
       
    // check if file exists 
    boolean exists = file.exists(); 
    if(exists == true) { 
      // printing the permissions associated with the file currently 
      System.out.println("Executable: " + file.canExecute()); 
      System.out.println("Readable: " + file.canRead()); 
      System.out.println("Writable: "+ file.canWrite());        
    } else { 
      System.out.println("File not found."); 
    } 
  } 
} 
