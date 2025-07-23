package com.filehandling;


//Java program to create a file "Friend.txt"
//and add a new contact in the file

import java.io.File; 
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;
import java.util.Scanner;

class CreateFileFriend {
	 public static void main(String data[]) {
		 Scanner sc = new Scanner(System.in);
	     try {
	         // Get the name of the contact to be updated
	         // from the Command line argument
	         String newName = sc.next();// data[0];

	         // Get the number to be updated
	         // from the Command line argument
	         long newNumber = sc.nextLong(); //Long.parseLong(data[1]);

	         String nameNumberString;
	         String name;
	         long number;
	         int index;

	         // Using file pointer creating the file.
	         File file = new File("Friend.txt");
//	         located E:\Software Files\eclipse-workspace\com.filehandling

	         if (!file.exists()) {
	             // Create a new file if not exists.
	             file.createNewFile();
//	             E:\Software Files\eclipse-workspace\com.filehandling
	         }

	         // Opening file in reading and write mode. 
	         RandomAccessFile raf = new RandomAccessFile(file, "rw");
	         boolean found = false;

	         // Checking whether the name
	         // of contact already exists.
	         // getFilePointer() give the current offset
	         // value from start of the file.

	         while (raf.getFilePointer() < raf.length()) {
	        	 System.out.println("\ngetFilePointer(): " + raf.getFilePointer() + " length(): " + raf.length());
	        	 // reading line from the file.
	             nameNumberString = raf.readLine();
	        	 System.out.println("nameNumberString: " + nameNumberString + " readLine(): " + raf.readLine());

	             // splitting the string to get name and
	             // number
	             String[] lineSplit = nameNumberString.split("!");
	        	 
	             // separating name and number.
	             name = lineSplit[0];
	             number = Long.parseLong(lineSplit[1]);
	      
	             System.out.println("lineSplit: " + lineSplit);
	        	 System.out.println("name/lineSplit[0]: " + lineSplit[0]);
	        	 System.out.println("number/lineSplit[1]: " + lineSplit[1]);

	             // if condition to find existence of record.
//	        	 name == newName || //not checking
	             if (number == newNumber) { 
	                 found = true;
	                 break;
	             }
	         }

	         if (found == false) {
	             // Enter the if block when a record
	             // is not already present in the file.
	             nameNumberString = newName + "!" + String.valueOf(newNumber);
	        	 System.out.println("\nnameNumberString: " + nameNumberString);

	             // writeBytes function to write a string
	             // as a sequence of bytes.
	             raf.writeBytes(nameNumberString);

	             // To insert the next record in new line.
	             raf.writeBytes(System.lineSeparator());

	             // Print the message
	             System.out.println(" Friend added. ");

	             // Closing the resources.
	             raf.close();
	         }
	         // The contact to be updated
	         // could not be found
	         else {

	             // Closing the resources.
	             raf.close();

	             // Print the message
	             System.out.println("\nInput name or number already exists. ");
	         }
	     }

	     catch (IOException ioe) {
	         System.out.println(ioe);
	     }
	     catch (NumberFormatException nef) {
	         System.out.println(nef);
	     }
	 }
}