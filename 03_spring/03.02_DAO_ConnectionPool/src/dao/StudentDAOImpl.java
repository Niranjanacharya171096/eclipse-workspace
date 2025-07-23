package dao;

import java.sql.Connection;  
import java.util.List;

import javax.sql.DataSource;

import model.Student;

public class StudentDAOImpl implements StudentDAO {
  private DataSource ds;
  
  public void setDs(DataSource ds) {
    this.ds = ds;
  }
  
  @Override
  public int save(Student std) throws Exception {
    Connection con = ds.getConnection();
    System.out.println("save : "+std.getId());

    con.close();
    return 0;
  }

  @Override
  public boolean update(Student std) throws Exception {
    Connection con = ds.getConnection();
    con.close();
    return false;
  }

  @Override
  public boolean delete(Student std) throws Exception {
    Connection con = ds.getConnection();
    con.close();
    return false;
  }

  @Override
  public Student findById(int id) throws Exception {
    Connection con = ds.getConnection();
    con.close();
    return null;
  }

  @Override
  public Student findByName(String name) throws Exception {
    Connection con = ds.getConnection();
    con.close();
    return null;
  }

  @Override
  public Student findByEmail(String email) throws Exception {
    Connection con = ds.getConnection();
    con.close();
    return null;
  }

  @Override
  public Student findByAddress(String address) throws Exception {
    Connection con = ds.getConnection();
    con.close();
    return null;
  }

  @Override
  public List<Student> findAll() throws Exception {
    Connection con = ds.getConnection();
    con.close();
    return null;
  }
}
