package com.javatpoint;

import javax.servlet.*;  
import java.sql.*;

public class MyListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent arg0) {
		
		Connection con=null;
	try{
		
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MailCasting", "root", "root");
		System.out.println("1");

		PreparedStatement ps2= con.prepareStatement("Select * from INBOX6 order by id;");
		ps2.executeUpdate();
		System.out.println("2");
		PreparedStatement ps=con.prepareStatement("CREATE TABLE MAILCASTINGUSER(EMAIL VARCHAR(45),PASSWORD VARCHAR(45),NAME VARCHAR(45),GENDER VARCHAR(45),MNAME VARCHAR(45), COUNTRY VARCHAR(45)))");
		ps.executeUpdate();
		System.out.println("3");
		PreparedStatement ps4=con.prepareStatement("CREATE TABLE INBOX6(ID INT,RECIEVER VARCHAR(45),SENDER VARCHAR(45),MESSAGE VARCHAR(45),DATE_OF_RECEIVING VARCHAR(45))");
		ps4.executeUpdate();		
		
		System.out.println("2");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("CREATE TRIGGER  BI_INBOX6 before insert on INBOX6 for each row begin select JAVATPOINT.nextval into :NEW.ID from dual;end");
		}	
		    catch(Exception e){
	    	e.printStackTrace();
	    	
	    }
	    }
	    
	    public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("project undeployed");
		
	}
}
