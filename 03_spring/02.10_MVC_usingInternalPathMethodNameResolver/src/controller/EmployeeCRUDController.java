package controller;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap; 
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@SuppressWarnings("deprecation")
public class EmployeeCRUDController extends MultiActionController{
  String driver = "com.mysql.cj.jdbc.Driver";
  String url = "jdbc:mysql://localhost:3306/employee_springdb";
  String userName="root";
  String password="root";
  int id;
  String name, email, address;
//emp_save
  public ModelAndView NiranjanemployeesaveCRUD(HttpServletRequest req, HttpServletResponse res) 
      throws Exception {
    String name = req.getParameter("name");
    String email = req.getParameter("email");
    String address = req.getParameter("address");

    Class.forName(driver);
    Connection con = DriverManager.getConnection(url, userName, password);
    Statement st = con.createStatement();
    ResultSet rs= st.executeQuery("select max(id) from employee_tbl");
    int maxid=0;
    if(rs.next()) {
      maxid=rs.getInt(1);
      maxid++;      
    }
    PreparedStatement ps = con.prepareStatement("insert into employee_tbl values(?,?,?,?)");
    ps.setInt(1, maxid);
    ps.setString(2, name);
    ps.setString(3, email);
    ps.setString(4, address);
    int i = ps.executeUpdate();
    
    con.close();
    ModelAndView mav = null;
    if(i != 0) 
      mav = new ModelAndView("success");
    else
      mav = new ModelAndView("fail");

    return mav;
  }
  //emp_update
  public ModelAndView employeeupdate(HttpServletRequest req, HttpServletResponse res) 
      throws Exception {
    Class.forName(driver);
    Connection con = DriverManager.getConnection(url, userName, password);
    
    int id = Integer.parseInt(req.getParameter("id"));
    System.out.println(id);
    String name = req.getParameter("name");
    String email = req.getParameter("email");
    String address = req.getParameter("address");
    
    PreparedStatement ps = con.prepareStatement("update employee_tbl set name=?, email=?,address=? where id=?");
    ps.setString(1, name);
    ps.setString(2, email);
    ps.setString(3, address);
    ps.setInt(4, id);
    int i = ps.executeUpdate();
    
    con.close();
    ModelAndView mav = null;
    if(i != 0) 
      mav = new ModelAndView("success");
    else
      mav = new ModelAndView("fail");

    return mav;
  }
}
