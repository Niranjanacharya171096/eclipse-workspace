package test;

import java.util.Calendar;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

//using Advanced J2EE Container
public class Client {
  public static void main (String [] args) {
   
    ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
    Test t1 = (Test) ap.getBean("t");
    Test t2 = (Test) ap.getBean("t");
    System.out.println(t1);    
    System.out.println(t1==t2); //true if it is singleton 
    //can't instantiate the type of Calendar since constructor is private so
    // do it as done for Test class
//    Calendar c = new Calendar();
    Calendar c1 = (Calendar) ap.getBean("c");
    Calendar c2 = (Calendar) ap.getBean("c");
//    Calendar.getInstance(); write this in factory-method xml
    System.out.println(c1.getCalendarType());
    System.out.println(c1==c2); //true if it is singleton 
  }
}
