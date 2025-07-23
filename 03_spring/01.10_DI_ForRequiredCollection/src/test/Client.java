package test;

import org.springframework.context.ApplicationContext;   
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

//using Advanced J2EE Container
public class Client {
  public static void main (String [] args) {
    //Core container not supports
    ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");

    Test t = (Test) ap.getBean("t");
    t.printData();
  }
}