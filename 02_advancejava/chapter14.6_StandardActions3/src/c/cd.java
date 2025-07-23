package c;

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/**
 * Servlet implementation class cd
 */
@WebServlet("/cd")
public class cd extends HttpServlet {

  Connection con=null;
  PreparedStatement ps=null;
  @Override
  public void init(ServletConfig arg0) throws ServletException {
    // TODO Auto-generated method stub

    try {
      Class.forName ("com.mysql.cj.jdbc.Driver");
      con=DriverManager.getConnection ("jdbc:mysql://localhost:3306/student_db", "root","root");
      ps=con.prepareStatement ("insert into student_tbl values (?,?,?,?,?)");
    }
    catch (Exception e) {
      System.out.println (e);
    }

    
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    HttpSession hs = request.getSession();
    String fno = request.getParameter("fno");
    try {
     if(fno.equals("1")) {
        String stno=request.getParameter ("first_stno");
        System.out.println (stno);
  
        String sname=request.getParameter ("first_stname");
        System.out.println (sname);
        
        hs.setAttribute("stno", stno);
        hs.setAttribute("sname", sname);
  
        response.sendRedirect("./second.jsp");
      }
      if(fno.equals("2")) {
        String scollege=request.getParameter ("second_cname");
        System.out.println (scollege);
  
        String mark=request.getParameter ("second_marks");
        System.out.println (mark);
  
        String dob=request.getParameter ("second_dob");
        System.out.println (dob);
  
        hs.setAttribute("scollege", scollege);
        hs.setAttribute("mark", mark);
        hs.setAttribute("dob", dob);
        
        String stno = (String)hs.getAttribute("stno");
        String sname = (String)hs.getAttribute("sname");      
        scollege = (String)hs.getAttribute("scollege");
        mark = (String)hs.getAttribute("mark");     
        dob = (String)hs.getAttribute("dob");     
        
        int snum=Integer.parseInt(stno);
        float smark=Float.parseFloat(mark);
        java.sql.Date sdob=java.sql.Date.valueOf (dob);  
        
        ps.setInt (1, snum);
        ps.setString (2, sname);
        ps.setString (3, scollege);
        ps.setFloat (4, smark);
        ps.setDate (5, sdob);
        int i=ps.executeUpdate ();
      
        if (i>0) { 
          
        } else {
        }
      }
    }catch (Exception e) {
      } 
  }
  @Override
  public void destroy() {
    // TODO Auto-generated method stub
    
  }


  
  @Override
  public ServletConfig getServletConfig() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getServletInfo() {
    // TODO Auto-generated method stub
    return null;
  }

}
