<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>


<%
String n=request.getParameter("val");
if(n.length()>0){
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MailCasting", "root", "root");

PreparedStatement ps=con.prepareStatement("delete  from inbox6 where id = '"+n+"' ");
//ps.setString(1,n);
out.print("<br>");
int s=ps.executeUpdate();
out.print("Mail has been successfully deleted");
con.close();
}catch(Exception e){e.printStackTrace();}
}//end of if
%>
<jsp:forward page="inbox.jsp"></jsp:forward>