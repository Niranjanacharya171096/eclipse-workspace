package beans;

public class Ferrari implements CarInterface {
  @Override
  public void drive() {
    System.out.println("Ferrari : safedrive 180kmph");
  }
}
