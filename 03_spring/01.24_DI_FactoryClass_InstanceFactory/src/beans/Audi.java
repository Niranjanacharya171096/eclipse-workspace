package beans;

public class Audi implements CarInterface {
  @Override
  public void drive() {
    System.out.println("Audi : safedrive 100kmph");
  }
}
