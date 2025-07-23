package test;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.config.MethodInvokingFactoryBean;

import beans.Car;

//using Advanced J2EE Container
public class Client {
  public static void main (String [] args) {
    ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");

    Car c = (Car) ap.getBean("c");
    System.out.println(c.getClass().getCanonicalName()); //not proxy class
    c.printCarData();
  }
}
