package beans;

public class Test {
  private String name;
  private int age;
  private String email;
  
//cant pass more than 1 values in Setter()  
//  public String getName() {
//    return name;
//  }

  public void setName(String name) {
    this.name = name;
  }
  
//  public int getAge() {
//    return age;
//  }

  public void setAge(int age) {
    this.age = age;
  }
  
//  public String getEmail() {
//    return email;
//  }
  
  public void setEmail(String email) {
    this.email = email;
  }

  public void printData() {
    System.out.println("Name: " + name + " Age: " + age + " Email: " + email);
  }
}
