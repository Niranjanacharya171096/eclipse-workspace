package com.javatpoint;
import javax.servlet.*; 
import java.sql.*;

public class MyListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent arg0) {
		
		Connection con=null;
	try{
		ResultSet rs;
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connect_globe", "root", "root");
		
		PreparedStatement ps1=con.prepareStatement("Select * from FORUMREG");
		
		rs=ps1.executeQuery();
		if(rs.next())
		{System.out.println("your table name already exist");}
		else 
		{System.out.println("else if part table does not exist new table has created");
	
		
		PreparedStatement ps2= con.prepareStatement("CREATE SEQUENCE JAVATPOINT MINVALUE 1 MAXVALUE 999999999 INCREMENT BY 1 START WITH 1 NOCACHE NOORDER NOCYCLE");
		ps2.executeUpdate();
		PreparedStatement ps=con.prepareStatement("CREATE TABLE  FORUMREG(ID INT,USERNAME VARCHAR(4000),USERPASS VARCHAR(4000),EMAIL VARCHAR(4000),MOBILE INT,ADDRESS VARCHAR(4000),CONSTRAINT FORUMREG_PK PRIMARY KEY (ID) ENABLE)");
		ps.executeUpdate();
		PreparedStatement ps4=con.prepareStatement("CREATE TABLE  FORUMREP(ID INT,COUNTRY VARCHAR(4000),STATE VARCHAR(4000),DISTRICT VARCHAR(4000),POLICE_STATION VARCHAR(4000),REPORT VARCHAR(4000),STATUS VARCHAR(4000),IMAGE BLOB,EMAIL VARCHAR(4000),POSTEDON DATE,CONSTRAINT FORUMREP_PK PRIMARY KEY (ID) ENABLE)");
		ps4.executeUpdate();		
		
	
		PreparedStatement  ps5=con.prepareStatement("CREATE TABLE FORUMADVC(RID INT,ID INT,CMT VARCHAR(4000),EMAIL VARCHAR(4000),CONSTRAINT FORUMADVC_PK PRIMARY KEY (ID) ENABLE)");
		ps5.executeUpdate();
		
		
		ps5= con.prepareStatement("CREATE TABLE  FORUMTPC (	ID INT, TOPIC VARCHAR(4000), EMAIL VARCHAR(4000),CREATEDON DATE NOT NULL ENABLE,CONSTRAINT FORUMTPC_PK PRIMARY KEY (ID) ENABLE )");
		ps5.executeUpdate();
		
		
		ps5= con.prepareStatement("CREATE TABLE  FORUMTADVC(ID INT, TID INT, CMT VARCHAR(4000), EMAIL VARCHAR(4000),CONSTRAINT FORUMTADVC_PK PRIMARY KEY (ID) ENABLE)");
		ps5.executeUpdate();
		Statement stmt=con.createStatement();
		stmt.executeUpdate("CREATE OR REPLACE TRIGGER  BI_FORUMREG before insert on FORUMREG for each row begin select JAVATPOINT.nextval into :NEW.ID from dual; end");
		stmt.executeUpdate("CREATE OR REPLACE TRIGGER  BI_FORUMREP before insert on FORUMREP for each row begin select JAVATPOINT.nextval into :NEW.ID from dual;end");
		stmt.executeUpdate("CREATE OR REPLACE TRIGGER  BI_FORUMADVC before insert on FORUMADVC for each row begin select JAVATPOINT.nextval into :NEW.ID from dual;end");
		stmt.executeUpdate("CREATE OR REPLACE TRIGGER  BI_FORUMTADVC before insert on FORUMTADVC for each row begin select JAVATPOINT.nextval into :NEW.ID from dual;end");
		stmt.executeUpdate("CREATE OR REPLACE TRIGGER  BI_FORUMTPC before insert on FORUMTPC for each row begin select JAVATPOINT.nextval into :NEW.ID from dual;end");
		}	
	}
		
	    catch(Exception e){
	    	e.printStackTrace();
	    	
	    }
	    }
	    
	    public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("project undeployed");
		
	}
}
