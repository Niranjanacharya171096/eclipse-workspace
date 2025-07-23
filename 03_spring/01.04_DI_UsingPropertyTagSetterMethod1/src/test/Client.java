package test;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

//using Advanced J2EE Container
public class Client {
  public static void main (String [] args) {
    //find and load xml into container 
    //Create test class object at the time of loading xml/load on startup
    //-->Eager Container 
    ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
    
//    Object obj = ap.getBean("t"); 
    Test t = (Test) ap.getBean("t"); //obj;
    t.hello("Niranjan");
  }
}
