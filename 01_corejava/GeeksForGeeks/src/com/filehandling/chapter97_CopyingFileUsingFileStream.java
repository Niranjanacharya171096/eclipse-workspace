package com.filehandling;

import java.io.*;

class chapter97_CopyingFileUsingFileStream { 
  public static void main(String args[]) throws FileNotFoundException,IOException { 
    /* If file doesnot exist FileInputStream throws 
        FileNotFoundException and read() write() throws 
          IOException if I/O error occurs */
    FileInputStream fis = new FileInputStream("Friend.txt"); 

    /* assuming that the file exists and need not to be checked */
    FileOutputStream fos = new FileOutputStream("Friend2.txt"); 

    int b; 
    while  ((b=fis.read()) != -1) 
      fos.write(b); 

      /* read() will readonly next int so we used while 
        loop here in order to read upto end of file and 
        keep writing the read int into dest file */
    fis.close(); 
    fos.close(); 
  } 
} 

