package controller;

public class Customer {
  private String name;
  private String username;
  private String password;
  
  public void setName(String name) {
    this.name = name;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  
  public String getName() {
    return name;
  }
  public String getUsername() {
    return username;
  }
  public String getPassword() {
    return password;
  }
}
