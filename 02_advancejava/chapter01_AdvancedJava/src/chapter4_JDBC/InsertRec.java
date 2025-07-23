package chapter4_JDBC;

import java.sql.*; 
import java.util.*;

class InsertRec {
  public static void main (String [] args) {
    try {
//    Driver d = new com.mysql.cj.jdbc.Driver();
//    DriverManager.registerDriver (d); //OR
      DriverManager.registerDriver (new com.mysql.cj.jdbc.Driver());
      System.out.println ("DRIVERS LOADED...");
      
      String userName = "root";
      String password = "root";
      String url = "jdbc:mysql://localhost:3306/studentdb";      
      Connection con = DriverManager.getConnection (url, userName, password);
      System.out.println ("CONNECTION OBTAINED..." + con);

      Statement st = con.createStatement ();
      String ddl = "insert into department values (10,'Engineer', '2002-01-02', '10:15:00');";
      int i = st.executeUpdate (ddl);
      System.out.println (i+" ROWS SELECTED...");
      st.close();
      con.close ();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
