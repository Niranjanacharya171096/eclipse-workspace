package controller;

import java.io.*; 
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/DispServ")
public class DispServ extends HttpServlet {
  public void doPost (HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType ("text/html");
    PrintWriter pw = response.getWriter ();
    String uname = request.getParameter ("header_euname");
    String pwd = request.getParameter ("header_epwd");
    RequestDispatcher rd1 = request.getRequestDispatcher ("header.html");
    rd1.include (request, response);
    pw.println ("<br><br><br>");
    if (uname.equals ("admin") && pwd.equals ("admin")){
      pw.println ("<center><font color = #ffff66><h3>VALID CREDENTIALS</h3></center>");
    } else {
      pw.println ("<center><font color = #ffff66><h3>INVALID CREDENTIALS</h3></center>");
    }
    pw.println ("</font></br></br></br>");
    RequestDispatcher rd2 = request.getRequestDispatcher ("footer.html");
    rd2.include (request, response);
  }
}
