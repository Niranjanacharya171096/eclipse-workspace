<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyWebApp</title>
</head>
  <body bgcolor="yellow">
    <form action="loginMyWebApp" method="post"> 
      <table align="center"> 
        <tr> 
        <td> 
        <h3 style="color:red;"> ${msg} </h3> 
        </td> 
        </tr>
      </table>
      <table align="center" bgcolor="orange" border="1"> 
        <tr><td> Register to MyWebApp </td> </tr>
      </table>
      <table  align="center" style="background-color:skyblue; margin-left:20px; margin-left:20px;"> 
        <tr> <th align="left">Name </th> <td><input type="text" name="name" id="nm"> </td> </tr> 
        <tr> <th align="left">EmailId </th> <td><input type="text" name="username" id="usrname"> </td> </tr> 
        <tr> <th align="left">Set Password </th> <td><input type="password" name="password1" id="pwd1"></td> </tr> 
        <tr> <th align="left">Re-Type Password </th> <td><input type="password" name="password2" id="pwd2"></td> </tr> 
        <tr> 
          <table align="center" > 
            <tr> 
              <td><input type="submit" name="submit" value="Register" id="btn"></td> 
              <td><a href="login.jsp">Login</td> 
            </tr> 
          </table> 
        </tr> 
      </table> 
    </form> 
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    <script type="text/javascript">
      $(function () {
          $("#btn").click(function () {
              var password = $("#pwd1").val();
              var confirmPassword = $("#pwd2").val();
              if (password != confirmPassword) {
                  alert("Passwords do not match.");
                  return false;
              }
              return true;
          });
      });
	</script>
  </body>
</html>
