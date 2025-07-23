import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class P24_DownloadFiles {
  public static void main(String[] args) throws InterruptedException {
    String fileType = "PDF";

    ChromeOptions options = new ChromeOptions(); //for Edge also Options are same but not for FireFox

    HashMap<String, Object> prefs = new HashMap<String, Object>();
    prefs.put("plugins.always_open_pdf_externally", true);
    prefs.put("download.default_directory", "E:\\Software Files\\eclipse-workspace\\06_selenium\\2_HYRTutorials\\DownloadedFiles");

    options.setExperimentalOption("prefs", prefs);

    WebDriver driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    String url = "https://file-examples.com/";
    driver.get(url);

    driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click(); 

    //ad handler
    WebElement element1 = driver.findElement(By.xpath("/html/ins/div/iframe[contains(@name,'aswift')]")); 
    driver.switchTo().frame(element1);

    WebElement element2 = driver.findElement(By.xpath("//iframe[@id='ad_iframe']")); 
    driver.switchTo().frame(element2);
    driver.findElement(By.xpath("//div[@id='dismiss-button']")).click(); 

    //    List<WebElement> element3 = driver.findElements(By.xpath("//div[@id='dismiss-button']")); 
    //    System.out.println(element3.size());
    //    if(element3.size() > 0) {
    //      System.out.println("X");
    //      ((WebElement) element3).click();
    //    } else {
    //      System.out.println("close");
    //      driver.findElement(By.xpath("//span[text()='Close']")).click(); 
    //    }

    System.out.println("ad closed");

    driver.switchTo().defaultContent();
    driver.findElement(By.xpath("//td[text()='"+fileType+"']/following-sibling::td[2]/a")).click(); 
    System.out.println("PDF");
    driver.findElement(By.xpath("//td[contains(text(),'500')][contains(text(),'kB')]//following-sibling::td[4]/a")).click(); 
    System.out.println("Downloaded");
    //    Thread.sleep(5000);
    //    driver.quit(); 
  }
}