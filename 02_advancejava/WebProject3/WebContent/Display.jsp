<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Information</title>
</head>
<body bgcolor=pink>
<jsp:useBean id="student" scope="request" class="beans.Student" />
<h2>Entered Student Information</h2>
<br>
<br>
<h3>
Student Name :<jsp:getProperty name="student" property="sname" /><br>
USN :<jsp:getProperty name="student" property="usn" /><br>
Total Marks :<jsp:getProperty name="student" property="smarks" />
</h3>
</body>
</html>