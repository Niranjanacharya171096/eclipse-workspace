<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
  </head>
  <body>
    Exception is <%= exception %> generated...<br> 
    Exception message is <%= exception.getMessage () %><br> 
    <%@ include file="Copyright.html" %> 
  </body>
</html>

