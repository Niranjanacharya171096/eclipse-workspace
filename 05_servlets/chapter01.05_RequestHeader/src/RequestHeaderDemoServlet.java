import java.io.*;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/test")
public class RequestHeaderDemoServlet extends HttpServlet{
public void doGet(HttpServletRequest req, HttpServletResponse resp) 
throws ServletException, IOException{
PrintWriter out = resp.getWriter();
out.println("<h1>Request Headers Information</h1></hr>");
out.println("<table border=2><tr><th>HeaderName</th><th>Header values</th></tr>");
Enumeration e = req.getHeaderNames();
while(e.hasMoreElements()){
String hname = (String)e.nextElement();
String hvalue=req.getHeader(hname);
out.println("<tr><td>"+hname+"</td><td>"+hvalue+"</td></tr>");
}
out.println("</table></body></html>");
}
}
