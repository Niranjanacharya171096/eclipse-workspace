package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentCourse2")
public class StudentCourse extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.getWriter().append("Served at: ").append(request.getContextPath());
    response.setContentType ("text/html");
    PrintWriter pw = response.getWriter ();
    String pname = request.getParameter ("pname");
    String cname = request.getParameter ("cname");
    pw.println ("<center><h3>HELLO..! Mr/Mrs. "+pname+"</h3></center>");
    pw.println ("<center><h3>Your COURSE is "+cname+"</h3></center>");
  }
}
