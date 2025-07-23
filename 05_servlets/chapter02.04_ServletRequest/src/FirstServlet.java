import javax.servlet.*;   
import javax.servlet.http.*;   
import java.io.*;   
public class FirstServlet extends HttpServlet {   
public void doGet(HttpServletRequest req, HttpServletResponse resp) 
throws ServletException, IOException {   
PrintWriter out = resp.getWriter();   
out.println("<h1>Request URI:" +req.getRequestURI()+"</h1>");   
out.println("<h1>Context Path:" +req.getContextPath()+"</h1>");   
out.println("<h1>Servlet Path:" +req.getServletPath()+"</h1>");   
out.println("<h1>Path Info:" +req.getPathInfo()+"</h1>");   
out.println("<h1>Query String:" +req.getQueryString()+"</h1>");  
//try this url: /test/test/durga/software?user=durga&pwd=anushka
}   
}
