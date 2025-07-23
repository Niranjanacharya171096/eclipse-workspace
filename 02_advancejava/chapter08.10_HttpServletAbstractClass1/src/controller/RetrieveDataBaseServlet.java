package controller;

import java.io.*; 
import java.sql.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/RetrieveDataBaseServlet")
public class RetrieveDataBaseServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType ("text/html");
    PrintWriter pw = response.getWriter ();
    try {
      DriverManager.registerDriver (new com.mysql.cj.jdbc.Driver());
      String url = "jdbc:mysql://localhost:3306/studentdb";
      Connection con = DriverManager.getConnection (url, "root", "root");
      Statement st = con.createStatement ();
      String drl = "select * from student";
      ResultSet rs = st.executeQuery (drl);
      while (rs.next ()) {
        pw.println ("<p>"+rs.getInt (1)+" | "+rs.getString (2)+" | "+rs.getDouble(3)+"</p>");
      }
    } catch (Exception e) {
      response.sendError (504,"PROBLEM IN SERVLET...");
    }
  }
}
