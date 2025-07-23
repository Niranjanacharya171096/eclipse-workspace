package test;


import org.springframework.context.ApplicationContext;    
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.ConnectionPool;
 
//using Advanced J2EE Container
public class Client {
  public static void main (String [] args) {
    //Core container not supports
    ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");

    ConnectionPool cp = (ConnectionPool) ap.getBean("cp");
    cp.createConnection();
  }
}
