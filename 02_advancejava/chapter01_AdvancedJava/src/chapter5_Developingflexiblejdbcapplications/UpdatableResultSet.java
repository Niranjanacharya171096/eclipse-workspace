package chapter5_Developingflexiblejdbcapplications;

import java.sql.*;

class UpdatableResultSet {
  public static void main (String [] args) {
    try {
      Class.forName ("com.mysql.cj.jdbc.Driver");
      System.out.println ("DRIVERS LOADED...");

      String userName = "root";
      String password = "root";
      String url = "jdbc:mysql://localhost:3306/studentdb";        
      Connection con = DriverManager.getConnection (url, userName, password);
      System.out.println ("CONNECTION ESTABLISHED...");

      int a = ResultSet.TYPE_SCROLL_SENSITIVE;
      int b = ResultSet.CONCUR_UPDATABLE;
      Statement st = con.createStatement (a, b); 
      //(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
      String drl = "select * from student"; 
      ResultSet rs = st.executeQuery (drl);
      
      System.out.println ("RECORDS IN THE TABLE Before operations...");
      while (rs.next ()) {
        System.out.println (rs.getInt (1)+" "+rs.getString (2)+" "+rs.getString (3));
      }
      
      System.out.println ("\n*****Operations*****");
      rs.first ();
      rs.updateString(2, "Sayeed");
      rs.updateRow ();
      System.out.println ("1 ROW UPDATED...");
      
      rs.moveToInsertRow ();
      rs.updateInt (1, 8);
      rs.updateString (2, "Prem");
      rs.updateDouble(3, 40.5);
      rs.insertRow ();
      System.out.println ("1 ROW INSERTED...");
      
      rs.absolute (4); //4th row
      rs.deleteRow ();
      System.out.println ("1 ROW DELETED...");

      System.out.println ("\nRECORDS IN THE TABLE  After operations...");
      rs.absolute (0);
      while (rs.next ()) {
        System.out.println (rs.getInt (1)+" "+rs.getString (2)+" "+rs.getString (3));
      }
      con.close ();
    } catch (Exception e) {
      e.printStackTrace ();
    }
  }
}
