package controller;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bnkreg2")
public class StudentRegistration extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    PrintWriter pw = response.getWriter();
    
    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("name");
    
    pw.println("id:"+id);
    pw.println("name:"+name);
  }
}
