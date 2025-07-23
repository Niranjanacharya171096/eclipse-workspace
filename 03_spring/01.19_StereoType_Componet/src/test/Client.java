package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

//using Advanced J2EE Container
public class Client {
  public static void main (String [] args) {
    ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
    
    Car c1 = (Car) ap.getBean(Car.class);
    c1.printCarData();
  }
}