<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>


<%
String n=request.getParameter("id");
String cmt=request.getParameter("cmt");
String email=(String)session.getAttribute("email");
System.out.println(n);
System.out.println(cmt);
System.out.println(email);
if(n.length()>0){
try{

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connect_globe", "root", "root");
PreparedStatement ps=con.prepareStatement("insert into forumtadvc(tid,cmt,email) values(?,?,?)");
ps.setString(1,n);
ps.setString(2,cmt);
ps.setString(3,email);

int rs=ps.executeUpdate();
if(rs>0){

}
else{
%>

<jsp:forward page="viewtopic.jsp"></jsp:forward>
<%

}
con.close();


}catch(Exception e){e.printStackTrace();}
}//end of if
%>
