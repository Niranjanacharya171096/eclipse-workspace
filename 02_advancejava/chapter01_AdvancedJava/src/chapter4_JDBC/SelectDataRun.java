package chapter4_JDBC;

import java.sql.*;  
import java.io.*; 

class SelectDataRun {   
  public static void main (String [] args) {      
    try { 
      DriverManager.registerDriver (new com.mysql.cj.jdbc.Driver());
      System.out.println ("DRIVERS LOADED...");
      
      String userName = "root";
      String password = "root";
      String url = "jdbc:mysql://localhost:3306/studentdb";      
      Connection con = DriverManager.getConnection (url, userName, password);
      System.out.println ("CONNECTION OBTAINED..." + con);

      DataInputStream dis = new DataInputStream (System.in); 
      System.out.println ("ENTER DEPARTMENT NUMBER : ");        
      String s1 = dis.readLine ();        
      int dno = Integer.parseInt (s1);        

      String drl = "select * from department where dno=?";
      PreparedStatement ps = con.prepareStatement (drl); 
      ps.setInt (1, dno); 
      
      ResultSet rs = ps.executeQuery ();        
      while (rs.next ()) { 
        System.out.print (rs.getString (1)+" "+rs.getString (2)+" "); 
        System.out.println (rs.getString (2)+" "+rs.getString (4)); 
      } 
      con.close (); 
    } catch (Exception e) { 
      e.printStackTrace (); 
    } 
  } 
} 
