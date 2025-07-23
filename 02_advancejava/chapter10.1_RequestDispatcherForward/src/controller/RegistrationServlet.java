package controller;

import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/reg2")
public class RegistrationServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    System.out.println("Next Servlet");
    
    PrintWriter pw = response.getWriter();
    
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String address = request.getParameter("address"); 
    
    System.out.println("name: "+name);
    System.out.println("email: "+email);
    System.out.println("address: "+address);
    try {       
      Properties prop = new Properties();
      String propfile = "E:\\Software Files\\eclipse-workspace\\02_advancejava\\1_DBproperties\\DB.properties";
      prop.load(new FileInputStream(propfile)); 
      System.out.println ("\nLoading...");
      Class.forName (prop.getProperty("driver")); //dynamically passing from Properties
//    Class.forName ("com.mysql.cj.jdbc.Driver"); //or
      System.out.println ("\nLoaded Successfully...");

//    String userName = "root";
//    String password = "root";
//    String url4 = "jdbc:mysql://localhost:3306/servletservletdb";        
//    Connection con = DriverManager.getConnection (url, userName, password);  
      Connection con = DriverManager.getConnection(prop.getProperty("url4"), prop); 
      System.out.println ("\nDatabase Connection Established...");

      String dml = "insert into student (name, email, address) values (?, ?, ?)";
      PreparedStatement ps = con.prepareStatement (dml);
      ps.setString(1, name);
      ps.setString(2, email);
      ps.setString(3, address);
       
      int i = ps.executeUpdate();
      if(i != 0) {
        pw.println("<pre>");
        pw.println("Name:"+name);
        pw.println("Email:"+email);
        pw.println("Address:"+address);
        pw.println("</pre>");
        pw.println("<font color='green'><h1>Registration Success</h1></font>");
      } else {
        pw.println("<font color='red'><h1>Registration Failed</h1></font>");
      }
      con.close ();            
    } catch (Exception e) {
      pw.println("<font color='red'><h1>Connection Failed:"+e.getMessage()+"</h1></font>");
//    ex.printStackTrace();
    }      
  }
}
