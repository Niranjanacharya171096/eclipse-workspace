package controller;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

//@WebServlet(
//    urlPatterns = { "/StudentRegistrationServlet" }, 
//    initParams = { 
//        @WebInitParam(name = "user", value = "root"), 
//        @WebInitParam(name = "pwd", value = "root")
//    })
public class StudentRegistrationServlet extends GenericServlet {
  private Connection con;
  @Override
  public void init(ServletConfig config) throws ServletException {
//executes only 1 time
    ServletContext context = config.getServletContext();
    String driver = context.getInitParameter("driver");
    String url = context.getInitParameter("url");
    String user = config.getInitParameter("user");
    String pwd = config.getInitParameter("pwd");
      
    System.out.println("Student user: " + user + " pwd: "+ pwd);
    
    try {
      Class.forName(driver);
      con = DriverManager.getConnection(url, user, pwd);
    } catch (Exception e) {}
    //super.init(config);
  }
  
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    response.setContentType("text/html"); //application/pdf
    
    PrintWriter pw = response.getWriter();
    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    
    try {
      PreparedStatement ps = con.prepareStatement("insert into student values(?, ?, ?)");
      ps.setInt(1, id);
      ps.setString(2, name);
      ps.setString(3, email);
      int i = ps.executeUpdate();
      if(i != 0) {
        pw.println("Student Registration Success :) ");
      } else {
        pw.println("Student Registration fail :( ");
      }
    } catch(Exception e) {
      pw.println("Student Registration fail :( ");
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
