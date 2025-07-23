package com.corejava;

//import java.io.*; 
//import java.util.*; 

class chapter25_StringClass_Methods { 
  public static void main (String[] args) { 
    String str = "GeeksforGeeks"; 
    // or String str= new String ("GeeksforGeeks"); 

    // Returns the number of characters in the String. 
    System.out.println("String length = " + str.length()); 

    // Returns the character at ith index. 
    System.out.println("Character at 3rd position = " + str.charAt(3)); 

    // Return the substring from the ith  index character to end of string 
    System.out.println("Substring " + str.substring(3)); 

    // Returns the substring from i to j-1 index. 
    System.out.println("Substring  = " + str.substring(2,5)); 

    // Concatenates string2 to the end of string1. 
    String str1 = "Geeks"; 
    String str2 = "forGeeks"; 
    System.out.println("Concatenated string  = " + str1.concat(str2)); 

    // Returns the index within the string 
    // of the first occurrence of the specified string. 
    String str3 = "Learn Share Learn"; 
    System.out.println("Index of Share " + str3.indexOf("Share")); 

    // Returns the index within the string of the 
    // first occurrence of the specified string, starting at the specified index. 
    System.out.println("Index of a  = " + str3.indexOf('a',3)); 

    // Checking equality of Strings 
    Boolean b = "Geeks".equals("geeks"); 
    System.out.println("Checking Equality  " + b); 
    b = "Geeks".equals("Geeks"); 
    System.out.println("Checking Equality  " + b); 

    b = "Geeks".equalsIgnoreCase("gEeks "); 
    System.out.println("Checking Equality " + b); 
      
    //If ASCII difference is zero then the two strings are similar 
    int diff = str1.compareTo(str2); 
    System.out.println("the difference between ASCII value is= " + diff); 
    // Converting cases 
    String str4 = "GeeKyMe"; 
    System.out.println("Changing to lower Case " + str4.toLowerCase()); 

    // Converting cases 
    String str5 = "GeekyME"; 
    System.out.println("Changing to UPPER Case " + str5.toUpperCase()); 

    // Trimming the word 
    String str6 = " Learn Share Learn "; 
    System.out.println("Trim the word " + str6.trim()); 

    // Replacing characters 
    String str7 = "feeksforfeeks"; 
    System.out.println("Original String " + str7); 
    String str8 = "feeksforfeeks".replace('f' ,'g') ; 
    System.out.println("Replaced f with g -> " + str8); 
  }  
} 
