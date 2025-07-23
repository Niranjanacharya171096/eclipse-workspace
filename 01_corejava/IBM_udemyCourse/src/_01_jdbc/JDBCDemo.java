package _01_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
         * import pkg
         * load and register
         * create connection
         * create statement
         * process the results
         * close
         */

        String url = "jdbc:postgresql://localhost:5432/StudentDB";
        String uname = "postgres";
        String password = "admin";
        String sql1 = "select * from student";

        // try {
        Class.forName("org.postgresql.Driver"); // optional
        Connection connection = DriverManager.getConnection(url, uname, password);

        // } catch (ClassNotFoundException e) {
        // e.printStackTrace();
        // } catch (SQLException e) {
        // e.printStackTrace();
        // }
        System.out.println("Connection established...");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql1);
        // System.out.println(resultSet.next()); //true if data is present next
        // String sname = resultSet.getString("sname"); //index/column name
        // System.out.println(sname);

        while (resultSet.next()) { // we can use for() to fetch all columns
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3));
        }
        // Insert
        String sql2 = "insert into student values(6, 'John', 67)";
        boolean status = statement.execute(sql2);
        System.out.println(status);

        resultSet = statement.executeQuery(sql1);
        while (resultSet.next()) { // we can use for() to fetch all columns
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3));
        }

        // Update
        String sql3 = "update student set sname='Max' where sid=6";
        status = statement.execute(sql3);
        System.out.println(status);

        resultSet = statement.executeQuery(sql1);
        while (resultSet.next()) { // we can use for() to fetch all columns
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3));
        }

        // Delete
        String sql4 = "delete from student where sid=6";
        status = statement.execute(sql4);
        System.out.println(status);

        resultSet = statement.executeQuery(sql1);
        while (resultSet.next()) { // we can use for() to fetch all columns
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3));
        }
        // Prepared statement
        int sid = 101;
        String sname = "Rajesh";
        int smarks = 32;
        // String sql5 = "insert into student values"+sid+",'"+sname+"',"+smarks+";
        // //complecated
        String sql5 = "insert into student values(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql5);
        preparedStatement.setInt(1, sid);
        preparedStatement.setString(2, sname);
        preparedStatement.setInt(3, smarks);

        preparedStatement.execute();
        
        resultSet = statement.executeQuery(sql1);
        while (resultSet.next()) { // we can use for() to fetch all columns
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3));
        }
        connection.close();
        System.out.println("Connection closed.");
    }
}
