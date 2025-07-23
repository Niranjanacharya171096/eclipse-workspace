<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%!String username=null,password=null;%>
<%
username=request.getParameter("uname");
password=request.getParameter("pwd");
%>
<%
if(username.equals("admin")&& password.equals("admin")){
response.sendRedirect("./Welcome.jsp");
}else{
out.println("<center><h4>Invalid username or password</h2></center>");
}
%>