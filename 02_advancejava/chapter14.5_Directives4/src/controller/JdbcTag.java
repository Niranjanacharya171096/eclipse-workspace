package controller;

import java.sql.*;
import javax.servlet.jsp.*; 
import javax.servlet.jsp.tagext.*;

public class JdbcTag extends TagSupport {
  String table, username, password, db;
  public void setUsername (String username) {
    this.username=username;
  }
  public void setPassword (String password) {
    this.password=password;
  }
  public void setDb (String db) {
    this.db=db;
  }
  public void setTable (String table) {
    this.table=table;
  }
  Connection con=null;
  PreparedStatement ps=null;
  ResultSet rs=null;
  ResultSetMetaData rsmd=null;
  public int doStartTag () throws JspException {
    try {
      Class.forName ("com.mysql.cj.jdbc.Driver");
      con=DriverManager.getConnection ("jdbc:mysql://localhost:3306/"+db,username,password);
      ps=con.prepareStatement ("select * from "+table);
      return EVAL_BODY_INCLUDE;
    }
    catch (Exception e) {
      throw new JspException (e.getMessage ());
    }
  }
  public int doEndTag () throws JspException {
    int i=1;
    try {
      rs=ps.executeQuery ();
      rsmd=rs.getMetaData ();
      pageContext.getOut ().print ("<table border=1><tr>");
      for (i=1; i<=rsmd.getColumnCount (); i++) {
        pageContext.getOut ().print ("<th>"+rsmd.getColumnName (i)+"</th>");
      }
      pageContext.getOut ().print ("</tr>");
      while (rs.next ()) {
        pageContext.getOut ().print ("<tr>");
        for (i=1; i<=rsmd.getColumnCount (); i++) {
          pageContext.getOut ().print ("<td>"+rs.getString (i)+"</td>");
        }
        pageContext.getOut ().print ("</tr>");
      }
      pageContext.getOut ().print ("</table>");
      return EVAL_PAGE;
    }
    catch (Exception e) {
      throw new JspException (e.getMessage ());
    }
  }
}
