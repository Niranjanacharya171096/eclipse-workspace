<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page import="oracle.jdbc.driver.*" %>
<!DOCTYPE html>
<html>
  <body>
    <%
    try {
      DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver ());
      out.print ("Drivers loaded");
      Connection con=DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:BudDinu","root","root");
      out.print ("Connection established");
      String url="select * from emp";
      PreparedStatement ps=con.prepareStatement (url);
      ResultSet rs=ps.executeQuery ();
      ResultSetMetaData rsmd=rs.getMetaData ();
      ColCount=rsmd.getColumnCount ();
      i=1;
    %>
    <table bgcolor=lightyellow align=center border=2>
    <%
      while (i<=ColCount) {
    %>
    <th>
    <% out.print (rsmd.getColumnName (i)); %>
    </th>
    <%
        i++; 
      }
      while (rs.next ()) {
    %>
    <tr>
    <%
      j=1;
      while (j<=ColCount) {
    %>
    <td>
    <% out.print (rs.getString (j)); %>
    </td>
    <%
        j++;
      }
    %>
    </tr>
    <%
        rs.close ();
        con.close ();
      }
      catch (Exception e) {
        e.printStackTrace ();
      }
    %>
  </body>
</html>
