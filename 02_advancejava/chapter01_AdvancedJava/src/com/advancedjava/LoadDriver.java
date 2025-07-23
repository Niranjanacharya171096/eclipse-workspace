package com.advancedjava;

import java.sql.*; 
import java.util.*;

class LoadDriver
   {
       public static void main (String[] args)
       {
           System.out.println("\n\n***** MySQL JDBC Connection Testing *****");
		   Connection con = null;
           try
           {
        	   Class.forName ("com.mysql.cj.jdbc.Driver");
   			   Driver d = new com.mysql.cj.jdbc.Driver();
   			   DriverManager.registerDriver (d);
               String userName = "root";
               String password = "root";
               String url = "jdbc:mysql://localhost:3306/studentdb";        
               con = DriverManager.getConnection (url, userName, password);
               System.out.println ("\nDatabase Connection Established...");
               
               Statement st = con.createStatement ();
//   			int i = st.executeUpdate ("insert into student values (10,'suman',60.87);"); 
//    	 	 	System.out.println (i+" ROWS SELECTED..."); 
//    	 	 	
//    	 	 	st.close();
//   			con.close ();
//   			String ddl = "create table StudentDB(id number, name varchar2(50), email varchar(50))";
//   			Boolean b = st.execute(ddl);

   			// by default commit transaction is true 
//   			String dml = "insert into student values(88, 'niranjan', 85);";
//   			con.setAutoCommit(false);
//   			String dml = "insert into student values(118, 'sayeed', 115);";
//   			st.executeUpdate(dml);
//   			con.commit();
//   			int noOfrowsaffected = st.executeUpdate(dml);

//			System.out.println("no of rows affected:" +noOfrowsaffected );

   			String drl = "select * from Student";
   			ResultSet rs=st.executeQuery(drl);
			System.out.println("---------------------------------------");
   			while(rs.next()) {
   				System.out.println("|stno: " + rs.getInt(1) + " |stname: " + rs.getString(2) + " |marks: " + rs.getInt(3)+ "|");
   			}               
          }
          catch (Exception ex)
           {
		       System.err.println ("Cannot connect to database server");
			   ex.printStackTrace();
           }      
		   
		   finally
           {
               if (con != null)
               {
                   try
                   {
                       System.out.println("\n***** Let terminate the Connection *****");
					   con.close ();					   
                       System.out.println ("\nDatabase connection terminated...");
                   }
                   catch (Exception ex)
				   {
				   System.out.println ("Error in connection termination!");
				   }
               }
           }
       }
   }
 