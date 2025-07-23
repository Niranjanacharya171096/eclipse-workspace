<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> --%>
<!-- <!DOCTYPE html> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta charset="ISO-8859-1"> -->
<!-- <title>Insert title here</title> -->
<!-- </head> -->
<!-- <body> -->

<!-- </body> -->
<!-- </html>   -->


<%@page import="java.util.Locale"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>

<%
String lang = request.getHeader("accept-language");
Locale locale = new Locale(lang);

ApplicationContext ap = new ClassPathXmlApplicationContext("resouces/Spring.xml");
String value = ap.getMessage("lable", null, locale);
%>

<form action="./hello">
<%=value%>:<input type="text" name="name"/>
		   <input type="submit" value="submit"/>
</form>