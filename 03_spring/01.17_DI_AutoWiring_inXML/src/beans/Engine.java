package beans;

//Secondary Type
public class Engine {
  private String modelYear;

//  public Engine(String modelYear){
//    this.modelYear = modelYear;
//  }
  
  public void setModelYear(String modelYear) {
    this.modelYear = modelYear;
//    System.out.println("ModelYear: " + modelYear);
  }
  
  public String getModelYear() {
    return modelYear;
  }
}
