package com.corejava;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class chapter25_StringClass_Constructors { 
  public static void main (String[] args) throws UnsupportedEncodingException { 
    
    byte[] b_arr1 = {71, 101, 101, 107, 115};
    String str = new String(b_arr1); //Geeks
    System.out.println(str);
    
    byte[] b_arr2 = {71, 101, 101, 107, 115};
    Charset cs1 = Charset.defaultCharset();
    str = new String(b_arr2, cs1); //Geeks
    System.out.println(str);

    byte[] b_arr3 = {71, 101, 101, 107, 115};
    str = new String(b_arr3, "US-ASCII"); //Geeks
    System.out.println(str);

    byte[] b_arr4 = {71, 101, 101, 107, 115};
    str = new String(b_arr4, 1, 3); // eek
    System.out.println(str);

    byte[] b_arr5 = {71, 101, 101, 107, 115};
    Charset cs2 = Charset.defaultCharset();
    str = new String(b_arr5, 1, 3, cs2); // eek
    System.out.println(str);
    
    byte[] b_arr6 = {71, 101, 101, 107, 115};
    str = new String(b_arr6, 1, 4, "US-ASCII"); // eeks
    System.out.println(str);

    char char_arr1[] = {'G', 'e', 'e', 'k', 's'};
    str = new String(char_arr1); //Geeks
    System.out.println(str);

    char char_arr2[] = {'G', 'e', 'e', 'k', 's'};
    str = new String(char_arr2 , 1, 3); //eek
    System.out.println(str);
    
    int[] uni_code = {71, 101, 101, 107, 115};
    str = new String(uni_code, 1, 3); //eek
    System.out.println(str);

    StringBuffer strbfr = new StringBuffer("Geeks");
    str = new String(strbfr); //Geeks
    System.out.println(str);

    StringBuilder strbldr = new StringBuilder("Geeks");
    str = new String(strbldr); //Geeks
    System.out.println(str);
  }  
} 
