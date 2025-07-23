package beans;

import org.springframework.beans.factory.annotation.Autowired;     
import org.springframework.stereotype.Component;

import Enginebean.Engine;

@Component
public class Car {
//  private String carName;
  @Autowired
  private Engine engine;

//  public String getCarName() {
//    return carName;
//  }

//  public void setCarName(String carName) {
//    this.carName = carName;
//  }

  public void printCarData() {
//  System.out.println("Car Name: " + carName);
    System.out.println("Car ModelYear: " + engine.getModelYear());
  }
}
