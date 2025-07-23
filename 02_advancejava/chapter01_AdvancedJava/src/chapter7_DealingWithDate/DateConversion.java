package chapter7_DealingWithDate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

class DateConversion {
  public static void main (String [] args) {
    try {     
      Class.forName ("com.mysql.cj.jdbc.Driver");
      System.out.println ("DRIVERS LOADED...");
      String url = "jdbc:mysql://localhost:3306/studentdb";
      Connection con = DriverManager.getConnection (url, "root", "root");
      System.out.println ("CONNECTION ESTABLISHED...");

      Scanner sc = new Scanner(System.in);

      System.out.println ("ENTER THE DATE DD-MM-YYYY"); 
      String doj = sc.next();//dis.readLine ();  
      SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
      java.util.Date utilDate = sdf.parse(doj);
      java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
      System.out.println(sqlDate);

      System.out.println ("ENTER THE TIME HH:MM:SS"); 
      String dot = sc.next();
      SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");
      java.util.Date utilTIme = sdf2.parse(dot);
      java.sql.Timestamp sqlTime = new java.sql.Timestamp(utilTIme.getTime());      
      System.out.println(sqlTime);
      
      PreparedStatement ps1 = con.prepareStatement ("insert into datetime values (?, ?, ?)");
      System.out.println("ENTER NO: ");
      int no = sc.nextInt();
      ps1.setInt(1, no);
      ps1.setDate(2, sqlDate);
      ps1.setTimestamp(3, sqlTime);
      ps1.executeUpdate();

      System.out.println ("INSERTED INTO TABLE...");
      con.close ();

//Get standard date and time
      java.util.Date javaDate = new java.util.Date();
      System.out.println("\nThe Java Date is:" + javaDate.toString());
      
//Get and display SQL DATE
      long javaTime = javaDate.getTime();
      java.sql.Date sDate = new java.sql.Date(javaTime);
      System.out.println("The SQL DATE is: " + sDate.toString());
//Get and display SQL TIME
      java.sql.Time sTime = new java.sql.Time(javaTime);
      System.out.println("The SQL TIME is: " + sTime.toString());
      
//Get and display SQL TIMESTAMP
      java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(javaTime);
      System.out.println("The SQL TIMESTAMP is: " + sqlTimestamp.toString());
      
//Different ways to convert string to Date
      String str_date = "24-Oct-2019";
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
      LocalDate local_date = LocalDate.parse(str_date, formatter);
      System.out.println(str_date+" = "+local_date);

      String sDate1 = "31/10/1998 12:30:55 PM";  
      Date date1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(sDate1);
      java.sql.Date sqdate = new java.sql.Date(date1.getTime());
      System.out.println(sDate1+" = "+date1+"\n"+sqdate);  
      
      String dob = "18-05-2001 24:05:58";
      SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
      java.util.Date udob = sdf1.parse(dob);
      java.sql.Date sqdob = new java.sql.Date(udob.getTime());
      System.out.println(dob+" = "+udob+"\n"+sqdob);  
    } catch (Exception e) {
      e.printStackTrace ();
    }
  }
}
