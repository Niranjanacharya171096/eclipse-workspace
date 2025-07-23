package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet; 

@WebServlet("/ShowCookies")
public class ShowCookies extends HttpServlet {
public void doGet (HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
    response.setContentType ("text/html");
    PrintWriter pw=response.getWriter ();
    String title="Active Cookies";
    
    pw.println ("<html><head><title>"+title+"</title></head>");
    pw.println ("<body><table border=\"1\" align=\"center\">");
    pw.println ("<tr><th>Cookie Name</th><th>Cookie Value</th></tr>");
    Cookie ck []=request.getCookies ();
    if (ck!=null) {
      for (int i=0; i<ck.length; i++) {
        pw.println ("<tr><td>"+ck [i].getName ()+"</td><td>"+ck [i].getValue ()+"</td></tr>");
        System.out.println (ck [i].getName ()+" "+ck [i].getValue ());
      }
    } else {
      System.out.println ("NO COOKIES PRESENT");
    }
    pw.println ("</table></body></html>");
  }
}

