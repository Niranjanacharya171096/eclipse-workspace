package chapter4_JDBC;

import java.sql.*;

class CreateTable {
  public static void main (String [] args) {
    try {
      Class.forName ("com.mysql.cj.jdbc.Driver");
      System.out.println ("DRIVERS LOADED...");
      String userName = "root";
      String password = "root";
      String url = "jdbc:mysql://localhost:3306/studentdb";      
      Connection con = DriverManager.getConnection (url, userName, password);
      System.out.println ("CONNECTION ESTABLISHED...");

      Statement st = con.createStatement ();

      String ddl = "create table department ("
          + "dno int NOT NULL AUTO_INCREMENT,"
          + "dname varchar (45) NULL,"
          + "date Date NULL,"
          + "time Time NULL,"
          + "Primary key (dno)"
          + ")";
      int i = st.executeUpdate (ddl);
      System.out.println ("TABLE CREATED..."+ i);
      con.close ();
    } catch (Exception e) {
      e.printStackTrace ();
    }
  }
}
