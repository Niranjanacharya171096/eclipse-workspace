package controller;

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GetDataServ")
public class GetDataServ extends HttpServlet {
  protected void doPost (HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType ("text/html");
    System.out.println("called GetDataServ");

    PrintWriter pw=response.getWriter ();
    String dno1=request.getParameter ("deptdetails_no");
    int dno=Integer.parseInt (dno1);
    try {
      Class.forName ("com.mysql.cj.jdbc.Driver");
      Connection con=DriverManager.getConnection ("jdbc:mysql://localhost:3306/department_db","root","root");
      Statement st=con.createStatement ();
      ResultSet rs=st.executeQuery ("select * from dept_tbl where dept_No="+dno);
      rs.next ();
      String vdno=rs.getString (1);
      String vdname=rs.getString (2);
      String vdloc=rs.getString (3);
      request.setAttribute ("sdno",vdno);
      request.setAttribute ("sdname",vdname);
      request.setAttribute ("sdloc",vdloc);
      System.out.println(vdno+" "+vdname+" "+vdloc);

      ServletContext context=getServletContext ();
      RequestDispatcher rd=context.getRequestDispatcher ("/dbserv");
      System.out.println("calling DBServ");
      rd.forward (request, response);
      con.close ();
    }
    catch (Exception e) {
      e.printStackTrace ();
    }
  }
}
