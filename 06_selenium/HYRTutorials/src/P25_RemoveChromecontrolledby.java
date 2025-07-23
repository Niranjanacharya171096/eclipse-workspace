import java.time.Duration;  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class P25_RemoveChromecontrolledby {
  public static void main(String[] args) throws InterruptedException {
    ChromeOptions options = new ChromeOptions(); 
//    options.setExperimentalOption("excludeSwitches", new String[] {"enable-autoation"});
//    options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-autoation"));
//    options.setExperimentalOption("excludeSwitches", Collections.singleton("enable-autoation"));
//    options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-autoation"));

    List<String> eSwitches = new ArrayList<String>();
    eSwitches.add("enable-automation");
    options.setExperimentalOption("excludeSwitches", eSwitches);

    WebDriver driver = new ChromeDriver(options);
    driver.manage().window().maximize();

    String url = "https://www.google.com";
    driver.get(url);
   
    Thread.sleep(5000);
    driver.quit(); 
  }
}
