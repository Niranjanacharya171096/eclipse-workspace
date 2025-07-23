import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class FirstServlet extends HttpServlet{
public void doGet(HttpServletRequest req, HttpServletResponse resp) 
throws ServletException, IOException{
PrintWriter out = resp.getWriter();
String name= req.getParameter("uname");
if(name.equals("durga")){
out.println("<h1>your authentication is correct...you can avail the facilities</h1>");
}else{
resp.sendError(401);
}
}
}
