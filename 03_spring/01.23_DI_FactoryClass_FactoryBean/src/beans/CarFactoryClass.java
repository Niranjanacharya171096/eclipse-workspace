package beans;

public class CarFactoryClass {
  public String carName;

//  public static String getCarName() {
//    return carName;
//  }

  public void setCarName(String carName) {
    this.carName = carName;
  }
  
//  non-static/instance facory
  public CarInterface getInstance() throws Exception {
    //by default sping make carfactoryclass singleton
    CarInterface c = (CarInterface) Class.forName(carName).newInstance();
    return c;
  }
}
