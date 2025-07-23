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
    pw.println ("<h2>I AM FROM Serv1 BEGINNING OF webapp1</h2>");
    System.out.println("1");
    ServletContext ccontext=request.getServletContext ();
    ServletContext ocontext=ccontext.getContext ("/chapter10.2_DeployingOnSameServer2");
    System.out.println("2");
    RequestDispatcher rd=ocontext.getRequestDispatcher ("/servlet2");
    System.out.println("3");

    rd.include (request, response); // rd.forward (request, response);
    System.out.println("4");

    pw.println ("<h2>I AM FROM Serv2 ENDING OF webapp1</h2>");
  }
}
