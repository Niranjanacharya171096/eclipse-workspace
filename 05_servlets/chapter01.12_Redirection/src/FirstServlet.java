import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;
@WebServlet("/test1")
public class FirstServlet extends HttpServlet{
public void doGet(HttpServletRequest req, HttpServletResponse resp) 
throws ServletException, IOException{
resp.sendRedirect("/chapter01.12_Redirection/test2");
//resp.setStatus(302);
//resp.setHeader("Location", "/chapter01.12_Redirection/test2");
}
}
