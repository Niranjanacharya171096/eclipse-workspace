package controller;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.*;

@WebServlet("/LoadOnTest2")
public class LoadOnTest extends HttpServlet {
  public LoadOnTest () {
    System.out.println ("SERVLET OBJECT IS CREATED");
  }
  public void doGet (HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType ("text/html");
    PrintWriter pw=response.getWriter ();
    System.out.println ("I AM FROM doGet ()");
    pw.println ("<h3>I AM FROM doGet ()</h3>");
  }
}

