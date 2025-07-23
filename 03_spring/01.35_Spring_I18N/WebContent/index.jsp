<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> --%>
<!-- <!DOCTYPE html> -->
<%@page import="java.util.Locale"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>

<%
// first need to know the broswer language
String lang = request.getHeader("accept-language");
Locale locale = new Locale(lang);

ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
String value = ap.getMessage("label", null, locale);
%>

<form action="./hello">
<%=value%>:<input type="text" name="name"/>
		   <input type="submit" value="submit"/>
</form>
