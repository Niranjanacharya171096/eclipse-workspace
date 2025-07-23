import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P27_JSExecutor_TextBox {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    String url = "https://www.hyrtutorials.com/p/basic-controls.html";
    driver.get(url);
   
    JavascriptExecutor js = (JavascriptExecutor) driver;
    String email = "document.getElementById('email').value='niranjan@gmail.com'";
    js.executeScript(email);
    
    WebElement element = driver.findElement(By.id("pass"));
    js.executeScript("arguments[0].value='123456'",element);

    String text = (String) js.executeScript("return document.getElementById('email').value");
    System.out.println(text);
    Thread.sleep(5000);
    driver.quit(); 
  }
}
