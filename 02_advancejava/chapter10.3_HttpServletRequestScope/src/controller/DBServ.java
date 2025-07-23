package controller;

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/DBServ")
public class DBServ extends HttpServlet {
  protected void doPost (HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType ("text/html");
    System.out.println("called DBServ");
    PrintWriter pw=response.getWriter ();
    String rdno= (String) request.getAttribute ("sdno");
    String rdname= (String) request.getAttribute ("sdname");
    String rdloc= (String) request.getAttribute ("sdloc");
    System.out.println(rdno+" "+rdname+" "+rdloc);

    pw.println ("<h3> Department No: "+rdno+"</h3>");
    pw.println ("<h3> Department Name: "+rdname+"</h3>");
    pw.println ("<h3> Department Loc: "+rdloc+"</h3>");
  }
  protected void doGet (HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    System.out.println("called GET DBServ");
  }
}
