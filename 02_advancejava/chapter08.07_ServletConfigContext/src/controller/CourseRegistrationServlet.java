package controller;

import java.io.*; 
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

//@WebServlet(
//    urlPatterns = { "/CourseRegistrationServlet" }, 
//    initParams = { 
//        @WebInitParam(name = "user", value = "newuser"),
//        @WebInitParam(name = "pwd", value = "newuser@09")
//
//    })
public class CourseRegistrationServlet extends GenericServlet {
  private Connection con;
  
  @Override
  public void init(ServletConfig config) throws ServletException {
    ServletContext context = config.getServletContext();
    String driver = context.getInitParameter("driver");
    String url = context.getInitParameter("url");
    String user = config.getInitParameter("user");
    String pwd = config.getInitParameter("pwd");
    
    System.out.println("Course user: " + user + " pwd: "+ pwd);
    
    try {
      Class.forName(driver);
      con = DriverManager.getConnection(url, user, pwd);
    } catch (Exception e) {}
    //    super.init(config);
  }
  
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    response.setContentType("text/html"); //application/pdf
    
    PrintWriter pw = response.getWriter();
    int cid = Integer.parseInt(request.getParameter("cid"));
    String cname = request.getParameter("cname");
    double fee = Double.parseDouble(request.getParameter("fee"));
    
    try {
      PreparedStatement ps = con.prepareStatement("insert into course values(?, ?, ?)");
      ps.setInt(1, cid);
      ps.setString(2, cname);
      ps.setDouble(3, fee);
      int i = ps.executeUpdate();
      if(i != 0) {
        pw.println("Course Registration Success :) ");
      } else {
        pw.println("Course Registration fail :( ");
      }
    } catch(Exception e) {
      pw.println("Course Registration fail :( ");
    }
  }
  
  @Override
  public void destroy() {
    try {
      con.close();
    } catch(Exception e) {}
    //super.destroy();
  }
}
