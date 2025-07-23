package beans;

import javax.annotation.Resource; 

public class Car {
  @Resource //=@Autowired (byName)
  private Engine engine;

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public void printCarData() {
    System.out.println("ModelYear: " + engine.getModelYear());
  }
}
