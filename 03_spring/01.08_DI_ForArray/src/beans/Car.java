package beans;

public class Car {
  private String[] carNames;
  private Engine[] engines;

  Car(){
    System.out.println("Car");
  }

//  public String[] getCarNames() {
//    return carNames;
//  }
  
  public void setCarNames(String[] carNames) {
    this.carNames = carNames;
//    System.out.println(carNames);
  }

//  public Engine[] getEngines() {
//    return engines;
//  }

  public void setEngines(Engine[] engines) {
    this.engines = engines;
//    System.out.println(engines);
  }

  public void printCarData() {
    for(String car:carNames)
      System.out.println("CarName: " + car);
    
    for(Engine eng:engines)
      System.out.println("ModelYear: " + eng.getModelYear());
  }
}
