import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;

public class FirstServlet extends HttpServlet{
public void doGet(HttpServletRequest req, HttpServletResponse resp) 
throws ServletException, IOException{
PrintWriter out = resp.getWriter();
try{
	System.out.println("try");
	out.println(10/0);
}catch(ArithmeticException e) {
//	out.println(e);
	req.getRequestDispatcher("/chapter02.07_ErrorPage/error.jsp");
	e.printStackTrace();
}
}
}
