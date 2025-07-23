import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class InitializeParameterDemoServlet extends HttpServlet{
public void doGet(HttpServletRequest req, HttpServletResponse resp) 
throws ServletException, IOException{
PrintWriter out = resp.getWriter();
String name=getServletName();
out.println("<h1>Logical Name:"+name+"</h1>");

out.println("<center><h1>Intialization Parameters</h1></center><hr>");
Enumeration e = getInitParameterNames();
out.println("<table border=2><tr><th>Parameter Name</th><th>Parameter Value</th> </tr>");
while (e.hasMoreElements()){
String pname = (String)e.nextElement();
String pvalue = getInitParameter(pname);
out.println("<tr><td>"+pname+"</td><td>"+pvalue+"</td></tr>");
}
out.println("</table>");
out.println("</body></html>");
}
}
