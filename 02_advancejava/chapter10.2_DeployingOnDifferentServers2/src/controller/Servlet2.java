not working
package controller;

import javax.servlet.*; 
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
  public void doGet (HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType ("text/html");
    PrintWriter pw=response.getWriter ();
    pw.println ("<h6>I AM FROM Serv2 OF webapp2</h6>");
  }
}
