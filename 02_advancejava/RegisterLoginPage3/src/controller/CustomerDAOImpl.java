package controller;

import java.sql.*;

public class CustomerDAOImpl implements CustomerDAO {
  
  static Connection con;
  static PreparedStatement ps;
  @Override
  public int insertCustomer(Customer c) {
    int status=0;
    try {
      con=MyConnectionProvider.getCon();
      ps=con.prepareStatement("insert into mywebapp_tbl(cid, cname, cusername, cpassword) value(?, ?, ?, ?)");
      ps.setString(1, null);
      ps.setString(2, c.getName());
      ps.setString(3, c.getUsername());
      ps.setString(4, c.getPassword());
      status=ps.executeUpdate();
      con.close();
    } catch(Exception e) {
      System.out.println(e);
    }
    System.out.println(status);
    return status;
  }

  @Override
  public Customer getCustomer(String username, String password) {
    Customer c=new Customer();
    try {
      con=MyConnectionProvider.getCon();
      ps=con.prepareStatement("select * from mywebapp_tbl where cusername=? and cpassword=?");
      ps.setString(1, username);
      ps.setString(2, password);

      ResultSet rs=ps.executeQuery();
      while(rs.next()) {
        c.setName(rs.getString(2));
        c.setUsername(rs.getString(3));
        c.setPassword(rs.getString(4));
      }
    } catch(Exception e) {
      System.out.println(e);
    }
    return c;
  }

}
