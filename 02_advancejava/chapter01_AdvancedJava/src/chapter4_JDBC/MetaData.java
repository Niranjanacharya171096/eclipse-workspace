package chapter4_JDBC;

import java.sql.*; 

class MetaData {   
  public static void main (String [] args) {     
    try { 
      Class.forName ("com.mysql.cj.jdbc.Driver");
      System.out.println ("DRIVERS LOADED..."); 

      String userName = "root";
      String password = "root";
      String url = "jdbc:mysql://localhost:3306/studentdb";      
      Connection con = DriverManager.getConnection (url, userName, password);
      System.out.println ("CONNECTION OBTAINED..." + con);
 
      System.out.println("\t====UNIVERSAL DATABASE DETAILS====");
      DatabaseMetaData dmd = con.getMetaData (); 
      System.out.println ("DATABASE NAME : "+dmd.getDatabaseProductName ()); 
      System.out.println ("DATABASE VERSION : "+dmd.getDatabaseProductVersion ()); 
      System.out.println ("NAME OF THE DRIVER : "+dmd.getDriverName ()); 
      System.out.println ("VERSION OF THE DRIVER : "+dmd.getDriverVersion ()); 
      System.out.println ("MAJOR VERSION OF DRIVER : "+dmd.getDriverMajorVersion ());       
      System.out.println ("MINOR VERSION OF DRIVER : "+dmd.getDriverMinorVersion ()); 

      System.out.println("\n\t====USER DATABASE DETAILS====");
      Statement st = con.createStatement (); 
      String drl = "select * from department";
      ResultSet rs = st.executeQuery (drl); 
      ResultSetMetaData rsmd = rs.getMetaData (); 
      System.out.println ("NUMBER OF COLUMNS : "+rsmd.getColumnCount ()); 
      for (int i=1; i<=rsmd.getColumnCount (); i++) { 
        System.out.print (rsmd.getColumnName (i)+" "+rsmd.getColumnTypeName(i)); 
      } 
      con.close (); 
    } 
    catch (Exception e) { 
      e.printStackTrace (); 
    } 
  }
}
