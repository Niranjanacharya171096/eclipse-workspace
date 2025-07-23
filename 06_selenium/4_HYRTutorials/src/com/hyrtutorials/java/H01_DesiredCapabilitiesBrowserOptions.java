package com.hyrtutorials.java;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class H01_DesiredCapabilitiesBrowserOptions {
  public static void main(String[] args) {
    ChromeOptions coptions = new ChromeOptions();
    coptions.addArguments("--incognito");
    //    coptions.addArguments("headless"); //Run chrome in headless mode (no GUI)
    coptions.addArguments("--start-maximized");

    //AdBlocker must be added to the Chrome before testing
    coptions.addExtensions(new File("C:\\Users\\NIRANJAN\\Downloads\\AdGuard-AdBlocker.crx"));

    //  DesiredCapabilities is Deprecated in JAVA;
    //    DesiredCapabilities dcap = new DesiredCapabilities();
    //    dcap.setCapability(ChromeOptions.CAPABILITY, dcap);
    //    dcap.setAcceptInsecureCerts(true);
    //    coptions.merge(dcap);

    WebDriver cdriver = new ChromeDriver(coptions);
    cdriver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download");
    System.out.println(cdriver);

    EdgeOptions eoptions = new EdgeOptions();
    eoptions.addArguments("--start-maximized");
    eoptions.addArguments("--inprivate");

    WebDriver edriver = new EdgeDriver(eoptions);
    edriver.get("https://gmail.com");
    System.out.println(edriver);

    //    FirefoxProfile profile = new FirefoxProfile();
    FirefoxOptions foptions = new FirefoxOptions();
    foptions.addArguments("--private"); // Run Firefox in headless mode
    foptions.addArguments("--start-maximized"); // Set window size

    WebDriver fdriver = new FirefoxDriver(foptions);
    fdriver.get("https://gmail.com");
    System.out.println(fdriver);
  }
}