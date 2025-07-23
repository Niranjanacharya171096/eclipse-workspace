package bean;

public class CheckBean {
  String uname;
  String pwd;
  public CheckBean () {
  }
  public void setUname (String uname) {
    this.uname=uname;
  } 
  public void setPwd (String pwd) {
    this.pwd=pwd;
  }
  public String getUname () {
    return uname;
  }
  public String getPwd () {
    return pwd;
  }
  public boolean validate () {
    if (uname.equals ("admin") && pwd.equals ("admin")) {
      return (true);
    } else {
      return (false);
    }
  }
}
