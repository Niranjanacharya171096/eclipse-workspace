package com.geeksforgeeks;

import java.io.*; 

public class CheckedException {
	  
    public static void main(String[] args) throws IOException { 
        FileReader file = new FileReader("E:\\Programs\\h1.txt"); 
        BufferedReader fileInput = new BufferedReader(file); 
          
        // Print first 3 lines of file "C:\test\a.txt" 
        for (int counter = 0; counter < 200; counter++)  
            System.out.println(fileInput.readLine()); 
          
        fileInput.close(); 
    } 
} 