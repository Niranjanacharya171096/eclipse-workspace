import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P10_DropDown {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
    Thread.sleep(3000);
        
    //1. identify drop down using locator
    WebElement dropdown=driver.findElement(By.id("ide")); 
    
    //2. create select class obj 
    //3. pass the dropdown ref to Select class cons.
    Select s= new Select(dropdown);
    
    /*4. use any one to select an option from drop down 
     * selectByIndex(); 
     * selectByValue();
     * selectByVisibleText();
    */ 
    s.selectByIndex(0);
    Thread.sleep(3000);
    
    s.selectByValue("vs");
    Thread.sleep(3000);

    s.selectByVisibleText("NetBeans");
    Thread.sleep(3000);

    List<WebElement> courseAvailable= s.getOptions();
    System.out.println("courses Available::");
    for(WebElement we : courseAvailable )
      System.out.println(we.getText());
    
    List<WebElement> courseSelected= s.getAllSelectedOptions();
    System.out.println("courses Selected::");
    for(WebElement we : courseSelected )
      System.out.println(we.getText());
    
    System.out.println("First Course selected:: "+s.getFirstSelectedOption().getText());
    
    s.deselectByIndex(0);
    Thread.sleep(3000);
    
    s.deselectByValue("vs");
    Thread.sleep(3000);

    s.deselectByVisibleText("NetBeans");
    Thread.sleep(3000);
    
    driver.close();
  }
}
