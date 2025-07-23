package chapter5_Developingflexiblejdbcapplications;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Properties;

public class ResourceBundleFile {
  public static void main (String [] args) {
    try {
      FileInputStream fis = new FileInputStream ("rbfdb.prop");
      Properties p = new Properties ();
      p.load (fis);
      String dname = (String) p.get ("driver");
      String url = (String) p.get ("url1");
      String username = (String) p.get ("user");
      String password = (String) p.get ("password");
      String tablename = (String) p.get ("Tablename");
     
      // loading drivers and obtaining connection
      Class.forName (dname);
      System.out.println ("DRIVERS LOADED...");
      Connection con=DriverManager.getConnection (url, username, password);
      System.out.println ("CONNECTION CREATED...");
      
      // executing query
      Statement st = con.createStatement ();
      String drl = "select * from "+tablename;
      ResultSet rs = st.executeQuery (drl);
      ResultSetMetaData rsmd = rs.getMetaData ();
      
      // printing column names
      System.out.println ("=================================");
      for (int i=1; i<=rsmd.getColumnCount (); i++) {
        System.out.print (rsmd.getColumnName (i)+" | ");
      }
      System.out.println ("");
      System.out.println ("=================================");
      // printing the data
      while (rs.next ()) {
        for (int j=1; j<=rsmd.getColumnCount (); j++) {
          System.out.print (rs.getString (j)+" | ");
        }
        System.out.println (" ");
      }
      con.close ();
    } catch (Exception e) {
      e.printStackTrace ();
    }
  }
}
