import java.io.IOException;
import java.net.SocketException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P22_Boostrap_DropDown2 {
  public static void main(String[] args) throws IOException, InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); //default is 0s
    
    String url = "https://www.jquery-az.com/boots/demo.php?ex=63.0_2";
    driver.get(url);
    Thread.sleep(2000);    
    
    WebElement dropDown = driver.findElement(By.xpath("//button[contains(@class,'multiselect')]"));
    dropDown.click();
    System.out.println("Button clicked");
//    List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,multiselect-container)]/li/a/label"));
    
    String path="//ul[contains(@class,multiselect-container)]/li[not(@class='multiselect-item multiselect-group')]/a/label";
    List<WebElement> options = driver.findElements(By.xpath(path));
    System.out.println(options.size());
    
    for (WebElement option : options) {
      String optionText = option.getText();
      System.out.println(optionText);
      if (optionText.equals("Python")) {
        option.click();
      }
      if (optionText.equals("MySQL")) {
        option.click();
      }
      if(option.findElement(By.tagName("input")).isSelected()) {
        
        System.out.println("Selected :: "+optionText);
      }
    }
    Thread.sleep(3000);
    
    if(Boolean.valueOf(dropDown.getAttribute("aria-expanded")))
        dropDown.click();
    
    Thread.sleep(5000);
    driver.close();
  }
}
