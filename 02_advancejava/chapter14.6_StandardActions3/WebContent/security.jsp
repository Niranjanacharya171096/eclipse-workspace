<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page session="true" %> 
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
  </head>
  <body>
    <% 
      String s1=request.getParameter ("login_uname");
      String s2=request.getParameter ("login_pwd");
      
      if (s1.equals ("xxxx") && s2.equals ("xxxx")) { 
    %>
    <jsp:forward page="first.jsp"/>
    <% 
      } else { 
    %>
    <h4>Login Failed</h4>
    <jsp:include page="login.html"/>
    <% 
      }
    %>
  </body>
</html>
