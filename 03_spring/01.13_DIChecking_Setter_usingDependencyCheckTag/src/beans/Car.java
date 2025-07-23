package beans;

public class Car {
  private String carName;
  private Engine engine;

  Car(){
    System.out.println("Car");
  }

//  public String getCarName() {
//    return carName;
//  }

  public void setCarName(String carName) {
    this.carName = carName;
  }

//  public Engine getEngine() {
//    return engine;
//  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public void printCarData() {
    System.out.println("CarName: " + carName);
    System.out.println("ModelYear: " + engine.getModelYear());
  }
}
