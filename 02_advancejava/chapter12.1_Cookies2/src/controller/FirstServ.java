package controller;

import javax.servlet.*; 
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet; 

@WebServlet("/FirstServ")
public class FirstServ extends HttpServlet {
  public void doPost (HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType ("text/html");
    PrintWriter pw=response.getWriter ();
    String name=request.getParameter ("ex_name");
    String address=request.getParameter ("ex_add");
    String age=request.getParameter ("ex_age");
    
    Cookie c1=new Cookie ("name",name);
    Cookie c2=new Cookie ("address",address);
    Cookie c3=new Cookie ("age",age);
    response.addCookie (c1);
    response.addCookie (c2);
    response.addCookie (c3);
    
    pw.println ("<html><title>First Servlet</title><body bgcolor=\"green\"><center>");
    pw.println ("<form name=\"first\" action=\"./secondserv\" method=\"post\"><table bgcolor=\"lightblue\">");
    pw.println ("<tr><th>Enter ur experience : </th><td><input type=\"text\" name=\"first_exp\"value=\"\">");
    pw.println ("</td></tr><tr><th>Enter ur skills : </th><td><input type=\"text\" name=\"first_skills\"value=\"\">");
    pw.println ("</td></tr><table><tr><td align=\"center\"><input type=\"submit\" name=\"first_submit\"value=\"Continue\">");
    pw.println ("</td></tr></table></table></form></center></body></html>");
  }
}
