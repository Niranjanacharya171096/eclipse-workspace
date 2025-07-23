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
    
    Object obj = ap.getBean("t");
    //IoC creates only above 1 object by default
    Object obj2 = ap.getBean("t");
    Object obj3 = ap.getBean("t");

    System.out.println(obj == obj2);
    System.out.println(obj == obj3);
    
    Test t = (Test) obj;
    t.hello();
  }
}
