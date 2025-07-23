import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Base64;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class P19_TakeScreenShot {
  public static void main(String[] args) throws IOException, InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    
    String url = "https://www.google.com";
    driver.get(url);
    
    P19_FileHandler.CaptureScreenshot(driver, "google.png");
    
    url = "https://www.facebook.com";
    driver.get(url);

    P19_FileHandler.CaptureScreenshot(driver, "fb.png");

//    TakesScreenshot screenShot = (TakesScreenshot) driver;
//    File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//    FileHandler.copy(file, new File("./Screenshot/image1.png"));
    
//    String str = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//    byte[] byt = Base64.getDecoder().decode(str);
//    FileOutputStream fos = new FileOutputStream(new File("./Screenshot/image2.png"));
//    fos.write(byt);
//    fos.close();
    
//    byte[] byt2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//    fos = new FileOutputStream(new File("./Screenshot/image3.png"));
//    fos.write(byt2);
//    fos.close();

    Thread.sleep(5000);
    driver.close();
  }
}
