package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet; 

@WebServlet("/SetCookies")
public class SetCookies extends HttpServlet {
  public void doGet (HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
// default maximum age is -1, indicating cookie applies only to current browsing session
    response.setContentType ("text/html");
    PrintWriter pw=response.getWriter ();

    Cookie c1=new Cookie ("ANDHRA","HYDERABAD");
    Cookie c2=new Cookie ("TAMILNADU","CHENNAI");
    response.addCookie (c1);
    response.addCookie (c2);
// c3 is valid for 1mins & c4 for 10mins, regardless of user quits browser, reboots computer
    Cookie c3=new Cookie ("KARNATAKA","BANGLORE");
    Cookie c4=new Cookie ("BIHAR","PATNA");
    c3.setMaxAge (60);
    c4.setMaxAge (600);
    response.addCookie (c3);
    response.addCookie (c4);
    pw.println ("SUCCESSFUL IN SETTING COOKIES :)");

    System.out.println ("SUCCESSFUL IN SETTING COOKIES");
  }
}
