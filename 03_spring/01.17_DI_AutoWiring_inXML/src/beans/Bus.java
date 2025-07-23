package beans;

public class Bus {
  private String busName;
  private Engine engine;

  public Bus() {
    System.out.println("Bus Default constructor");    
  }
  
  public Bus(Engine engine) {
    System.out.println("Bus Parameterised constructor");
    this.engine = engine;
  }

  public void setBusName(String busName) {
    this.busName = busName;
  }

  public void printCarData() {
    System.out.print("Bus Name: " + busName);
    System.out.println(" Bus ModelYear: " + engine.getModelYear());
  }
}
