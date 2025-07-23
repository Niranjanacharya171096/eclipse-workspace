package controller;

import java.io.*;   
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ProductDBServlet")
public class ProductDBServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType ("text/html");
    
    ArrayList al = new ArrayList ();

    PrintWriter pw = response.getWriter ();
    
    String pid1 = request.getParameter ("pid");
    String pname = request.getParameter ("pname");
    String pprice1 = request.getParameter ("pprice");

    int pid = 0;
    double price = 0;
    
    if ((pid1 == null)||(pid1.equals (""))) {
      al.add ("PROVIDE PODUCT NUMBER...");
    } else {
      try {
        pid = Integer.parseInt (pid1);
      } catch (NumberFormatException nfe) {
        al.add ("PROVIDE INT DATA IN PRODUCT NUMBER");
      }
    }
    if ((pname == null)||(pname.equals (""))) {
      al.add ("PROVIDE PRODUCT NAME...");
    } 
    if ((pprice1 == null)||(pprice1.equals (""))) {
      al.add ("PROVIDE PRODUCT PRICE...");
    } else {
      try {
        price = Double.parseDouble(pprice1);
      } catch (NumberFormatException nfe) {
        al.add ("PROVIDE FLOAT DATA IN PRODUCT PRICE");
      }
    }

    if (al.size ()!= 0) {
      pw.println (al);
    } else {
      try {
        DriverManager.registerDriver (new com.mysql.cj.jdbc.Driver());
        String url = "jdbc:mysql://localhost:3306/product_db";
        Connection con = DriverManager.getConnection (url,"root","root");
        String dml = "insert into product_tb values (?,?,?)";
        PreparedStatement ps = con.prepareStatement (dml);
        ps.setInt (1, pid);
        ps.setString (2, pname);
        ps.setDouble(3, price);
        int i = ps.executeUpdate ();
        pw.println ("<h4>"+i+" ROWS INSERTED...");
        con.close ();
      } catch (Exception e) {
        response.sendError (503, "PROBLEM IN DATABASE...");
      }
    }
  }
}

