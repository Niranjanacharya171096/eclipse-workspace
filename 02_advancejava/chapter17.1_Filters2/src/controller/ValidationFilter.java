package controller;

import java.io.*; 

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/vldflt2")
public class ValidationFilter implements Filter {
  public void init(FilterConfig fConfig) throws ServletException {
    String value = fConfig.getInitParameter("key");
    System.out.println(value);
  }
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
      throws IOException, ServletException {
    // place your code here
    
    PrintWriter pw = response.getWriter();
    
    int id = 0;
    String name = request.getParameter("name");
    
    try {
      id = Integer.parseInt(request.getParameter("id"));
    } catch (Exception e) { 
      System.out.println(e);
    }
    
    if(id == 0) {
      pw.println("\nID is required");
    }
    if(name.equals("")) {
      pw.println("\nName is required");
    } else {
      pw.println("<div style='border-style:dashed; border-color:red; color:blue; font-size:30'>");
      pw.println("<pre>");
      chain.doFilter(request, response);
      pw.println("</pre>");
      pw.println("</div>");
    }
    // pass the request along the filter chain
  }
  public void destroy() {
    System.out.println("Destroyed");
  }
}
