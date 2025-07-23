package controller;

import java.io.*;   
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

//@WebServlet(
//    urlPatterns = { "/secondservlet" }, 
//    initParams = { 
//        @WebInitParam(name = "v3", value = "30"), 
//        @WebInitParam(name = "v4", value = "40")
//    })
public class Servlet2 extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType ("text/html");
    PrintWriter pw = response.getWriter ();
    ServletConfig config = getServletConfig ();
    Enumeration en = config.getInitParameterNames ();
    while (en.hasMoreElements ()) {
      Object obj = en.nextElement ();
      String pname = (String) obj;
      String pvalue = config.getInitParameter (pname);
      System.out.println(pname+" = "+pvalue);
      pw.println ("<br></h2>"+pvalue+" is the value of "+pname+"</h2>");
    }
  }
}
