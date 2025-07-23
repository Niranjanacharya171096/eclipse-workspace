package stepdefinitions;

public class Credentials {
  private String username;
  private String password;

  public Credentials() {
    //    this.username = username;
    //    this.password = password;
    //    System.out.println(username+ " :: "+password);
  }
  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUsername() {
    //    System.out.println(username+ " :: "+password);

    return username;
  }

  public String getPassword() {
    //    System.out.println(username+ " :: "+password);

    return password;
  }
}