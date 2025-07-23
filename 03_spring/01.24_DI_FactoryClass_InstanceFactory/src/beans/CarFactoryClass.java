package beans;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryClass implements FactoryBean{
  private String carName;
  
//  public String getCarName() {
//    return carName;
//  }

  public void setCarName(String carName) {
    this.carName = carName;
  }

  @Override
  public Object getObject() throws Exception {
    CarInterface ci = (CarInterface) Class.forName(carName).newInstance();
    return ci;
  }

  @Override
  public Class getObjectType() {
    return CarInterface.class;
  }

  @Override
  public boolean isSingleton() {
    //make it true if we want to make Car class singleton
    return true;
  }

}
