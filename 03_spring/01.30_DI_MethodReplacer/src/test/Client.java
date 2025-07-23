package test;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.config.MethodInvokingFactoryBean;

import beans.Bank;

//using Advanced J2EE Container
public class Client {
  public static void main (String [] args) {
    ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");

    System.out.println("------Bank------");
    Bank b = (Bank) ap.getBean("b");
    System.out.println(b.getClass().getCanonicalName()); //proxy class created by JVM
    b.deposit();
    b.withdraw();
    b.Interest();
  }
}
