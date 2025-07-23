<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page session="true" %> 
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Third</title>
  </head>
  <body>
    Value in third page from session objects is 
  <h4><%= session.getAttribute ("name") %></h4> 
  </body>
</html>

