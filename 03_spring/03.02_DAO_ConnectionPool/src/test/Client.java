package test;

import org.springframework.context.ConfigurableApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.StudentBO;
import model.Student;

public class Client {
  public static void main(String[] args) throws Exception {
    ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/spring.xml");

    StudentBO stdbo = (StudentBO) cap.getBean("bo");
    int i = stdbo.createStudent(new Student(111, "niranjan", "niranjan@gmail.com", "UDP"));
    System.out.println(i);
    cap.close();
  }
}
