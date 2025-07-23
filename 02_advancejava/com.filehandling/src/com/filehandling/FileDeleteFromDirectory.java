package com.filehandling;

//Java program to delete a file 

import java.io.*; 

public class FileDeleteFromDirectory { 
 public static void main(String[] args) { 
     File file = new File("Friend2.txt"); 
       
     if(file.delete()) { 
         System.out.println("File deleted successfully"); 
     } else { 
         System.out.println("Failed to delete the file"); 
     } 
 } 
} 
