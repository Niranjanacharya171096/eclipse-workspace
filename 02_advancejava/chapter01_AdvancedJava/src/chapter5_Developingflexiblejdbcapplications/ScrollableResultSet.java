package chapter5_Developingflexiblejdbcapplications;

import java.sql.*;

public class ScrollableResultSet {
  public static void main (String [] args) {
    try {
      Class.forName ("com.mysql.cj.jdbc.Driver");
      System.out.println ("DRIVERS LOADED...");
      
      String userName = "root";
      String password = "root";
      String url = "jdbc:mysql://localhost:3306/studentdb";        
      Connection con = DriverManager.getConnection (url, userName, password);
      System.out.println ("CONNECTION ESTABLISHED...");
      
      int a = ResultSet.TYPE_SCROLL_INSENSITIVE;
      int b = ResultSet.CONCUR_READ_ONLY;
      Statement st = con.createStatement (a, b);
//    (ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
      String drl = "select * from student";
      ResultSet rs = st.executeQuery (drl);
      System.out.println ("RECORDS IN THE TABLE...");
      while (rs.next ()) {
        System.out.println (rs.getInt (1)+" "+rs.getString (2)+" "+rs.getString (3));
      }
      rs.first ();
      System.out.println ("\nFIRST RECORD...");
      System.out.println (rs.getInt (1)+" "+rs.getString (2)+" "+rs.getString (3));
      
      rs.absolute (3);
      System.out.println ("\nTHIRD RECORD...");
      System.out.println (rs.getInt (1)+" "+rs.getString (2)+" "+rs.getString (3));
      
      rs.last ();
      System.out.println ("\nLAST RECORD...");
      System.out.println (rs.getInt (1)+" "+rs.getString (2)+" "+rs.getString (3));
      
      rs.previous ();
      System.out.println ("\nPREVIOUS RECORD...");
      System.out.println (rs.getInt (1)+" "+rs.getString (2)+" "+rs.getString (3));
      
      rs.relative (-1);
      System.out.println ("\nFIRST RECORD...");
      System.out.println (rs.getInt (1)+" "+rs.getString (2)+" "+rs.getString (3));
      
      con.close ();
    } catch (Exception e) {
      System.out.println (e);
    }
  }
}
