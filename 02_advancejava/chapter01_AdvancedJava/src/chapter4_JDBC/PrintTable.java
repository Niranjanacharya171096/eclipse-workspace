package chapter4_JDBC;

import java.sql.*; 

class PrintTable {    
  public static void main (String [] args) {     
    try { 
      Class.forName ("com.mysql.cj.jdbc.Driver");
      System.out.println ("DRIVERS LOADED..."); 

      String userName = "root";
      String password = "root";
      String url = "jdbc:mysql://localhost:3306/studentdb";      
      Connection con = DriverManager.getConnection (url, userName, password);
      System.out.println ("CONNECTION OBTAINED..." + con);

      Statement st = con.createStatement (); 
      String drl = "select * from department";
      ResultSet rs = st.executeQuery (drl); 
      
      ResultSetMetaData rsmd = rs.getMetaData (); 
      System.out.println ("=================================================="); 
 
      // PRINTING COLUMN NAME 
      for (int i=1; i<=rsmd.getColumnCount (); i++) { 
        System.out.print (rsmd.getColumnName (i)+" | "); 
      } 
      System.out.println (""); 
      System.out.println ("=================================================="); 
 
      // PRINTING THE DATA OF THE TABLE       
      while (rs.next ()) { 
        for (int j=1; j<=rsmd.getColumnCount (); j++) { 
          System.out.print (rs.getString (j)+" | "); 
        } 
        System.out.println (""); 
      } 
      con.close (); 
    } catch (Exception e) {
      e.printStackTrace();
    } 
  }
}
