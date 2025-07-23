import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class P01_DesiredCapabilities {
  public static void main(String[] args) {

    DesiredCapabilities dcap = new DesiredCapabilities();
    dcap.setCapability(ChromeOptions.CAPABILITY, dcap);
//    dcap.setAcceptInsecureCerts(true); 
    
    ChromeOptions copt = new ChromeOptions();
    copt.addArguments("start-maximized");
//    copt.addArguments("incognito");
//    copt.addArguments("headless");
    copt.merge(dcap);
    
    WebDriver cdriver = new ChromeDriver(copt);
    cdriver.get("https://cacert.com");
  }
}