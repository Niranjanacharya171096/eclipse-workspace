package controller;

import java.io.*;  
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/dbservlet2") //not required if we use servlet mapping
public class DBServlet extends HttpServlet {
  ServletConfig config = null;
  Connection con = null;
  public void init(ServletConfig config) throws ServletException {
    super.init (config);
    this.config = config;
  }
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType ("text/html");
    PrintWriter pw = response.getWriter ();
    String driver = config.getInitParameter("driver");
    String url = config.getInitParameter("url");
    String table = config.getInitParameter ("table");
    try {
      Class.forName(driver);
      con = DriverManager.getConnection(url, "root", "root");
      Statement st = con.createStatement ();
      String drl = "select * from "+table;
      ResultSet rs = st.executeQuery (drl);
      pw.println ("<h2>"+"ID | Name |Percentage"+"</h2>");
      while (rs.next ()) {
        pw.println ("<p>"+rs.getInt (1)+" | "+rs.getString (2)+" | "+rs.getDouble(3)+"</p>");
      }
      con.close ();
    } catch (Exception e) {
      System.out.println(e);
      response.sendError (503,"PROBLEM IN DATABASE...");
    }
  }
}
