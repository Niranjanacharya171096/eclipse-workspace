package controller;

import java.io.*; 
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType ("text/html");
    PrintWriter pw = response.getWriter ();
    ServletConfig config = getServletConfig ();
    ServletContext context = config.getServletContext ();
    Enumeration en = context.getInitParameterNames ();
    while (en.hasMoreElements ()) {
      Object obj = en.nextElement ();
      String pname = (String) obj;
      String pvalue = context.getInitParameter (pname);
      pw.println ("</h2>"+pvalue+" is the value of "+pname+"</h2>");
    }
  }
}
