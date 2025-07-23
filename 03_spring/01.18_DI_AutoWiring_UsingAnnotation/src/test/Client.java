package test;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;   
import org.springframework.context.ApplicationContext;      
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Bus;
import beans.Car;

//using Advanced J2EE Container
public class Client {
  public static void main (String [] args) {
    ApplicationContext ap1 = new ClassPathXmlApplicationContext("resources/spring.xml");
 
    Car c1 = (Car) ap1.getBean("c");
    c1.printCarData();
    
    Bus b1 = (Bus) ap1.getBean("b");
    b1.printBusData();
  }
}
