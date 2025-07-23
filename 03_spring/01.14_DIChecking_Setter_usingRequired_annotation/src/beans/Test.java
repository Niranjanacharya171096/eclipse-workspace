package beans;

import java.sql.*;  

import org.springframework.beans.factory.annotation.Required;

public class Test {
  private String driver;
  private String url;
  private String userName;
  private String password;

//  public String getDriver() {
//    return driver;
//  }

  @Required
  public void setDriver(String driver) {
    this.driver = driver;
  }

//  public String getUrl() {
//    return url;
//  }

  @Required
  public void setUrl(String url) {
    this.url = url;
  }

//  public String getUserName() {
//    return userName;
//  }
  
  @Required
  public void setUserName(String userName) {
    this.userName = userName;
  }

//  public String getPassword() {
//    return password;
//  }

  @Required
  public void setPassword(String password) {
    this.password = password;
  }

  public void printConnection() throws Exception {
    Class.forName(driver);
    Connection con = DriverManager.getConnection(url, userName, password);
    System.out.println("Connected? : "+con);
  }
}
