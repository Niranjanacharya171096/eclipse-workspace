package com.filehandling;

//Java program to update in the file "Friend.txt"
//and change the number of an old contact

import java.io.File; 
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;
import java.util.Scanner;

class UpdateFileFriend { 
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

         if (!file.exists()) {
             // Create a new file if not exists.
             file.createNewFile();
         }

         // Opening file in reading and write mode.
         RandomAccessFile raf = new RandomAccessFile(file, "rw");
         boolean found = false;

         // Checking whether the name
         // of contact already exists.
         // getFilePointer() give the current offset
         // value from start of the file.
         while (raf.getFilePointer() < raf.length()) {

             // reading line from the file.
             nameNumberString = raf.readLine();

             // splitting the string to get name and
             // number
             String[] lineSplit = nameNumberString.split("!");

             // separating name and number.
             name = lineSplit[0];
             number = Long.parseLong(lineSplit[1]);

             // if condition to find existence of record.
             if (name == newName || number == newNumber) {
                 found = true;
                 break;
             }
         }

         // Update the contact if record exists.
         if (found == true) {

             // Creating a temporary file
             // with file pointer as tmpFile.
             File tmpFile = new File("temp.txt");

	         if (!tmpFile.exists()) {
	             // Create a new file if not exists.
	        	 tmpFile.createNewFile();
//	             E:\Software Files\eclipse-workspace\com.filehandling
	         }

             // Opening this temporary file
             // in ReadWrite Mode
             RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");

             // Set file pointer to start
             raf.seek(0);

             // Traversing the Friend.txt file
             while (raf.getFilePointer() < raf.length()) {

                 // Reading the contact from the file
                 nameNumberString = raf.readLine();

                 index = nameNumberString.indexOf('!');
                 name = nameNumberString.substring(0, index);

                 // Check if the fetched contact
                 // is the one to be updated
                 if (name.equals(name)) {

                     // Update the number of this contact
                     nameNumberString = name + "!"+ String.valueOf(newNumber);
                 }

                 // Add this contact in the temporary
                 // file
                 tmpraf.writeBytes(nameNumberString);

                 // Add the line separator in the
                 // temporary file
                 tmpraf.writeBytes(System.lineSeparator());
             }

             // The contact has been updated now
             // So copy the updated content from
             // the temporary file to original file.

             // Set both files pointers to start
             raf.seek(0);
             tmpraf.seek(0);

             // Copy the contents from
             // the temporary file to original file.
             while (tmpraf.getFilePointer() < tmpraf.length()) {
                 raf.writeBytes(tmpraf.readLine());
                 raf.writeBytes(System.lineSeparator());
             }

             // Set the length of the original file
             // to that of temporary.
             raf.setLength(tmpraf.length());

             // Closing the resources.
             tmpraf.close();
             raf.close();

             // Deleting the temporary file
             tmpFile.delete();

             System.out.println(" Friend updated. ");
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
