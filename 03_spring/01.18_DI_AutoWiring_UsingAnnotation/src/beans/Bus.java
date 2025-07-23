package beans;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.beans.factory.annotation.Qualifier;

public class Bus {
  private String busName;
  @Autowired
  @Qualifier("engine2")
  private Engine engine;

  public String getBusName() {
    return busName;
  }

  public void setBusName(String busName) {
    this.busName = busName;
  }

  public void printBusData() {
    System.out.println("Bus Name: " + busName);
    System.out.println("Bus ModelYear: " + engine.getModelYear());
  }
}
