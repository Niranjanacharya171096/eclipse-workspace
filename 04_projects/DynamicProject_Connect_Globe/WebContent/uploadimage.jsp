<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%
String islogin=(String)session.getAttribute("islogin");
if(islogin==null){
request.setAttribute("notlogin_msg","Sorry,Please do Login first");

%>
<jsp:forward page="index.jsp"></jsp:forward>
<%
}
%>
<%
java.util.Date sqdate=Calendar.getInstance().getTime();
	java.sql.Date dat =new java.sql.Date(sqdate.getTime());
String country=request.getParameter("slist1");
String state=request.getParameter("slist2");
String district=request.getParameter("slist3");
String police=request.getParameter("slist4");
String report=request.getParameter("report");
String status=request.getParameter("status");
String email=(String)session.getAttribute("email");
System.out.println(country);
System.out.println(state);
System.out.println(district);
System.out.println(police);
System.out.println(report);
System.out.println(status);
System.out.println(email);
	try{
		System.out.println("Database");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connect_globe", "root", "root");
		System.out.println("Connected");
  PreparedStatement ps =con.prepareStatement("insert into forumrep(country,state,district,police_station,report,status,email,postedon)"+"values(?,?,?,?,?,?,?,?)");
	System.out.println("PS");
	ps.setString(1,country);
	ps.setString(2,state);
	ps.setString(3,district);
	ps.setString(4,police);
	ps.setString(5,report);
	ps.setString(6,status);
	ps.setString(7,email);
	ps.setDate(8,dat);
	System.out.println("PSset");

int s=	ps.executeUpdate();
System.out.println("Updated"+s);
if(s>0){
System.out.println("save");
%>

<jsp:forward page="uploadpic.jsp"></jsp:forward>

<%
}
else{System.out.println("sorry!try again");}	
 }catch(Exception e){}
   %>