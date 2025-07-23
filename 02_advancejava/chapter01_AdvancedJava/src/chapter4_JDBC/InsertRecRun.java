package chapter4_JDBC;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.io.*; 

class InsertRecRun {    
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
      System.out.println ("ENTER DEPARTMENT NAME : "); 
      String dname = dis.readLine (); 
      System.out.println ("ENTER THE DATE DD-MM-YYYY"); 
      String dod = dis.readLine();
      SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
      java.util.Date date1 = sdf1.parse(dod);
      java.sql.Date sqlDate = new java.sql.Date(date1.getTime());
      
      System.out.println ("ENTER THE TIME HH:MM:SS"); 
      String dot = dis.readLine();
      SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");
      java.util.Date date2 = sdf2.parse(dot);
      java.sql.Timestamp sqlTime = new java.sql.Timestamp(date2.getTime());      
      
      String ddl = "insert into department values (?, ?, ?, ?)";
      PreparedStatement ps = con.prepareStatement (ddl);
      ps.setInt(1, dno);
      ps.setString(2, dname);
      ps.setDate(3, sqlDate);
      ps.setTimestamp(4, sqlTime);
  
      int i = ps.executeUpdate (); 
      System.out.println (i +" ROWS SELECTED..."); 
      
      ps.close();
      con.close (); 
    } catch (Exception e) { 
      e.printStackTrace (); 
    } 
  }
}
