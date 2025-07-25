package com.qa.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
  private Properties prop;

  /*
   * This method is used to load the properties from config.properties file
   * #@return - it returns Properties prop object
   */

  public Properties init_prop() throws IOException {
    prop = new Properties();
    try {
      FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
      prop.load(ip);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    return prop;
  }
}