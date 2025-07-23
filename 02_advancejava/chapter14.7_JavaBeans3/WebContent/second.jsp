<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
  </head>
  <body>
    <h3>Application variable is retrieving</h3> 
    <%! 
      String name; 
      String pwd; 
    %> 
    <% 
      name=(String)application.getAttribute ("val1");     
      pwd=(String)application.getAttribute ("val2"); 
    %> 
    Name :: <%= name %> 
    Password :: <%= pwd %> 
  </body>
</html>