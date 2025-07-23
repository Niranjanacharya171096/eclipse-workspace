package controller;

import java.io.IOException; 
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/FilterEx")
public class FilterEx implements Filter {
  public FilterEx () {
    System.out.println ("Inside constructor of Filter class");
  }
  public void init (FilterConfig fcon) throws ServletException {
    System.out.println ("Inside init () method of Filter class");
  }
  public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) 
      throws IOException, ServletException {
    System.out.println ("Inside doFilter () method of Filter class");
    
    int x=Integer.parseInt (request.getParameter ("first"));
    int y=Integer.parseInt (request.getParameter ("second"));
    if (x<0 || y<0) {
      PrintWriter pw=response.getWriter ();
      pw.print ("<html><body>Sorry!! Ur input should be only positive numbers</body></html>");
    } else {
      chain.doFilter (request, response);
    }
  }
  public void destroy () {
    System.out.println ("Inside destroy () method of Filter class");
  }
}
