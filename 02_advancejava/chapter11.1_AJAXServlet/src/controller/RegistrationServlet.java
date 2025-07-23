package controller;

import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg2")
public class RegistrationServlet extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    String id = request.getParameter("ids");
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    
    System.out.println("RegistrationServlet\n");
    System.out.println("\nID:"+ id + " &NAME:" + name + " &EMAIL:" + email + "\n");
    response.getWriter().println("REGISTRATION SUCCESS");
  }
}
