package com.selenium.java;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

class A {
  void testA1() {
    System.out.println("A1");
  }

  void testX() {
    System.out.println("AX");
  }
}

class B extends A {
  @Override
  void testX() {
    System.out.println("BX");
  }

  void testB1() {
    System.out.println("B1");
  }
}

class C extends A {
  @Override
  void testX() {
    System.out.println("CX");
  }

  void testC1() {
    System.out.println("C1");
  }
}

public class P02_Chromelaunch {
  public static void main(String[] args) throws InterruptedException {
    // System.setProperty("webdriver.chromedriver.driver", "E:\\selenium jar\\chromedriver.exe");
    // instead of above add chromedriver zip to libraries

    ChromeDriver cdriver = new ChromeDriver();
    // cdriver.
    SearchContext sc = new ChromeDriver();
    // sc.
    WebDriver driver = cdriver;
    // driver.
    RemoteWebDriver rdriver = new ChromeDriver();
    // rdriver.
    TakesScreenshot ts = cdriver;
    // ts.
    JavascriptExecutor jse = cdriver;
    // jse.

    //    A a = new A();
    //    a.testA1(); //A1
    //    a.testX(); //AX
    //    //    a.testB1(); //B1
    //
    //    B b = new B();
    //    b.testA1(); //A1
    //    b.testX(); //BX
    //    b.testB1(); //B1
    //
    //    C c = new C();
    //    c.testA1(); //A1
    //    c.testX(); //CX
    //    c.testC1(); //C1
    //
    //    A a1 = new B(); //B b = new B(); A a1 = b;
    //    a1.testA1();
    //    a1.testX();
    //
    //    A a2 = new C(); //C b = new C(); A a1 = c;
    //    a2.testA1();
    //    a2.testX();
  }
}
