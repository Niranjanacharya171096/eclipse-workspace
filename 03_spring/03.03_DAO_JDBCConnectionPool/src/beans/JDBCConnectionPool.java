package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;

public class JDBCConnectionPool {
  public static void main(String[] args) {
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/employee_springdb";
    String userName="root";
    String password="root";

    System.out.println("JDBC Connection Pool");
    Date d1 = new Date();
    for (int i=1;i<=2000;i++) {
      System.out.println(i);
      try {
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, userName, password);
        System.out.println(con);
        con.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    Date d2= new Date();
    
    System.out.println(d1);
    System.out.println(d2);
  }
}
