package com.qspider.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q15_WindowPopup_EX3 {
  public static void main(String[] args) throws IOException, InterruptedException, AWTException {

    WebDriver driver = new EdgeDriver();
    //    driver.get("http://localhost:8080/login.do");
    Thread.sleep(5000);
    //Press Control + P from keyboard using Robot class
    Robot r = new Robot();
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_P);
    r.keyRelease(KeyEvent.VK_P);
    r.keyRelease(KeyEvent.VK_CONTROL);
    Thread.sleep(5000);
    //Using Runtime class, to run the .exe file
    Runtime run = Runtime.getRuntime();
    run.exec("E:\\AutoIT scripts\\cancelOnPrintScript.exe");
    Thread.sleep(5000);
    //    driver.close();
  }
}