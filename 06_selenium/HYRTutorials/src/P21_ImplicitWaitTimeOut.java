import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P21_ImplicitWaitTimeOut {
  public static void main(String[] args) throws IOException, InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().setSize(new Dimension(1000, 1000));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //default is 0s
    
    String url = "https://www.hyrtutorials.com/p/waits-demo.html";
    driver.get(url);
    
    driver.findElement(By.id("btn1")).click();
    System.out.println("Button 1 clicked");
    driver.findElement(By.id("txt1")).sendKeys("Niranjan");
    
    Thread.sleep(5000);
    driver.close();
  }
}
