package chapter4_JDBC;

import java.sql.CallableStatement; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class StoredProcedure_Ex2 {
  public static void main (String [] args) {
    try {
      DriverManager.registerDriver (new com.mysql.cj.jdbc.Driver());
      System.out.println ("DRIVERS LOADED...");
      
      String userName = "root";
      String password = "root";
      String url = "jdbc:mysql://localhost:3306/studentdb";      
      Connection con = DriverManager.getConnection (url, userName, password);
      System.out.println ("CONNECTION OBTAINED...");
      
      CallableStatement cs = con.prepareCall ("{call Stored_Procedure2 (?)}");
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter percentage: ");
      float perc = sc.nextFloat();
      cs.setDouble(1, perc);
      
      boolean hasResult = cs.execute ();
      System.out.println("Name of students whose percentage is above "+perc);
      if (hasResult) {
        ResultSet rs = cs.getResultSet();
        
        while (rs.next()) {
          System.out.println(rs.getString("name"));
        }
      }
      System.out.println("\t====End====");
      
      String drl = "select * from Student";
      ResultSet rs = cs.executeQuery(drl);
      System.out.println("---------------------------------------");
      while(rs.next()) {
        System.out.print("|id: " + rs.getInt(1) + " |name: " + rs.getString(2));
        System.out.println(" |percentage: " + rs.getFloat(3)+ "|");
      } 
      cs.close();
      con.close();
    } catch (Exception e){
      e.printStackTrace ();
    }
  }
}
