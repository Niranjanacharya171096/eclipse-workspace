package controller;

import java.io.*;  
import java.sql.*;
import java.util.Properties;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/reg2")
public class AdharRegWebsite extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    HttpSession hs = request.getSession();
    String fno = request.getParameter("fno");
    if(fno.equals("1")) {
      String fname = request.getParameter("fn");
      String mname = request.getParameter("mname");
      String lname = request.getParameter("lname");
      
      hs.setAttribute("firstname", fname);
      hs.setAttribute("mname", mname);
      hs.setAttribute("lname", lname);
      
      response.sendRedirect("./form2.html");
    }
    if(fno.equals("2")) {
      String qualif = request.getParameter("qualif");
      double percentage = Double.parseDouble(request.getParameter("percentage"));
      
      hs.setAttribute("qualif", qualif);
      hs.setAttribute("percentage", percentage);
      
      response.sendRedirect("./form3.html");
    }
    if(fno.equals("3")) {
      String contact = request.getParameter("contact");
      String city = request.getParameter("city");
      String state = request.getParameter("state");
      
      hs.setAttribute("contact", contact);
      hs.setAttribute("city", city);
      hs.setAttribute("state", state);
      
      //read data from first 2 forms, from session
      String firstnm = (String)hs.getAttribute("firstname");
      String mname = (String)hs.getAttribute("mname");
      String lname = (String)hs.getAttribute("lname");
      String qualif = (String)hs.getAttribute("qualif");
      double percentage = (double)hs.getAttribute("percentage");      
      contact = (String)hs.getAttribute("contact");
      city = (String)hs.getAttribute("city");     
      state = (String)hs.getAttribute("state");     
      
      PrintWriter pw = response.getWriter();
      
      try {       
        Properties prop = new Properties();
        String propfile = "E:\\Software Files\\eclipse-workspace\\02_advancejava\\1_DBproperties\\DB.properties";
        prop.load(new FileInputStream(propfile)); 
        System.out.println ("\nLoading...");
        Class.forName (prop.getProperty("driver")); //dynamically passing from Properties
        //        Class.forName ("com.mysql.cj.jdbc.Driver"); //or
        System.out.println ("\nLoaded Successfully...");
        
        //        String userName = "root";
        //        String password = "root";
        //        String url2 = "jdbc:mysql://localhost:3306/registrationdb";        
        //        Connection con = DriverManager.getConnection (url, userName, password);  
        Connection con = DriverManager.getConnection(prop.getProperty("url3"), prop); 
        System.out.println ("\nDatabase Connection Established...");
        
        String dml = "insert into adharreg "
            + "(fname, mname, lname, qualification, percentage, contact, city, state) "
            + "values (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement (dml);
        ps.setString(1, firstnm);
        ps.setString(2, mname);
        ps.setString(3, lname);
        ps.setString(4, qualif);
        ps.setDouble(5, percentage);
        ps.setString(6, contact);
        ps.setString(7, city);
        ps.setString(8, state);
        int i = ps.executeUpdate();
        if(i != 0) {
          pw.println("<pre>");
          pw.println("firstname:"+firstnm);
          pw.println("middlename:"+mname);
          pw.println("lastname:"+lname);
          pw.println("qualification:"+qualif);
          pw.println("percentage:"+percentage);
          pw.println("contact:"+contact);
          pw.println("city:"+city);
          pw.println("state:"+state);
          pw.println("</pre>");
          pw.println("<font color='green'><h1>Registration Success</h1></font>");
        } else {
          pw.println("<font color='red'><h1>Registration Failed</h1></font>");
        }
        con.close ();            
      } catch (Exception e) {
        pw.println("<font color='red'><h1>Connection Failed:"+e.getMessage()+"</h1></font>");
        //      ex.printStackTrace();
      }      
    }
  }
}

