package test;

import org.springframework.context.ConfigurableApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDAO;
import model.Student;

public class Client {
  public static void main(String[] args) throws Exception {
    ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/spring.xml");

    StudentDAO dao = (StudentDAO) cap.getBean("dao");
    Student std = new Student();
    std.setId(111);
    std.setName("niranjan");
    std.setEmail("niranjan@gmail.com");
    std.setAddress("UDP");
    
    dao.save(std);
    System.out.println("SUCCESS");
    cap.close();
  }
}
