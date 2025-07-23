package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {
  public static void main(String [] args) {
    //find and load xml into container 
    //Create test class object at the time of loading xml/load on startup
    //-->Eager Container 
    ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
    
//    Object obj = ap.getBean("t"); 
    Test t = (Test) ap.getBean("t"); //obj;
    t.printData();
  }
}
