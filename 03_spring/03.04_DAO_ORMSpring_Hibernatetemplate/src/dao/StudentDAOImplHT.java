package dao;

import java.sql.Connection;    
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import model.Student;

public class StudentDAOImplHT implements StudentDAO {
  @SuppressWarnings("deprecation")
  private HibernateTemplate ht;
  
  public void setHt(HibernateTemplate ht) {
    this.ht = ht;
  }  
  
  @Override
  public int save(Student std) throws Exception {
    int i = (Integer) ht.save(std);
    System.out.println("save : "+std.getId());
    return i;
  }

  @Override
  public boolean update(Student std) throws Exception {
    return false;
//    ht.update(std);
//    return true;
  }

  @Override
  public boolean delete(Student std) throws Exception {
    return false;
//    ht.delete(std);
//    return true;
  }

  @Override
  public Student findById(int id) throws Exception {
    return null;
//    Student std=(Student)ht.get(Student.class, id);
//    return std;
  }

  @Override
  public Student findByName(String name) throws Exception {
    return null;
//    Student std=(Student)ht.get(Student.class, id);
//    return std;
  }

  @Override
  public Student findByEmail(String email) throws Exception {
    return null;
//    Student std=(Student)ht.get(Student.class, id);
//    return std;
  }

  @Override
  public Student findByAddress(String address) throws Exception {
    return null;
//    Student std=(Student)ht.get(Student.class, id);
//    return std;
  }

  @Override
  public List<Student> findAllUsingHQL() throws Exception {
    return null;
//    List<Student> list = ht.find("from Student");
//    return list;
  }

  @Override
  public List<Student> findAllUsingCriteria() throws Exception {
    return null;
//    DetachedCriteria dc = DetachedCriteria.forClass(Student.class);
////    dc.setProjection(projection); 
////    dc.add(criterion);
//    List<Student> list = ht.findByCriteria(dc);
//    return list;
  }
}
