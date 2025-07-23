<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page session="true" %> 
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Second</title>
  </head>
  <body>
    <% String str=request.getParameter ("first_name"); %> 
    Your name is <h4><%= str %></h4> 
    <% session.setAttribute ("name",str); %> 
    <form action="Third.jsp">
      <br> Send the request to next page<br> 
      <input type="submit" value="Send"> 
    </form> 
  </body>
</html>

