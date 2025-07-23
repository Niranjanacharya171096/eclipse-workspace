import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class P19_FileHandler {
  public static void CaptureScreenshot(WebDriver driver, String fileName) throws IOException {

//    TakesScreenshot screenShot = (TakesScreenshot) driver;
    File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(file, new File("./Screenshot/"+fileName));
    
//    String str = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//    byte[] byt = Base64.getDecoder().decode(str);
//    FileOutputStream fos = new FileOutputStream(new File("./Screenshot/image2.png"));
//    fos.write(byt);
//    fos.close();
    
//    byte[] byt2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//    fos = new FileOutputStream(new File("./Screenshot/image3.png"));
//    fos.write(byt2);
//    fos.close();    
  }
}
