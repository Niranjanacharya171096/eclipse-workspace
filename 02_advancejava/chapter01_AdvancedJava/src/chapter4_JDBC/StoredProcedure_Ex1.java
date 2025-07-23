package chapter4_JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class StoredProcedure_Ex1 {
  public static void main (String [] args) {
    try {
      DriverManager.registerDriver (new com.mysql.cj.jdbc.Driver());
      System.out.println ("DRIVERS LOADED...");
      
      String userName = "root";
      String password = "root";
      String url = "jdbc:mysql://localhost:3306/studentdb";      
      Connection con = DriverManager.getConnection (url, userName, password);
      System.out.println ("CONNECTION OBTAINED...");
      
      CallableStatement cs = con.prepareCall ("{call Stored_Procedure1 ()}");
      boolean hasResult = cs.execute ();
      System.out.println(hasResult);
      if (hasResult) {
        ResultSet rs = cs.getResultSet();
        boolean b = rs.next(); 
        if(b == false) {
          System.out.println("No Data");          
        } else {
          while (b) {
            System.out.println("Name: "+rs.getString("name"));
            b = rs.next(); 
          }
        }
      }
      System.out.println("\t====End====");

      String drl = "select * from Student";
      ResultSet rs = cs.executeQuery(drl);
      System.out.println("---------------------------------------");
      boolean b = rs.next(); 
      if(b == false) {
        System.out.println("No Data to Display");          
      } else {
        while (b) {
          System.out.print("|id: " + rs.getInt(1) + " |name: " + rs.getString(2));
          System.out.println(" |percentage: " + rs.getFloat(3)+ "|");
          b = rs.next(); 
        }
      }
      cs.close();
      con.close();
    } catch (Exception e){
      e.printStackTrace ();
    }
  }
}
