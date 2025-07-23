package beans;

public class Car {
  private static String carname;

  public static void setCarname(String carname) {
    Car.carname = carname;
  }
  
  public static String getCarname() {
    return carname;
  }

  public static void printCarData() {
    System.out.println("CarName: " + carname);
  }
}
