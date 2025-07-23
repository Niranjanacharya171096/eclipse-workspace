<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
  </head>
  <body>
    <%
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qualificationdb", "root", "root");
      PreparedStatement ps = con.prepareStatement("select * from qualification");
      ResultSet rs = ps.executeQuery();
    %>
    <form action="./reg.jsp" method="post">
        <table border="1" bgcolor="#E9967A"> 
          <tr> <th>ID: </th> <td><input type="text" name="id" id="id"/></td> </tr> 
          <tr> <th>Name: </th> <td><input type="text" name="name" id="name"/></td> </tr> 
          <tr> <th>Email: </th> <td><input type="text" name="email" id="email"/></td> </tr> 
          <tr> <th>Address: </th> <td><textarea rows="5"  columns="15"  type="text" name="address" id="address"></textarea></td> </tr> 
          <tr> <th>Qualification: </th> 
            <td>
              <select name="qual">
              <%
                while(rs.next()){
              %>
                <option value="<%=rs.getString(2) %>"><%=rs.getString(2) %></option>
              <%
                }
              %>
            <option></option>
            <option></option>
            <option></option>
            <option></option>
              </select>
            </td> 
          </tr> 
          <tr> 
            <table> 
            <tr> 
              <td align="center"><input type="submit" name="Register" value="Register"/></td> 
            </tr> 
            </table> 
          </tr> 
        </table> 
    </form> 
  </body>
</html>