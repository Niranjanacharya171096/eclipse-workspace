package controller;

import java.io.FileInputStream;    
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import java.util.Properties;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/reg2")
public class RegFormServlet extends GenericServlet {
  Connection con = null;
  public RegFormServlet() {
      super();
  }

  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    response.setContentType("text/html"); //application/pdf
    PrintWriter pw = response.getWriter();
    int id = 0;
    String name = null;
    String email = null;
    String address = null;
    try {
      id = Integer.parseInt(request.getParameter("id"));
      name = request.getParameter("name");    
      email = request.getParameter("email");
      address = request.getParameter("address");  
      
//validation
//      if(id == 0)
//            pw.println("<font color='red'><h1>Please enter valid id</h1></font>");
//        
    } catch (Exception e) {
        pw.println("<font color='red'><h1>Please enter valid data</h1></font>");    
    }
 
    if (true) {
      try {
        Properties prop = new Properties();
        prop.load(new FileInputStream("E:\\Software Files\\eclipse-workspace\\02_advancejava\\1_DBproperties\\DB.properties")); 
        System.out.println ("\nLoading...");
        Class.forName (prop.getProperty("driver")); //dynamically passing from Properties
  //      Class.forName ("com.mysql.cj.jdbc.Driver"); //or
        System.out.println ("\nLoaded Successfully...");
  
  //      String userName = "root";
  //      String password = "root";
  //      String url2 = "jdbc:mysql://localhost:3306/registrationdb";        
  //      Connection con = DriverManager.getConnection (url, userName, password);  
        con = DriverManager.getConnection(prop.getProperty("url2"), prop); 
        System.out.println ("\nDatabase Connection Established...");
        
        PreparedStatement ps1 = con.prepareStatement ("insert into employee values (?, ?, ?, ?)");
        ps1.setInt(1, id);
        ps1.setString(2, name);
        ps1.setString(3, email);
        ps1.setString(4, address);
        int i = ps1.executeUpdate();
        if(i != 0) {
          pw.println("<font color='green'><h1>Registration Success</h1></font>");
        } else {
          pw.println("<font color='red'><h1>Registration Failed</h1></font>");
        }
        con.close ();            
      } catch (Exception e) {
          pw.println("<font color='red'><h1>Connection Failed:"+e.getMessage()+"</h1></font>");
  //        ex.printStackTrace();
      }      
    }
  }
}
