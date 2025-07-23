package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.IOC_Start_EventListeners;
 
//using Advanced J2EE Container
public class Client {
  public static void main (String [] args) {
    ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/spring.xml");
    //refresh() executed
    
    cap.start(); 
    cap.stop();
    cap.refresh();
    cap.close();
  }
}
