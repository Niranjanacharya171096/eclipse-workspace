import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_BasicControls {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.navigate().to("https://www.hyrtutorials.com/p/basic-controls.html");
    Thread.sleep(3000);
    
    driver.findElement(By.id("firstName")).sendKeys("Niranjan");
    driver.findElement(By.id("femalerb")).click();
    driver.findElement(By.id("englishchbx")).click();
    driver.findElement(By.id("registerbtn")).click();
    Thread.sleep(3000);    
    driver.findElement(By.linkText("Click here to navigate to the home page")).click();
    
    Thread.sleep(3000);    
    driver.close();
  }
}
