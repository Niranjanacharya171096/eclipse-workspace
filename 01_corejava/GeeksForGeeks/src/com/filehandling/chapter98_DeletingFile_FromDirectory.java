package com.filehandling;

import java.io.*; 

public class chapter98_DeletingFile_FromDirectory { 
  public static void main(String[] args) { 
    File file = new File("Friend2.txt"); 
    
    if(file.delete()) { 
      System.out.println("File deleted successfully"); 
    } else { 
      System.out.println("Failed to delete the file"); 
    }   
  } 
} 
