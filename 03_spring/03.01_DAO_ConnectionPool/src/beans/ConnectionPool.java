package beans;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.apache.juli.logging.LogFactory;

public class ConnectionPool {
  public static void main(String[] args) {
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/employee_springdb";
    String userName="root";
    String password="root";

    BasicDataSource bds = new BasicDataSource();
    bds.setDriverClassName(driver);
    bds.setUrl(url);
    bds.setUsername(userName);
    bds.setPassword(password);
    
    bds.setMaxIdle(7);
    bds.setMinIdle(1);
    
    bds.setMaxWaitMillis(50000);
 
    System.out.println("Connection Pool");
    Date d1 = new Date();
    for (int i=1;i<=15;i++) {
      System.out.println(i);
      try {
        Connection con = bds.getConnection();
        System.out.println(con);
        con.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    Date d2= new Date();
    
    System.out.println(d1);
    System.out.println(d2);
  }
}
