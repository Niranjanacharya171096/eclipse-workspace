package controller;

import javax.servlet.*;  
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;

import javax.servlet.annotation.WebServlet; 

@WebServlet("/FinalServ")
public class FinalServ extends HttpServlet {
  public void doPost (HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType ("text/html");
    PrintWriter pw=response.getWriter ();
    String sal1=request.getParameter ("second_sal");
    double salary=Double.parseDouble (sal1);
    String location=request.getParameter ("second_loc");
    
    HttpSession hs=request.getSession (false);
    String name=(String) hs.getAttribute ("namehs");
    String address=(String) hs.getAttribute ("addresshs");
    String age1=(String) hs.getAttribute ("agehs");
    int age=Integer.parseInt (age1);
    String exp=(String) hs.getAttribute ("exphs");
    float experiance=Float.parseFloat (exp);
    String skills=(String) hs.getAttribute ("skillshs");
    try {
      Class.forName ("com.mysql.cj.jdbc.Driver");
      Connection con=DriverManager.getConnection ("jdbc:mysql://localhost:3306/employee_db","root","root");
      PreparedStatement ps=con.prepareStatement ("insert into employee_info values (?,?,?,?,?,?,?)");
      ps.setString (1, name);
      ps.setString (2, address);
      ps.setInt (3, age);
      ps.setFloat(4, experiance);
      ps.setString (5, skills);
      ps.setDouble(6, salary);
      ps.setString (7, location);
      int j=ps.executeUpdate ();
      if (j>0) {
        pw.println ("<html><body bgcolor=\"lightblue\"><center><h1><font color=\"red\">Successfully ");
        pw.println ("Inserted</font></h1></center><a href=\"personal.html\">Home</a></body></html>");
      } else {
        pw.println ("<html><body bgcolor=\"cyan\"><center><h1><font color=\"red\">TryAgain");
        pw.println ("</font></h1></center><a href=\"personal.html\">Home</a></body></html>");
      }
    } catch (Exception e) {
      pw.println ("<html><body bgcolor=\"cyan\"><center><h1><font color=\"red\">Try Again");
      pw.println ("</font></h1></center><a href=\"personal.html\">Home</a></body></html>");
    }
  }
}

