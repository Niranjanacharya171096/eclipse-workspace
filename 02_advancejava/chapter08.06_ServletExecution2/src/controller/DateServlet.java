package controller;

import java.io.IOException; 
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/dateservlet2")
public class DateServlet extends GenericServlet {
  public void init(ServletConfig config) throws ServletException {
    System.out.println ("I AM FROM init METHOD...");
  }

  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    response.setContentType ("text/html");
    PrintWriter pw=response.getWriter ();
    Date d=new Date ();
    String s=d.toString ();
    pw.println ("<h1> WELCOME TO SERVLETS <h1>");
    pw.println ("<h2> CURRENT DATE & TIME IS : "+s+"<h2>");   
  }
  
  public void destroy() {
    System.out.println ("I AM FROM destroy METHOD...");
  }
}
