package chapter6_BatchProcessing;

import java.sql.*;

class BatchProcessing {
  public static void main (String [] args) throws Exception {
    Class.forName ("com.mysql.cj.jdbc.Driver");
    System.out.println ("DRIVERS LOADED...");
    
    String userName = "root";
    String password = "root";
    String url = "jdbc:mysql://localhost:3306/studentdb";        
    Connection con = DriverManager.getConnection (url, userName, password); 
    System.out.println ("CONNECTION ESTABLISHED...");
    
    int a = ResultSet.TYPE_SCROLL_SENSITIVE;
    int b = ResultSet.CONCUR_UPDATABLE;
    Statement st = con.createStatement (a, b); 
    //(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    String drl = "select * from student";
    ResultSet rs1 = st.executeQuery (drl);

    System.out.println ("RECORDS IN THE TABLE Before operations...");
    while (rs1.next ()) {
      System.out.println (rs1.getInt (1)+" "+rs1.getString (2)+" "+rs1.getString (3));
    }
    
    con.setAutoCommit (false);
//    Statement st = con.createStatement ();
    st.addBatch ("insert into student values (4, 'Mahesh', 58.5)");
    st.addBatch ("delete from student where id=8");
    st.addBatch ("update student set name='ramya' where id=2");
    int res[] = st.executeBatch ();
    for (int i=0; i<res.length; i++) {
      System.out.println ("NUMBER OF ROWS EFFECTED : "+res[i]);
    }
    
    ResultSet rs2 = st.executeQuery (drl);
    System.out.println ("RECORDS IN THE TABLE After operations...");
    while (rs2.next ()) {
      System.out.println (rs2.getInt (1)+" "+rs2.getString (2)+" "+rs2.getString (3));
    }
    con.commit ();
    con.rollback ();
    con.close ();
  }
}