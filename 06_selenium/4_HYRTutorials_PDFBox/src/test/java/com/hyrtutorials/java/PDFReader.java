package com.hyrtutorials.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PDFReader {
  @Test
  public void ReadPDFFile() throws IOException, InterruptedException{
//open pdf from local 
    //    File file = new File("C:\\Users\\NIRANJAN\\Desktop\\CV\\NIRANJAN CV.pdf");    
    //    FileInputStream fis = new FileInputStream(file);
    //    PDDocument pdfDoc = PDDocument.load(fis);
    
//Read pdf from website
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    String url = "https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/";
    driver.get(url);
    driver.findElement(By.xpath("//td[contains(text(),'150')][contains(text(),'kB')]//following-sibling::td[4]/a")).click(); 
//ad handler
    WebElement element1 = driver.findElement(By.xpath("/html/ins/div/iframe[contains(@name,'aswift')]")); 
    driver.switchTo().frame(element1);

    WebElement element2 = driver.findElement(By.xpath("//iframe[@id='ad_iframe']")); 
    driver.switchTo().frame(element2);
    driver.findElement(By.xpath("//div[@id='dismiss-button']")).click(); 

    Thread.sleep(10000);
//Create new PDF
    //    PDDocument pdfDoc = new PDDocument(); 
//Open
    String urlString = driver.getCurrentUrl();
    URL pdfUrl = new URL(urlString); //or directly pass : https://file-examples.com/storage/fe59d4838564c7620a076e3/2017/10/file-sample_150kB.pdf
    PDDocument pdfDoc = PDDocument.load(pdfUrl.openStream());
    System.out.println("Total Pages ::"+pdfDoc.getPages().getCount());
//Read    
    PDFTextStripper pdfRead = new PDFTextStripper();    
    //if to read entire pdf no need to write the below code
    pdfRead.setStartPage(2);
    pdfRead.setEndPage(3);

    String pdfText = pdfRead.getText(pdfDoc);
    System.out.println(pdfText);
    
//check if pdf startswith or contains    
    //    Assert.assertTrue(pdfText.startsWith("NIRANJAN"));
    //    Assert.assertTrue(pdfText.contains("McAfee"));

    pdfDoc.close();
    //    fis.close();
    driver.quit();
  }
}
