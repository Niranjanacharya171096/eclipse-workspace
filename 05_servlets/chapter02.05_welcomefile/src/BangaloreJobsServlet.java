import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class BangaloreJobsServlet extends HttpServlet{
public void doGet(HttpServletRequest req, HttpServletResponse resp) 
throws ServletException, IOException{
PrintWriter out = resp.getWriter();
out.println("<h1>Bangalore Jobs Info</h1>");
}
}
