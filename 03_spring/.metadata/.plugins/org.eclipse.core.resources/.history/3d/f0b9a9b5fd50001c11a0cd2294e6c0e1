package test;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.CarInterface;

//using Advanced J2EE Container
public class Client {
  public static void main (String [] args) {
   
    ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
    CarInterface ci = (CarInterface) ap.getBean("cfc");
    ci.drive();
  }
}
