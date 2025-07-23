package beans;

public class Bike {
  private String bikeName;
  private Engine engine;
  
  public Bike(Engine engine) {
    System.out.println("Bike Parameterized constructor");
    this.engine = engine;
  }
  
// Parameterized Constructor Or Default Constructor and Setter
//  autodetect by default uses Default Constructor and Setter
//  if there is Parameterized Constructor and Setter then it will go for Parameterized
  public Bike() {
    System.out.println("Bike Default constructor");    
  }

//  public Engine getEngine() {
//    return engine;
//  }

  public void setEngine(Engine engine) {
    System.out.println("Setter Engine");    
    this.engine = engine;
  }

//  public String getBikeName() {
//    return busName;
//  }

  public void setBikeName(String bikeName) {
    this.bikeName = bikeName;
  }

  public void printCarData() {
    System.out.print("Bike Name: " + bikeName);
    System.out.println(" Bike ModelYear: " + engine.getModelYear());
  }
}
