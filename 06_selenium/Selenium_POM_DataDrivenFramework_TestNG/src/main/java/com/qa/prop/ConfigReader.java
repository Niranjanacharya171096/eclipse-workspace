package com.qa.prop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
  private Properties prop;

  public Properties init_prop() throws IOException {
    prop = new Properties();
    try {
      FileInputStream fip = new FileInputStream("./src/test/resources/configProp/config.properties");
      prop.load(fip);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    return prop;
  }
}