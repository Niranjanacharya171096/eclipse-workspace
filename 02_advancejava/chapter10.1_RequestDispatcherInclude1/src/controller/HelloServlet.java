package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HelloServlet2")
public class HelloServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    PrintWriter pw = response.getWriter();
    String name = request.getParameter("name");
    
    System.out.println("Next Servlet");
    pw.println("Hello........"+name+" , Iam HelloServlet");
  }
}
