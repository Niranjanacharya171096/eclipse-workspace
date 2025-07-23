package beans;

//Secondary Type
public class Engine {
  private String modelYear;

  Engine(){
    System.out.println("Engine");
  }
  
  public void setModelYear(String modelYear) {
    this.modelYear = modelYear;
//    System.out.println("ModelYear: " + modelYear);
  }
  public String getModelYear() {
    return modelYear;
  }
}
