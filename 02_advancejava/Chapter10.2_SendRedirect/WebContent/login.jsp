<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
  </head>
  <body>
    <%
      String uname = request.getParameter("uname");
      String pwd = request.getParameter("pwd");
      
      if(uname.equals("admin") && pwd.equals("admin")){
        request.setAttribute("msg", "login Success");
        session.setAttribute("msg", "login Success");
        response.sendRedirect("./sucess.jsp");
      } else {
        request.setAttribute("msg", "login failed");
        session.setAttribute("msg", "login failed");
        response.sendRedirect("./fail.jsp");
      }
    %>
  </body>
</html>
