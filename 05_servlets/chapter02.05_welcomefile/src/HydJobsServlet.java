import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HydJobsServlet extends HttpServlet{
public void doGet(HttpServletRequest req, HttpServletResponse resp) 
throws ServletException, IOException{
PrintWriter out = resp.getWriter();
out.println("<h1>Hyderabad Jobs Info</h1>");
}
}
