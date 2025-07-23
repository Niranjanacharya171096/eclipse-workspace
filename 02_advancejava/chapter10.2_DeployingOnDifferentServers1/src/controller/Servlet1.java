not working
package controller;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
  public void doGet (HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType ("text/html");
    PrintWriter pw=response.getWriter ();
    pw.println ("<h2>I AM FROM Serv1 OF webapp1</h2>");
    response.sendRedirect ("http://localhost:8188/chapter10.2_DeployingOnDifferentServers2/servlet2");
  }
}
