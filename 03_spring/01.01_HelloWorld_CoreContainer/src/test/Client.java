package test;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

//using Core Container
public class Client { //Driver Class (class which has main())
  public static void main (String [] args) {
    //find xml
    Resource r = new ClassPathResource ("resources/spring.xml");
    //load xml into container 
    //-->LazyContainer
    BeanFactory bf = new XmlBeanFactory(r);
    System.out.println("XML document is Well Formed and Valid");
    
    //Create test class object on demand
    Object obj = bf.getBean("t");
    //IoC creates only above 1 object by default
    Object obj2 = bf.getBean("t");
    Object obj3 = bf.getBean("t");

    System.out.println(obj == obj2);
    System.out.println(obj == obj3);
    
    Test t = (Test) obj;
    t.hello();
  }
}