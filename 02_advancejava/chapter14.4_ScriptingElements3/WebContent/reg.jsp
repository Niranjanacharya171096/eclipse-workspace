<%@page import="java.sql.*"%>
<%
  int id=Integer.parseInt(request.getParameter("id"));
  String name=request.getParameter("name");
  String email=request.getParameter("email");
  String address=request.getParameter("address");
  String qual=request.getParameter("qual");
  
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qualificationdb", "root", "root");
  PreparedStatement ps = con.prepareStatement("insert into student value(?,?,?,?,?)");
  ps.setInt(1,id);
  ps.setString(2,name);
  ps.setString(3,email);
  ps.setString(4,address);
  ps.setString(5,qual);
  
  int i = ps.executeUpdate();
%>

<%
  if(i == 0){
%>
  Not Updated
  <%out.println("Can't Updated");%>
<%
  } else {
%>
  Registered and
  <%out.println("Updated");%>
<%
}
%>

<%
  con.close();
  ps.close();
%>