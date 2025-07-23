<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyWebApp</title>
</head>
  <body bgcolor="pink">
    <form action="loginMyWebApp" method="post"> 
    
      <table align="center"> 
        <tr> 
        <td> 
        <h3 style="color:red;"> ${msg} </h3> 
        <h3 style="color:green;"> ${successmsg} </h3> 
        </td> 
        </tr>
      </table>
      
      <table align="center" bgcolor="orange" border="1">  
        <tr> <td> Login to MyWebApp </td> </tr>
      </table>
      
      <table  align="center" style="background-color:lightgreen; margin-center:20px; margin-center:20px;"> 
        <tr> <th align="left">User Name </th> <td><input type="text" name="username" value=""> </td> </tr> 
        <tr> <th align="left">Password </th> <td><input type="password" name="password1" value=""></td> </tr> 
        <tr> 
          <table align="center" > 
            <tr> 
              <td><input type="submit" name="submit" value="Login"></td> 
              <td><a href="registration.jsp">Register</td> 
            </tr> 
          </table> 
        </tr> 
      </table> 
    </form> 
  </body>
</html>
