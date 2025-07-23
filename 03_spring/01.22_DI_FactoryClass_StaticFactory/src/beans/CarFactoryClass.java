package beans;

public class CarFactoryClass {
  public static String carName;

//  public static String getCarName() {
//    return carName;
//  }

  public static void setCarName(String carName) {
    CarFactoryClass.carName = carName;
  }
  
//  static facory
  public static CarInterface getInstance() throws Exception {
    //by default sping make carfactoryclass singleton
    CarInterface c = (CarInterface) Class.forName(carName).newInstance();
    return c;
  }
}
