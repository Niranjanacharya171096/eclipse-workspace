import javax.servlet.*;  
import java.io.*;

public class FirstServlet extends GenericServlet{
static{
System.out.println("FirstServlet Loading..");
}
public FirstServlet(){
System.out.println("FirstServlet Instantiation..");
}
public void init(ServletConfig config) throws ServletException{
System.out.println("FirstServlet init method execution..");
}
public void service(ServletRequest req, ServletResponse resp) 
throws ServletException, IOException{
PrintWriter out = resp.getWriter();
out.println("<h1>FirstServlet:Writing servlet by extending GS is very easy</h1>");
System.out.println("service method called..");
}
}
