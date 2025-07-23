
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet("/test")
public class HttpServletClass extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		PrintWriter out = resp.getWriter();
		String name=req.getParameter("uname");
		out.println("<h1>This is from doGET()method...</h1>"+name);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		PrintWriter out = resp.getWriter();
		String name=req.getParameter("uname");
		out.println("<h1>This is from doPOST()method...</h1>"+name);
	}
}
