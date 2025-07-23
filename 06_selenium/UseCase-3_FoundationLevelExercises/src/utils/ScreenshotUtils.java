package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.CommoditiesPageLocators;

public class ScreenshotUtils {

	public static void scrollAndCapture(WebDriver driver, String filePath, String periodName) throws Exception {
		WebElement element = driver.findElement(CommoditiesPageLocators.srollTo);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);

		Thread.sleep(1000);

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./Screenshots/" + periodName + ".png"));
	}
}
