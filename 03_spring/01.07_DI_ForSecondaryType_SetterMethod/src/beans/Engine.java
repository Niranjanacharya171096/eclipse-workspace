package beans;

//Secondary Type
public class Engine {
  private String modelYear;

  Engine(){
    System.out.println("Engine");
  }

  public String getModelYear() {
    return modelYear;
  }

  public void setModelYear(String modelYear) {
    this.modelYear = modelYear;
  }
}
