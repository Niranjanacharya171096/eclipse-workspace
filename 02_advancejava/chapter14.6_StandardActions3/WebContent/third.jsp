<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page session="true" %>
<%@ page import="java.text.*, java.sql.*, java.io.*" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
  </head>
  <body>
    <%! 
      Connection con=null;
      PreparedStatement ps=null;
    %>
    <%!
      public void jspInit () {
        try {
          Class.forName ("com.mysql.cj.jdbc.Driver");
          con=DriverManager.getConnection ("jdbc:mysql://localhost:3306/student_db", "root","root");
          ps=con.prepareStatement ("insert into student_tbl values (?,?,?,?,?)");
        }
        catch (Exception e) {
          System.out.println (e);
        }
      } 
    %>
    <%
      HttpSession hs = request.getSession();
      String fno = request.getParameter("fno");
      SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    
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
    
           System.out.println ("getAttr");
           
           String stno = (String)hs.getAttribute("stno");
           System.out.println (stno);
           String sname = (String)hs.getAttribute("sname");      
           System.out.println (sname);
           scollege = (String)hs.getAttribute("scollege");
           System.out.println (scollege);
           mark = (String)hs.getAttribute("mark");     
           System.out.println (mark);
           dob = (String)hs.getAttribute("dob");     
           System.out.println (dob);
           
           int snum=Integer.parseInt(stno);
           System.out.println (snum);
           float smark=Float.parseFloat(mark);
           System.out.println (smark);
           java.util.Date udob = sdf.parse(dob);
           java.sql.Date sqdob = new java.sql.Date(udob.getTime());
           System.out.println (udob+" "+sqdob);
    
           ps.setInt (1, snum);
           ps.setString (2, sname);
           ps.setString (3, scollege);
           ps.setFloat (4, smark);
           ps.setDate (5, sqdob);
           int i=ps.executeUpdate ();
           System.out.println (i);
    
           if (i>0) { 
    %>
            <html>
              <body bgcolor="lightblue">
                <center>
                  <h3>Inserted Successfully</h3>
                </center>
                <a href="first.jsp">One more</a>
                <br>
                <a href="login.html">Logout</a>
              </body>
            </html>
    <% 
           } else {
    %>
            <html>
              <body bgcolor="lightblue">
                <center>
                  <h3>Try again</h3>
                </center>
                  <a href="login.html">Home</a>
              </body>
            </html>
    <%
          }
        }
      } catch (Exception e) {
        out.println(e);
      } 
    %>
  </body>
</html>