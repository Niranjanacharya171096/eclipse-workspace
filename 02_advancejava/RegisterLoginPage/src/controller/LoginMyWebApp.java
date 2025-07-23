package controller;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/loginMyWebApp")
public class LoginMyWebApp extends HttpServlet {
  static Connection con;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	    throws ServletException, IOException {
	  
    CustomerDAO cd=new CustomerDAOImpl();
	  
    String userName=request.getParameter("username");
    String passWord=request.getParameter("password1");
    String submitType=request.getParameter("submit");
    
    Customer c=cd.getCustomer(userName, passWord);
    
    if(submitType.equals("Login") && c!=null && c.getUsername()!=null) {
      request.setAttribute("msg", c.getName());
      request.getRequestDispatcher("welcome.jsp").forward(request, response);
    }
    else if(submitType.equals("Register")) {
      c.setName(request.getParameter("name"));
      c.setUsername(userName);
      c.setPassword(passWord);
      try {
        con=MyConnectionProvider.getCon();
        Statement st=con.createStatement();
        String strQuery = "select count(*) from mywebapp_tbl where cusername='"+userName+"'";
        ResultSet rs = st.executeQuery(strQuery);
        while(rs.next()) {
          String countrow = rs.getString(1);
          System.out.println(countrow);
          if(countrow.equals("0")) {
            cd.insertCustomer(c);
            request.setAttribute("successmsg", "Registration done, Please Login!!!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
          } else {
            request.setAttribute("msg", "User already exist, Please change!!!");
            request.getRequestDispatcher("registration.jsp").forward(request, response);
          }
        }
      } catch(Exception e) {
        System.out.println(e);
      }
    }
    else {
      request.setAttribute("msg", "User Not Found, Please Register!!!");
      request.getRequestDispatcher("registration.jsp").forward(request, response);
    }
	}
}