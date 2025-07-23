package chapter4_JDBC;

import java.io.FileInputStream;     
import java.sql.*; 
import java.util.*;

class JDBCprogram {
  public static void main (String[] args) {
    System.out.println("\n\n***** MySQL JDBC Connection Testing *****");
    Scanner sc = new Scanner(System.in);
    Connection con = null;
    try {
      System.out.println ("\n\t-------1.Loading the drivers-------");
//    Class.forName ("com.mysql.cj.jdbc.Driver"); //or
//    Driver d = new com.mysql.cj.jdbc.Driver();
//    DriverManager.registerDriver (d); //or
      Properties prop = new Properties();
      prop.load(new FileInputStream("E:\\Software Files\\eclipse-workspace\\02_advancejava\\1_DBproperties\\DB.properties")); 
      Class.forName (prop.getProperty("driver")); //dynamically passing from Properties
      System.out.println ("\nLoaded Successfully...");
          
      System.out.println ("\n\t-------2.Obtain the connection-------");
//    String userName = "root";
//    String password = "root";
//    String url = "jdbc:mysql://localhost:3306/studentdb";        
//    con = DriverManager.getConnection (url, userName, password); //or
      con = DriverManager.getConnection(prop.getProperty("url1"), prop); 
      System.out.println ("\nDatabase Connection Established...");

      System.out.println ("\n\t-------3.Pass the SQL query-------");
      Statement st = con.createStatement ();
      
      String dml1 = "insert into student values (?, ?, ?)";
      String dml2 = "update student set percentage=? where id=?";
      String dml3 = "delete from student where id=?";
      String drl1 = "select * from student where id=?";
      PreparedStatement ps1 = con.prepareStatement (dml1);
      PreparedStatement ps2 = con.prepareStatement (dml2); 
      PreparedStatement ps3 = con.prepareStatement (dml3); 
      PreparedStatement ps4 = con.prepareStatement (drl1); 
//    System.out.println (ps);

      System.out.println ("\n\t-------4.Execute the SQL query-------");
                
      boolean flag = true;
      while(flag) {
        int userInput;

        System.out.println ("Enter your choice 1:Drop; 2:Create; 3:Insert; 4:Delete; 5:Update; 6:Display");
        userInput = sc.nextInt();

        switch(userInput) {
          case 1:
            String ddl;
            boolean a;
            DatabaseMetaData dbmd = con.getMetaData();
//            ResultSet resultSet = dbmd.getTables(null, null, null, new String[] {"TABLE"});
//            ResultSet resultSet = dbmd.getTables(null, "PUBLIC", null, new String[] {"TABLE"});
//            
//            while (resultSet.next()) {
//                String name = resultSet.getString("TABLE_NAME");
//                String schema = resultSet.getString("TABLE_SCHEM");
//                System.out.println(name + " on schema " + schema);
//            }
            a = tableExists(con,"student");
            if (a == false) {
              System.out.println("Table doesn't exist");
            } else {
              ddl = "drop table student;";
              st.execute(ddl); //boolean
              System.out.println ("Dropped Successfully");
            }
            break;
          case 2:
            a = tableExists(con,"student");
            if (a == true) {
              System.out.println("Table already exist");
            } else {
              ddl = "create table student("
                  + "id int primary key auto_increment, "
                  + "name varchar(20), "
                  + "percentage float(5,2)"
                  + ")";
              st.execute(ddl);
              System.out.println ("Created Successfully");
            }
            break;
          case 3:
            System.out.println("****Insert****");
//          by default commit transaction is true 
//          String dml;
//          dml = "insert into student values(88, 'niranjan', 85.8);";
//          con.setAutoCommit(false);
//          dml = "insert into student values(118, 'sayeed', 88);";
//          st.executeUpdate(dml);
//          con.commit();
//          int noOfrowsaffected = st.executeUpdate(dml);
//          System.out.println("no of rows affected:" +noOfrowsaffected );
          
            String drl = "select * from Student";
            ResultSet rs = st.executeQuery(drl);
            
            while(true) {
              System.out.println("To insert enter 1 else 0: ");
              userInput = sc.nextInt();
              if(userInput == 1) {
                
              } else {
//              System.exit(0);
                break;
              }
              System.out.println("Enter ID: ");
              int id = sc.nextInt();
              ps1.setInt(1, id);
              System.out.println("Enter Name: ");
              String name = sc.next();
              ps1.setString(2, name);
              System.out.println("Enter Percentage: ");
              double percentage = sc.nextDouble();
              ps1.setDouble(3, percentage);
              
//            drl = "select * from Student";
              rs = st.executeQuery(drl);
              boolean b = true;
              while(rs.next()) {
                if(rs.getInt(1) == id) {
                  System.out.println("Entered ID Already exist.");
                  b = false;
                  break;
                } 
              } 
              if(b == true) {
                int i = ps1.executeUpdate();
                System.out.println("Inserted");
              }
            }
            break;
          case 4:
            System.out.println("****Update****");

            while(true) {
              System.out.println("To show enter 1 else 0: ");
              userInput = sc.nextInt();
              if(userInput == 1) {
                
              } else {
//              System.exit(0);
                break;
              }
              System.out.println("Enter ID: ");             
              int id = sc.nextInt();
              ps2.setInt(2, id);

              System.out.println("Enter Percentage: ");             
              double percentage = sc.nextDouble();
              ps2.setDouble(1, percentage);
              
              drl = "select * from Student";
              rs = st.executeQuery(drl);
              boolean b = false;
              while(rs.next()) {
                if(rs.getInt(1) == id) {
                  int i = ps2.executeUpdate();
                  b = true;
                  System.out.println("Updated");
                  break;
                } 
              } 
              if(b == false) {
                System.out.println("Entered ID not exist to update.");
              }
            }
            break;
          case 5:
            System.out.println("****Delete****");

            while(true) {
              System.out.println("To delete enter 1 else 0: ");
              userInput = sc.nextInt();
              if(userInput == 1) {
                
              } else {
//              System.exit(0);
                break;
              }
              System.out.println("Enter ID: ");             
              int id = sc.nextInt();
              ps3.setInt(1, id);
              
              drl = "select * from Student";
              rs = st.executeQuery(drl);
              boolean b = false;
              while(rs.next()) {
                if(rs.getInt(1) == id) {
                  int i = ps3.executeUpdate();
                  b = true;
                  System.out.println("Deleted");
                  break;
                } 
              } 
              if(b == false) {
                System.out.println("Entered ID not exist to delete.");
              }
            }
            break;
          case 6:
            System.out.println("****Select****");

            while(true) {
              System.out.println("To show enter 1 else 0: ");
              userInput = sc.nextInt();
              if(userInput == 1) {
                
              } else {
//              System.exit(0);
                break;
              }
              System.out.println("Enter ID: ");             
              int id = sc.nextInt();
              ps4.setInt(1, id);
          
              rs=ps4.executeQuery();
              boolean b = false;
              while(rs.next()) {
                if(rs.getInt(1) == id) {
                  System.out.println("|ID: " + rs.getInt(1) + " |NAME: " + rs.getString(2) + " |PERCENTAGE: " + rs.getDouble(3)+ "|");
                  b = true;
                  break;
                } 
              } 
              if(b == false) {
                System.out.println("Entered ID not exist to show.");
              }
            }
            break;
          default:
            System.out.println ("\n No SQL query executed");
            drl = "select * from Student";
            rs =st.executeQuery(drl);
            System.out.println("----------------Table contains-----------------------");
            while(rs.next()) { 
              System.out.println("|ID: " + rs.getInt(1) + " |NAME: " + rs.getString(2) + " |PERCENTAGE: " + rs.getDouble(3)+ "|");
            }
              
            System.out.println ("\n*****ResultSetMetaData*****");
            ResultSetMetaData rsmd=rs.getMetaData ();  
            System.out.println ("Table Name: " + rsmd.getTableName(1));
            System.out.println ("Num of columns: " + rsmd.getColumnCount());
            System.out.println ("Column 2 Lable: " + rsmd.getColumnLabel(2));
            System.out.println ("Column 2 Name: " + rsmd.getColumnName(2));
            System.out.println ("Column 2 Type: " + rsmd.getColumnType(2));
            System.out.println ("Column 2 Type Name: " + rsmd.getColumnTypeName(2));
            
            System.out.println ("\n*****DatabaseMetaData*****");
            dbmd=con.getMetaData (); 
            System.out.println ("Driver Name: " + dbmd.getDriverName());
            System.out.println ("Driver Version: " + dbmd.getDriverVersion());
            System.out.println ("User Name: " + dbmd.getUserName());
            System.out.println ("Database Product Name: " + dbmd.getDatabaseProductName());
            System.out.println ("Database Product Version: " + dbmd.getDatabaseProductVersion());
//          System.exit(0);
            break;
        }
        System.out.println ("\nSQL query executed successfully...");
        if(userInput>5)
          flag = false;
      }
     }
     catch (Exception e) {
       System.err.println ("Cannot connect to database server");
       e.printStackTrace();
     }      
     finally {
       if (con != null) {
         try {
           System.out.println ("\n\t-------5.Close the connection-------");
           con.close ();            
           System.out.println ("\nDatabase connection terminated...");
         }
         catch (Exception e) {
           System.out.println ("Error in connection termination!");
         }
       }
     }
  }

  private static boolean tableExists(Connection con, String tableName) throws SQLException {
    DatabaseMetaData dbmd = con.getMetaData();
    ResultSet rs = dbmd.getTables(null, null, tableName, new String[] {"TABLE"});

    return rs.next();
  }
}

