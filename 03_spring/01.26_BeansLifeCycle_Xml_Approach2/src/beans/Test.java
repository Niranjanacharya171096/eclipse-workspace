package beans;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
  private String driver, url, username, password;
  private Connection con;
  
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
  
  //this below method is same as Init()
  public void myInit() throws Exception {
    Class.forName(driver);
    con = DriverManager.getConnection(url, username, password);
    System.out.println("Connection established...");
  }
  
  //service method
  public void save(int id, String name, String email, String address) {
    try {
      PreparedStatement ps = con.prepareStatement("insert into studentspring values(?,?,?,?)");
      ps.setInt(1,id);
      ps.setString(2, name);
      ps.setString(3, email);
      ps.setString(4, address);
      ps.executeUpdate();
      System.out.println("Insertion successful");
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  
  public void myDestroy() throws Exception {
    con.close();
    System.out.println("Connection closed...");

  }  
}
