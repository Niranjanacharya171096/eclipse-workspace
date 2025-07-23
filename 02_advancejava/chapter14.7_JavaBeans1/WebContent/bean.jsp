<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
  </head>
  <body>
    <jsp:useBean id="obj" class="bean.TechBean"> 
      <jsp:setProperty name="obj" property="*"/> 
    </jsp:useBean> 
    <h3>Result of bean action tags</h3> 
    Hello <jsp:getProperty name="obj" property="name"/> <br>
    For <jsp:getProperty name="obj" property="lang"/> <br>
    <jsp:getProperty name="obj" property="langComments"/> 
    <h3>Result of expression tags</h3> 
    Name : <%= obj.getName () %><br> 
    Language : <%= obj.getLang () %><br> 
    Comment : <%= obj.getLangComments () %> 
  </body>
</html>