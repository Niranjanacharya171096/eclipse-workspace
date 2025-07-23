<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
  </head>
  <body>
    <h5>Login Successful</h5> 
    Welcome to :&nbsp; 
    <h4><%= request.getParameter ("login_uname") %></h4> 
  </body>
</html>

