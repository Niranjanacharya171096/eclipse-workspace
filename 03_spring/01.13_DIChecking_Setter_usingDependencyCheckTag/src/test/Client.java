package test;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Car;

//using Advanced J2EE Container
public class Client {
  public static void main (String [] args) {
    ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");

    Car t = (Car) ap.getBean("c");
    t.printCarData();
  }
}
