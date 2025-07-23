package com.durga;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

public class Chapter13_Exception {
  public static void main(String[] args){
    System.out.println("statement1");
//    try{
//      System.out.println(10/0);
//      int arr[] = new int[5];
//      arr[6] = 9; // accessing 7th element in an array of size 5
//      String s = null; //null value
//      s.charAt(0);
//      int num = Integer.parseInt ("akki") ;
//      String str = "This is like chipping "; // length is 22
//      char ch = str.charAt(24); // accessing 25th element
//    } catch(Exception e){
//      System.out.println(e);
//    }
//    System.out.println("statement3");
//
//    FileInputStream f=new FileInputStream("file.txt");
//    Class temp=Class.forName("test");
//    Connection con=DriverManager.getConnection(null);

    try{     
      int num = Integer.parseInt ("akki") ;
      try {
        System.out.println("try"+10/0);        
      }catch(NumberFormatException e) {
        System.out.println(e);
      }finally {
        System.out.println("inner finally");
      }
      System.out.println("inner");
    }
    catch(NumberFormatException|ArithmeticException e){ 
    System.out.println(e);
    }
    
    finally{
//    String s=null;
//    System.out.println(s.length());
      System.out.println("finally");
    }
    System.out.println("end");
  }
}
