<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
  </head>
  <body>
    List of Students<br> 
    <c:set var="str" value="abc, pqr, aaa" /> 
    <c:forTokens var="sname" items="${str}" delims=","> 
      <c:out value="${sname}" /><br> 
    </c:forTokens> 
  </body>
</html>