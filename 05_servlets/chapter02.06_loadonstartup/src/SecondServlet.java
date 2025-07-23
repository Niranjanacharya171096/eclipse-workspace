import javax.servlet.*;
import java.io.*;
public class SecondServlet extends GenericServlet{
static{
System.out.println("SecondServlet Loading..");
}
public SecondServlet(){
System.out.println("SecondServlet Instantiation..");
}
public void init(ServletConfig config) throws ServletException{
System.out.println("SecondServlet init method execution..");
}
public void service(ServletRequest req, ServletResponse resp) 
throws ServletException, IOException{
PrintWriter out = resp.getWriter();
out.println("<h1>SecondServlet:Writing servlet by extending GS is very easy</h1>");
System.out.println("service method called..");
}
}
