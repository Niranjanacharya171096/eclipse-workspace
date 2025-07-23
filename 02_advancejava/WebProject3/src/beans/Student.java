package beans;

import java.io.Serializable;

public class Student implements Serializable {
public String sname;
public String usn;
public int smarks;
public Student() {
}
public void setsname(String e) {
sname = e;
}
public String getsname() {
return sname;
}
public void setusn(String en) {
usn = en;
}
public String getusn() {
return usn;
}
public void setsmarks(int m) {
smarks = m;
}
public int getsmarks() {
return smarks;
}
}