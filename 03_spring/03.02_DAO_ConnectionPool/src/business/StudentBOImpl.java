package business;

import dao.StudentDAO;
import model.Student;

public class StudentBOImpl implements StudentBO{

  private StudentDAO dao;
  
  public void setDao(StudentDAO dao) {
    this.dao = dao;
  }
  
  @Override
  public int createStudent(Student std) throws Exception {
    System.out.println("createSudent");
    return dao.save(std);
  }

  @Override
  public boolean updateStudent(Student std) throws Exception {
    return false;
  }

  @Override
  public boolean deleteStudent(Student std) throws Exception {
    return false;
  }

}
