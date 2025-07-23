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
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/citysearch", "root", "root");
		PreparedStatement ps=con.prepareStatement("CREATE TABLE CITY1_DETAILS(ID INT,NAME VARCHAR(45),CATEGORY VARCHAR(45),EMAIL VARCHAR(45),ADDRESS VARCHAR(45),CITY VARCHAR(45),CONTACT VARCHAR(45),PRIMARY KEY (ID))");
		ps.executeUpdate();
	
		ps=con.prepareStatement("CREATE SEQUENCE CITY1_DETAILS_SEQ MINVALUE 1 MAXVALUE 999999999 INCREMENT BY 1 START WITH 1 NOCACHE NOORDER NOCYCLE");
		ps.executeUpdate();
		
		
		PreparedStatement ps2= con.prepareStatement("CREATE SEQUENCE CITY_CLASSIFIED_SEQ MINVALUE 1 MAXVALUE 999999999 INCREMENT BY 1 START WITH 1 NOCACHE NOORDER NOCYCLE");
		ps2.executeUpdate();
		
		PreparedStatement ps4=con.prepareStatement("CREATE TABLE  CITY_CLASSIFIED(ID INT,BUYSELL VARCHAR(45),NAME VARCHAR(45),DESCRIPTION VARCHAR(45),USERID INT,PRIMARY KEY (ID))");
		ps4.executeUpdate();		
		
		
		ps2= con.prepareStatement("CREATE SEQUENCE CITY1_USER_SEQ MINVALUE 1 MAXVALUE 999999999 INCREMENT BY 1 START WITH 1 NOCACHE NOORDER NOCYCLE");
		ps2.executeUpdate();
		
		
	 PreparedStatement	ps5 = con.prepareStatement("CREATE TABLE  CITY1_USER(ID INT,NAME VARCHAR(45),PASSWORD VARCHAR(45),EMAIL VARCHAR(45),ADDRESS VARCHAR(45),COUNTRY VARCHAR(45),CONTACT INT,PRIMARY KEY (ID))");		
		ps5.executeUpdate();
		
		
		
	
	}
		
	    catch(Exception e){
	    	e.printStackTrace();
	    	
	    }
	    
	}
	    public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("project undeployed");
		
	}
}
