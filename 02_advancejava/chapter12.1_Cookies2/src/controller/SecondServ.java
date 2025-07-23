package controller;

import javax.servlet.*; 
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet; 

@WebServlet("/SecondServ")
public class SecondServ extends HttpServlet {
  public void doPost (HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
    response.setContentType ("text/html");
    PrintWriter pw=response.getWriter ();
    
    String exp=request.getParameter ("first_exp");
    String skills=request.getParameter ("first_skills");
    
    Cookie c4=new Cookie ("exp",exp);
    Cookie c5=new Cookie ("skills",skills);
    response.addCookie (c4);
    response.addCookie (c5);
    
    pw.println ("<html><title>Second Servlet</title><body bgcolor=\"green\"><center>");
    pw.println ("<form name=\"second\" action=\"./finalserv\" method=\"post\"><table bgcolor=\"lightblue\">");
    pw.println ("<tr><th>Enter expected salary : </th><td><input type=\"text\" name=\"second_sal\"value=\"\">");
    pw.println ("</td></tr><tr><th>Enter preffered location : </th><td><input type=\"text\"name=\"second_loc\" value=\"\">");
    pw.println ("</td></tr><table><tr><td align=\"center\"><input type=\"submit\"name=\"second_submit\" value=\"Submit\">");
    pw.println ("</td></tr></table></table></form></center></body></html>");
  }
}

