package com.advancedjava;

import java.io.FileInputStream;
import java.sql.*; 
import java.util.*;

class ConnectDriver {
	public static void main (String[] args) {
		System.out.println("\n\n***** MySQL JDBC Connection Testing *****");
		Connection con = null;
        try {
            System.out.println ("\n\t-------1.Loading the drivers-------");
            
//     	    Class.forName ("com.mysql.cj.jdbc.Driver"); 
            //or
//			Driver d = new com.mysql.cj.jdbc.Driver();
//			DriverManager.registerDriver (d);
            Properties prop = new Properties();
            prop.load(new FileInputStream("E:\\Software Files\\eclipse-workspace\\com.advancedjava\\DB.properties")); 
            Class.forName (prop.getProperty("driver")); //dynamically passing from Properties

            System.out.println ("\nLoaded Successfully...");
            
            System.out.println ("\n\t-------2.Obtain the connection-------");
//			String userName = "root";
//          String password = "root";
//          String url = "jdbc:mysql://localhost:3306/studentdb";        
//          con = DriverManager.getConnection (url, userName, password);
            con=DriverManager.getConnection(prop.getProperty("url"), prop); 
            System.out.println ("\nDatabase Connection Established...");

            System.out.println ("\n\t-------3.Pass the SQL query-------");
            Statement st = con.createStatement ();

            System.out.println ("\n\t-------4.Execute the SQL query-------");
//			String ddl = "create table student(id number, name varchar2(50), mark varchar(50))";
//			Boolean b = st.execute(ddl);

			// by default commit transaction is true 
//			String dml = "insert into student values(88, 'niranjan', 85);";
//			con.setAutoCommit(false);
//			String dml = "insert into student values(118, 'sayeed', 115);";
//			st.executeUpdate(dml);
//			con.commit();
//			int noOfrowsaffected = st.executeUpdate(dml);

//			System.out.println("no of rows affected:" +noOfrowsaffected );

			String drl = "select * from Student";
			ResultSet rs=st.executeQuery(drl);
			System.out.println("---------------------------------------");
			while(rs.next()) {
				System.out.println("|stno: " + rs.getInt(1) + " |stname: " + rs.getString(2) + " |marks: " + rs.getInt(3)+ "|");
			} 
            System.out.println ("\nSQL query executed successfully...");
       }
       catch (Exception ex) {
    	   System.err.println ("Cannot connect to database server");
    	   ex.printStackTrace();
       }      
		   
        finally {
        	if (con != null) {
                try {
                    System.out.println ("\n\t-------5.Close the connection-------");
                    con.close ();					   
                    System.out.println ("\nDatabase connection terminated...");
                }
                catch (Exception ex) {
				   System.out.println ("Error in connection termination!");
                }
            }
        }
    }
}

 