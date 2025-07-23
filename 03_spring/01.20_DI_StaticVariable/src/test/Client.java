package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.config.MethodInvokingFactoryBean;

import beans.Car;

//using Advanced J2EE Container
public class Client {
  public static void main (String [] args) {
//    MethodInvokingFactoryBean mi = new MethodInvokingFactoryBean();
//    mi.setArguments(arguments);
//    mi.setStaticMethod(staticMethod);
    
    ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");

    Car c1 = (Car) ap.getBean("c");
    c1.printCarData();
  }
}
