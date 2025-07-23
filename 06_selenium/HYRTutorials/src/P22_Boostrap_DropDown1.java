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

public class P22_Boostrap_DropDown1 {
  public static void main(String[] args) throws IOException, InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); //default is 0s
    
    String url = "https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_1";
    driver.get(url);
    Thread.sleep(2000);    
    
    driver.findElement(By.id("btnDropdownDemo")).click();
    System.out.println("Button clicked");
    List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]/a"));
    System.out.println(options.size());
    
    for (WebElement option : options) {
      String optionText = option.getText();
      System.out.println(optionText);
      if (optionText.equals("HTML")) {
        option.click();
        System.out.println("clicked");
        break;
      }
    }
    Thread.sleep(5000);
    driver.close();
  }
}
