<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="bean.CheckBean" %> 
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
  </head>
  <body>
    <jsp:useBean id="check" class="bean.CheckBean" scope="session"> 
      <jsp:setProperty name="check" property="*"/> 
    </jsp:useBean> 
    <%= check.validate() %> 
  </body>
</html>