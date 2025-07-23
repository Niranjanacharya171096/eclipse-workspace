import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P29_JSExecutor_ScrollOperations {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    String url = "https://www.hyrtutorials.com/";
    driver.get(url);
   
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0,1000)");
    Thread.sleep(3000);
    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    Thread.sleep(3000);
    WebElement element = driver.findElement(By.id("BlogArchive1"));
    js.executeScript("window.scrollTo(arguments[0],arguments[1])",element.getLocation().x, element.getLocation().y);
    Thread.sleep(3000);    
    js.executeScript("window.scrollBy(0,200)");
    Thread.sleep(3000);    
    js.executeScript("arguments[0].scrollIntoView()", element);

    Thread.sleep(3000);
    driver.quit(); 
  }
}
