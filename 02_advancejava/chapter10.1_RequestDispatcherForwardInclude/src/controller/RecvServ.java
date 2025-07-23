package controller;

import java.io.*; 
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/RecvServ")
public class RecvServ extends HttpServlet {
  public void doPost (HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType ("text/html");
    PrintWriter pw = response.getWriter ();
    RequestDispatcher rd = request.getRequestDispatcher ("/display");
    rd.forward (request, response);
  }
}
