package controller;

import java.io.*; 
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
  HttpSession session = request.getSession();
  String uname = (String)session.getAttribute("username");
  String pwd = (String)session.getAttribute("password");
  System.out.println(uname+" "+pwd);
  
  session.invalidate();
  }
}
