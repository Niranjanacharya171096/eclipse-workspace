//HelloServlet.java

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet{
  public void init(ServletConfig config) throws ServletException {
    //initialization code
    System.out.println("Init method");
  }
  
  public void service (ServletRequest req, ServletResponse res) 
    throws ServletException, IOException {
    //read data, 
    //generate pw, 
    //send pw
    String name = req.getParameter("p1");
    res.setContentType("text/html");
    PrintWriter pw = res.getWriter();
    pw.println("Hello..." + name);
  }
  
  public void destroy (){
    //clean up initialization
    System.out.println("Destroy method");
  }
  
  public String getServletInfo(){
    return null;
  }
  public ServletConfig getServletConfig(){
    return null;
  } 
} 

