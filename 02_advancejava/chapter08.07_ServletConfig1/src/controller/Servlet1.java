package controller;

import java.io.*;     
import javax.servlet.*;
import javax.servlet.http.*;

//@WebServlet(
//    urlPatterns = { "/firstservlet" }, 
//    initParams = { 
//        @WebInitParam(name = "v1", value = "10"), 
//        @WebInitParam(name = "v2", value = "20")
//    })
public class Servlet1 extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType ("text/html");
    PrintWriter pw = response.getWriter ();
    ServletConfig config = getServletConfig ();
    String val1 = config.getInitParameter ("v1");
    String val2 = config.getInitParameter ("v2");
    String val3 = config.getInitParameter ("v3"); //not initialized
    System.out.println(val1+" "+val2+" "+val3);
    pw.println ("<h3> Value of v1 is "+val1+"</h3>");
    pw.println ("<h3> Value of v2 is "+val2+"</h3>");
    pw.println ("<h3> Value of v3 is "+val3+"</h3>");
  }
}
