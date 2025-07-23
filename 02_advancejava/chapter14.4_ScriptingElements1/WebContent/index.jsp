<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.io.*, java.sql.*"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
  </head>
  <body>
    <h4>Current date & time</h4> 
    <% 
      java.util.Date d=new java.util.Date ();       
      String s=d.toString ();       
      out.println (s); 
    %> 
    <br>
    <% 
      java.util.Date dt=new java.util.Date (); 
    %> 
    <h3><%= dt %></h3> 
    <br>
    <%=new java.util.Date ()%> 
    <br>
    <h4>Print 1-10</h4> 
    <% 
      for (int i=1; i<=10; i++) { 
        out.println (i); 
      } 
    %>
    <br>
    <h4>Print a statement</h4> 
    <%out.println("Used scriplet tag to print this");%>
    <br>
    <h4>Page Reload Count</h4> 
    <%! int ctr=0; %> 
    <%! 
      int count () { 
        return (++ctr); 
      } 
    %> 
    <h3><%= count () %></h3> 
    <br>
    <h4>DataBase Program</h4> 
    <%! 
      private Connection con=null;      
      private Statement st=null;
      
      public void jspInit () { 
        try { 
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qualificationdb", "root", "root");
          st=con.createStatement (); 
        } catch (Exception e) { 
          e.printStackTrace();
        } 
      }
      public void jspDestroy() {
        try {
          con.close();
        } catch(Exception e) {
          e.printStackTrace();
        }
      }
    %> 
    <%  
      try { 
        ResultSet rs=st.executeQuery ("select * from student"); 
        while (rs.next ()) { 
          out.println ("<h3>"+rs.getInt (1)+"  "+rs.getString (2)+"</h3>"); 
        } 
      } catch (Exception e) { 
        out.println (e); 
      } 
    %> 
  </body>
</html>

