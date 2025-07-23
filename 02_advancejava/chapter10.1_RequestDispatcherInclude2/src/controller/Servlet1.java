package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType ("text/html");
    PrintWriter pw = response.getWriter ();
    pw.println("<font color='green'><h1>I AM FROM Serv1 BEGINNING</h1></font>");
    ServletContext context = getServletContext ();
    RequestDispatcher rd = context.getRequestDispatcher ("/s2");
    rd.include (request, response);
    pw.println("<font color='green'><h1>I AM FROM Serv1 ENDING</h1></font>");
  }
}
