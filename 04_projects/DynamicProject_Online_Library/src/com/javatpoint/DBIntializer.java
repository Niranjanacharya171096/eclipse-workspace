package com.javatpoint;

public interface DBIntializer {
String DRIVER="com.mysql.cj.jdbc.Driver";//"oracle.jdbc.driver.OracleDriver";
String CON_STRING="jdbc:mysql://localhost:3306/FeeManagementBootstrap";//"jdbc:oracle:thin:@localhost:1521:xe";
String USERNAME="root";//"system";
String PASSWORD="root";//"oracle";
}
//Class.forName("com.mysql.cj.jdbc.Driver");
//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/FeeManagementBootstrap", "root", "root");
