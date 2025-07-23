<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Hello Jsp</title>
  </head>
  <body bgcolor="green">
    Today Date: <%out.println(new java.util.Date()); %>
    <br>
    Today Date:<%= new java.util.Date() %>
    <br>
    <%! int age = 20; %>
    <% if(age<20){ %>
      Not Allowed to marry.
    <% } else { %>
      Allowed to marry.
    <% } %>
    <table border=5>
      <tr><th>NUM:</th><th>VAL</th></tr>
      <% for(int i = 0; i < 10; i++){ %>
        <tr><th>Num:</th><th><%=i+1 %></th></tr>
      <% } %>
    </table>
  </body>
</html>
