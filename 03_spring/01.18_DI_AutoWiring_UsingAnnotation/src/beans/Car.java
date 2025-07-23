package beans;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
  private String carName;
  @Autowired
  @Qualifier("engine1")
  private Engine engine;
//no need to have setters/constructor for Engine
  
  public String getCarName() {
    return carName;
  }

  public void setCarName(String carName) {
    this.carName = carName;
  }

  public void printCarData() {
    System.out.println("Car Name: " + carName);
    System.out.println("Car ModelYear: " + engine.getModelYear());
  }
}
