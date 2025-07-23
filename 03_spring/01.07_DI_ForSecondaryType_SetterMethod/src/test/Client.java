package test;

import org.springframework.context.ApplicationContext;   
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Car;

//using Advanced J2EE Container
public class Client {
  public static void main (String [] args) {
    //we can create either separate xml 
//    String files[] = new String[] {"resources/car.xml", "resources/engine.xml"};
//    ApplicationContext ap = new ClassPathXmlApplicationContext(files);
    
    //or 1 xml and keep property of both the classes.
    ApplicationContext ap = new ClassPathXmlApplicationContext("resources/car-engine.xml");

    Car t = (Car) ap.getBean("c");
    t.printCarData();
  }
}
