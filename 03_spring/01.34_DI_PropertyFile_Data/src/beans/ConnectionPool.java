package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class ConnectionPool {
  private String driver, url, username, password;
//  PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
 
  public void setDriver(String driver) {
    this.driver = driver;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  
  public void createConnection() {
    try {
      Class.forName(driver);
      Connection con=null;
      try {
        con = DriverManager.getConnection(url, username, password);
        System.out.println(con);    
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
