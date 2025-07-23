package controller;

import java.io.*; 
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/val2")
public class ValidationServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    PrintWriter pw = response.getWriter();
    
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String address = request.getParameter("address");
//Validation    
    boolean b = false;
    if(name.equals("")) {
      pw.println("<p>Name is required</p>");
      b = false;
    }
    if(email.equals("")) {
      pw.println("<p>Email is required</p>");
      b = false;
    }
    if(address.equals("")) {
      pw.println("<p>Address is required</p>");
      b = false;
    } else {
      b = true;
    }
    
    System.out.println("b=="+b);
    System.out.println("name: "+name);
    System.out.println("email: "+email);
    System.out.println("address: "+address);
    
    if(b == true) {
      System.out.println("Forward to next");
//      pw.println("Registration Success");
//from here we need to call next servlet
//      RegistrationServlet regSer = (RegistrationServlet)getServletConfig().getServletContext().getServlet("reg");//controller.RegistrationServlet");
//      regSer.doGet(request, response);
      RequestDispatcher rd = request.getRequestDispatcher("/reg");
      rd.forward(request, response);
    } else {
      pw.println("<p>Please recheck and enter</p>");
    }
  }
}
