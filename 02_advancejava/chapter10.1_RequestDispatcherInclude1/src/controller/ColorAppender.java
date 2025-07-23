package controller;

import java.io.*; 
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ColorAppender2")
public class ColorAppender extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    PrintWriter pw = response.getWriter();
//by passing pattern
    RequestDispatcher rd = request.getRequestDispatcher("HelloServlet"); //url
//by passing class name
//    RequestDispatcher rd = getServletContext().getNamedDispatcher("HelloServlet");
    pw.println("<body style='background-color:red;'>");
    pw.println("<p>ColorAppender</p>");    
    rd.include(request, response);
    pw.println("</body>");
  }
}

