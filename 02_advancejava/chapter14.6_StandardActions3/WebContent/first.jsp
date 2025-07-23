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
      <form name="first" action="third.jsp" method="post"> 
        <input type="hidden" name="fno" value="1"/>
          
        <table> 
          <tr> 
            <th align="left">Enter number : </th> 
            <td><input type="text" name="first_stno" value=""></td> 
          </tr> 
          <tr> 
            <th align="left">Enter name : </th> 
            <td><input type="text" name="first_stname" value=""></td> 
          </tr> 
        </table> 
        <input type="submit" value="Send">&nbsp;&nbsp;&nbsp; 
        <input type="reset" value="Clear"> 
      </form> 
    </center>  
  </body>
</html>

