package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.config.MethodInvokingFactoryBean;

import beans.Auto;
import beans.Bus;
import beans.CarInterface;

//using Advanced J2EE Container
public class Client {
  public static void main (String [] args) {
    ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");

    System.out.println("------Car------");
    CarInterface ci = (CarInterface) ap.getBean("c");
    System.out.println(ci.getClass().getCanonicalName()); //proxy class created by JVM
    System.out.println(ci.myCarEngine().getEngine());

    System.out.println("------Bus------");
    Bus b = (Bus) ap.getBean("b");
    System.out.println(b.getClass().getCanonicalName()); //proxy class created by JVM
    System.out.println(b.myBusEngine().getEngine());

    System.out.println("------Auto------");
    Auto a = (Auto) ap.getBean("a");
    System.out.println(a.getClass().getCanonicalName()); //proxy class created by JVM
    System.out.println(a.myAutoEngine().getEngine());

  }
}
