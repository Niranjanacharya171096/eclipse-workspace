import java.io.*; 
import javax.servlet.*;

public class RegistrationServlet implements Servlet {
//constructor 
  public RegistrationServlet() {
     System.out.println("Constructor: RegistrationServlet object created");
  }
    
  @Override
  public void init(ServletConfig config) throws ServletException {
     System.out.println("init():After immediate RegistrationServlet object creation");
  }

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
     System.out.println("service(): At user first request: request and response object created");
  }

  @Override
  public void destroy() {
     System.out.println("destroy(): At the undeployment or shutdown: both object destroyed");
  }

  @Override
  public ServletConfig getServletConfig() {
    return null;
  }

  @Override
  public String getServletInfo() {
    return null;
  }
}
