package beans;

public class Test {
  private String name;
  private int age;
  private String email;

  //can pass more than 1 values using Parameterized Constructor
  Test(String name, int age, String email){
    this.name = name;
    this.age = age;
    this.email = email;
  }

  public void printData() {
    System.out.println("Name: " + name + " Age: " + age + " Email: " + email);
  }
}
