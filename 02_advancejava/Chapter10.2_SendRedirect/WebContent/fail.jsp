<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
  </head>
  <body>
    <%=request.getAttribute("msg") %>
    <%=session.getAttribute("msg") %>
    Please re-check :(
  </body>
</html>

