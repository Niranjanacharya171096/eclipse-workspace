package test;

import java.util.Scanner; 

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test1;
import beans.Test2;
import beans.Test3;

//using Advanced J2EE Container
public class Client {
  public static void main (String [] args) throws Exception {
    
    ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/spring.xml");
    Test1 t1 = (Test1) cap.getBean("t1");
    Test2 t2 = (Test2) cap.getBean("t2");
    Test3 t3 = (Test3) cap.getBean("t3");

    cap.close();
  }
}
