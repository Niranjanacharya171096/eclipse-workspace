package com.hyrtutorials.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class H15_Calendar {
  public static void main(String[] args) throws Exception {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

    //in browser scroll down to avoid ElementClickInterceptedException
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("window.scrollTo(0,1000)");
    Thread.sleep(3000);

    driver.findElement(By.id("first_date_picker")).click();
    selectDate(driver, "29/07/2024", "dd/MM/yyyy", "first_date_picker");
    Thread.sleep(5000);

    driver.findElement(By.id("second_date_picker")).click();
    selectDate(driver, "August/5/2022", "MMM/dd/yyyy", "second_date_picker");
    Thread.sleep(5000);

    driver.findElement(By.id("third_date_picker")).click();
    selectDate(driver, "2024/15/Aug", "yyyy/dd/MMM", "third_date_picker");
    Thread.sleep(5000);

    driver.findElement(By.id("fourth_date_picker")).click();
    selectDate(driver, "05-Aug-2022", "dd-MMM-yyyy", "fourth_date_picker");
    Thread.sleep(5000);

    driver.findElement(By.id("fifth_date_picker")).click(); //only 10days enabled from current dates
    selectDate(driver, "14/Jun/24", "dd/MMM/yy", "fifth_date_picker");
    Thread.sleep(5000);

    driver.findElement(By.className("ui-datepicker-trigger")).click();
    selectDate(driver, "2022/Aug/09", "yyyy/MMM/dd", "ui-datepicker-trigger");
  }

  public static void selectDate(WebDriver driver, String targetDate, String dateFormat, String text) throws Exception {
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat targetDateFormat = new SimpleDateFormat(dateFormat);
    Date formattedTargetDate;

    try {
      targetDateFormat.setLenient(false);
      formattedTargetDate = targetDateFormat.parse(targetDate);
      calendar.setTime(formattedTargetDate);
      int targetDay = calendar.get(Calendar.DAY_OF_MONTH);
      int targetMonth = calendar.get(Calendar.MONTH);
      int targetYear = calendar.get(Calendar.YEAR);

      System.out.println("Date Text="+text);

      if(text.matches("third_date_picker|fourth_date_picker")) {
        System.out.println(text + " is Drop Down Month and Year\n");
        String userMonth = calendar.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.getDefault());
        String userYear = String.valueOf(targetYear);

        WebElement month=driver.findElement(By.className("ui-datepicker-month"));
        Select s1= new Select(month);
        s1.selectByVisibleText(userMonth);
        WebElement year=driver.findElement(By.className("ui-datepicker-year"));
        Select s2= new Select(year);
        s2.selectByVisibleText(userYear);
      } else {
        String actualDate = driver.findElement(By.className("ui-datepicker-title")).getText();
        calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));

        int actualMonth = calendar.get(Calendar.MONTH);
        int actualYear = calendar.get(Calendar.YEAR);

        while(targetMonth < actualMonth || targetYear < actualYear) {
          driver.findElement(By.className("ui-datepicker-prev")).click();
          actualDate = driver.findElement(By.className("ui-datepicker-title")).getText();
          calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));

          actualMonth = calendar.get(Calendar.MONTH);
          actualYear = calendar.get(Calendar.YEAR);
        }

        while(targetMonth > actualMonth || targetYear > actualYear) {
          driver.findElement(By.className("ui-datepicker-next")).click();
          actualDate = driver.findElement(By.className("ui-datepicker-title")).getText();
          calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));

          actualMonth = calendar.get(Calendar.MONTH);
          actualYear = calendar.get(Calendar.YEAR);
        }
      }
      driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetDay+"]")).click();
    } catch (ParseException e) {
      throw new Exception("Invalid date is provided, please check input date");
    }
  }
}