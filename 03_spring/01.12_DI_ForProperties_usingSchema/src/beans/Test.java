package beans;

import java.util.*;

public class Test {
  private Properties driver;
  
  public Properties getDriver() {
    return driver;
  }

  public void setDriver(Properties driver) {
    this.driver = driver;
  }

  public void printData() {
     System.out.println("Using Schema Based:....");
    Set keys = driver.keySet();
    for(Object key:keys)
      System.out.println(key + " - " + driver.getProperty(key.toString()));
  }
}
