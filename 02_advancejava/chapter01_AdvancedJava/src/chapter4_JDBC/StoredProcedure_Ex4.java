package chapter4_JDBC;

//mysql> CREATE PROCEDURE `dept_proc`(in dno int, out dname varchar(45), out dloc varchar(45))
//-> Begin
//-> select dept_Name, dept_Loc into dname, dloc from department1
//-> where dept_No = dno;
//-> insert into department_2 values (dno, dname, dloc);
//-> End$$
//Query OK, 0 rows affected (0.26 sec)

import java.sql.*; 
import java.io.*;

class StoredProcedure_Ex4 {
  public static void main (String [] args) {
    try {
      DriverManager.registerDriver (new com.mysql.cj.jdbc.Driver());
      System.out.println ("DRIVERS LOADED...");
      
      String userName = "root";
      String password = "root";
      String url = "jdbc:mysql://localhost:3306/studentdb";      
      Connection con = DriverManager.getConnection (url, userName, password);
      System.out.println ("CONNECTION OBTAINED...");
           
      CallableStatement cs = con.prepareCall ("{call dept_proc (?,?,?)}");
      DataInputStream dis = new DataInputStream (System.in);
      System.out.println ("ENTER DEPARTMENT NUMBER : ");
      String s = dis.readLine ();
      int n = Integer.parseInt (s);
      cs.setInt (1,n);
      cs.registerOutParameter (2, Types.VARCHAR);
      cs.registerOutParameter (3, Types.VARCHAR);
      cs.execute ();
      
      String res1 = cs.getString (2);
      String res2 = cs.getString (3);
      System.out.println ("DEPARTMENT NAME : "+res1);
      System.out.println ("DEPARTMENT LOCATION : "+res2);
      
      String drl = "select * from department_1";
      ResultSet rs = cs.executeQuery(drl);
      System.out.println("-----------------department_1----------------------");
      while(rs.next()) {
        System.out.print("|dept_No: " + rs.getInt(1) + " |dept_Name: " + rs.getString(2));
        System.out.println(" |dept_Loc: " + rs.getString(3)+ "|");
      } 
        
      drl = "select * from department_2";
      rs = cs.executeQuery(drl);
      System.out.println("------------------department_2---------------------");
      while(rs.next()) {
        System.out.print("|dno: " + rs.getInt(1) + " |dname: " + rs.getString(2));
        System.out.println(" |dloc: " + rs.getString(3)+ "|");
      } 
      cs.close();
      con.close();
    } catch (Exception e) {
      System.out.println (e);
    }
  }
}
