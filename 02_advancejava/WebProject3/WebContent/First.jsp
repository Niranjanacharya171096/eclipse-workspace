<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Information</title>
</head>
<body>
<jsp:useBean id="student" scope="request" class="beans.Student" />
<jsp:setProperty name="student" property="*" />
<jsp:forward page="Display.jsp" />
</body>
</html>