package beans;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier; 

public class Car {
  @Inject //=@Autowired (byName>byType)
  @Qualifier("e1")
  private Engine engine;

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public void printCarData() {
    System.out.println("ModelYear: " + engine.getModelYear());
  }
}
