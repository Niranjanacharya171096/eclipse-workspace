import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P20_PageLoadTime {
  public static void main(String[] args) throws IOException, InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    
    String url = "https://www.hyrtutorials.com/p/frames-practice.html";
    driver.get(url);
    
    Thread.sleep(5000);
    driver.close();
  }
}
