package beans;

import javax.annotation.Resource;
import javax.inject.Named;

@Named //=@Component
public class Car {
  @Resource
  private Engine engine;
  
  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public void printCarData() {
    System.out.println("ModelYear: " + engine.getModelYear());
  }
}
