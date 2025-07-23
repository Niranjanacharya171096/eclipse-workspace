<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
  </head>
  <body>
    <form action="./login.jsp" method="post"> 
      <table border="1" bgcolor="#E9967A"> 
        <tr> <th>UserName: </th> <td><input type="text" name="uname" id="uname"/></td> </tr> 
        <tr> <th>Password: </th> <td><input type="text" name="pwd" id="pwd"/></td> </tr> 
        <tr> 
        <table> 
        <tr> <td align="center"><input type="submit" name="Login" value="Login"/></td> </tr> 
        </table> 
        </tr> 
      </table> 
    </form>
  </body>
</html>

