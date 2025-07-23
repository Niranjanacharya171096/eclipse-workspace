package controller;

import java.io.*;    
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType ("text/html");
    PrintWriter pw = response.getWriter ();
    ServletConfig config = getServletConfig ();
    ServletContext context = config.getServletContext ();
    String val1 = context.getInitParameter ("v1");
    String val2 = context.getInitParameter ("v2");
    String val3 = context.getInitParameter ("v3");
    int sum = Integer.parseInt (val1)+Integer.parseInt (val2);
    pw.println ("<h3> Value of v1 is "+val1+"</h3>");
    pw.println ("<h3> Value of v2 is "+val2+"</h3>");
    pw.println ("<h3> Value of v3 is "+val3+"</h3>");
    pw.println ("<h2> Sum  =  "+sum+"</h2>");
  }
}
