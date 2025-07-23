package test;

import org.springframework.context.ApplicationContext;     
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Bike;
import beans.Bus;
import beans.Car;

//using Advanced J2EE Container
public class Client {
  public static void main (String [] args) {
    ApplicationContext ap1 = new ClassPathXmlApplicationContext("resources/byType.xml");
    Car c1 = (Car) ap1.getBean("c");
    System.out.println("AutoWiring using byType for setter");
    c1.printCarData();
    
    ApplicationContext ap2 = new ClassPathXmlApplicationContext("resources/byName.xml");
    Car c2 = (Car) ap2.getBean("c");
    System.out.println("\nAutoWiring using byName for setter");
    c2.printCarData();

    ApplicationContext ap3 = new ClassPathXmlApplicationContext("resources/constructor.xml");
    Bus b1 = (Bus) ap3.getBean("b");
    System.out.println("\nAutoWiring using constructor for constructor");
    b1.printCarData();

    ApplicationContext ap4 = new ClassPathXmlApplicationContext("resources/autodetect.xml");
    Bike b2 = (Bike) ap4.getBean("b");
    System.out.println("\nAutoWiring using autodetect for constructor");
    b2.printCarData();
  }
}
