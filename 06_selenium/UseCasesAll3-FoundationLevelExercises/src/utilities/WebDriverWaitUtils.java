package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitUtils {
  public static void waitForPageToLoad(WebDriver driver, int timeoutInSeconds) {
    new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds)).until(new ExpectedCondition<Boolean>() {
      @Override
      public Boolean apply(WebDriver driver) {
        return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
      }
    });
  }

  public static boolean waitForTitleContains(WebDriver driver, String partialTitle, int timeoutInSeconds) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    return wait.until(ExpectedConditions.titleContains(partialTitle));
  }

  public static WebElement waitForElementToBePresent(WebDriver driver, By locator, int timeoutInSeconds) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
  }

  public static void waitForFrameSwitch(WebDriver driver, By locator, int timeoutInSeconds) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
  }

  public static void waitForFrameSwitch(WebDriver driver, WebElement element, int timeoutInSeconds) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
  }

  public static void waitUntilEnabled(WebDriver driver, WebElement element, int timeoutInSeconds) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    wait.until(new ExpectedCondition<Boolean>() {
      @Override
      public Boolean apply(WebDriver driver) {
        return element.isEnabled();
      }
    });
  }
}
