import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.parser.antlr.GraphqlParser.ArgumentsContext;

public class P28_JSExecutor_ClickOperation {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    String url = "https://www.hyrtutorials.com/p/basic-controls.html";
    driver.get(url);
   
    JavascriptExecutor js = (JavascriptExecutor) driver;
    String female = "document.getElementById('femalerb').click()";
    js.executeScript(female);
    
    List checkboxes= (List) js.executeScript("return document.getElementsByName('language')");
    for(Object obj : checkboxes) {
      js.executeScript("arguments[0].click()", obj);
    }
    js.executeScript("document.getElementById('registerbtn').click()");
    
    Thread.sleep(5000);
    
    WebElement link = driver.findElement(By.xpath("//a[text()='Click here to navigate to the home page']"));
    js.executeScript("arguments[0].click()", link);
    
    Thread.sleep(5000);
    driver.quit(); 
  }
}
