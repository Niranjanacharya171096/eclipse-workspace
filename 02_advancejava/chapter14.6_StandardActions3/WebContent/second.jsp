<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page session="true" %> 
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
  </head>
  <body>
    <center> 
    <form name="second" action="third.jsp" method="post">       
        <input type="hidden" name="fno" value="2"/>  
          
    <table> 
      <tr> 
      <th align="left">Enter college name : </th> 
      <td><input type="text" name="second_cname" value=""></td> 
      </tr> 
      <tr> 
      <th align="left">Enter marks : </th> 
      <td><input type="text" name="second_marks" value=""></td> 
      </tr> 
      <tr> 
      <th align="left">Enter date of birth : </th> 
      <td><input type="text" name="second_dob" value=""></td> 
      </tr> 
    </table> 
    <input type="submit" value="Send">&nbsp;&nbsp;&nbsp; 
    <input type="reset" value="Clear"> 
    </form> 
  </center> 
  </body>
</html>

