package controller;

import java.io.*; 
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {  
    response.setContentType("text/html");
    
    PrintWriter pw = response.getWriter();
    HttpSession session = request.getSession();
    
    String uname = request.getParameter("uname");
    String pwd = request.getParameter("pwd");
    
    session.setAttribute("username", uname);
    session.setAttribute("password", pwd);
    
    pw.println("Login Success");
    pw.println("<a href='./logout'>Click here to Logout</a>");
  }
}
