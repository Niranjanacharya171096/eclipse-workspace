import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class SecondServlet extends HttpServlet{
public void doGet(HttpServletRequest req, HttpServletResponse resp) 
throws ServletException, IOException{
PrintWriter out = resp.getWriter();
out.println("<h1>Hi ...This is Second Servlet</h1>");
}
}
