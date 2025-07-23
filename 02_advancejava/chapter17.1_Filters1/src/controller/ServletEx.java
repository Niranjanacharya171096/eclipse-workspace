package controller;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletEx")
public class ServletEx extends HttpServlet {
  public void doGet (HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    System.out.println ("Inside doGet () method of Servlet class");
    int x=Integer.parseInt (request.getParameter ("first"));
    int y=Integer.parseInt (request.getParameter ("second"));
    int z=x+y;
    PrintWriter pw=response.getWriter ();
    pw.println ("<html><body>Result is "+z+"</body></html>");
  }
}
