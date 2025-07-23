package chapter4_JDBC;

import java.sql.*; 

class SelectData {  
  public static void main (String [] args) throws Exception { 
    DriverManager.registerDriver (new com.mysql.cj.jdbc.Driver());
    System.out.println ("DRIVERS LOADED...");
    
    String userName = "root";
    String password = "root";
    String url = "jdbc:mysql://localhost:3306/studentdb";      
    Connection con = DriverManager.getConnection (url, userName, password);
    System.out.println ("CONNECTION OBTAINED..." + con);

    Statement st = con.createStatement (); 
    String drl = "select * from department";
    ResultSet rs = st.executeQuery (drl); 
    while (rs.next ()) { 
      System.out.print (rs.getInt(1)+" "+rs.getString (2) + " "); 
      System.out.println (rs.getDate(3)+" "+rs.getTime(4)); 
    } 
    con.close (); 
  } 
}
