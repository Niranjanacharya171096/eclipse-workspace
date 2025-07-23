import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P26_JSExecutor {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    String url = "https://www.google.com";
    driver.get(url);
   
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("alert('HELLO')");
    
    Thread.sleep(5000);
    driver.quit(); 
  }
}
