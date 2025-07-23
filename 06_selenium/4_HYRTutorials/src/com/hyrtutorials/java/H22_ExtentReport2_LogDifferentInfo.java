package com.hyrtutorials.java;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class H22_ExtentReport2_LogDifferentInfo {
  public static void main(String[] args) throws IOException {

    ExtentReports extentReports = new ExtentReports();

    File extentReportFile = new File(System.getProperty("user.dir") + "\\ExtentReports");
    ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter(extentReportFile+"\\AllTests.html");

    extentReports.attachReporter(sparkReporter_all);//attach the generated report

    //Logging
    //Text based Test
    extentReports
    .createTest("Text based Test")
    .log(Status.INFO, "info1")
    .log(Status.PASS, "<b>pass1</b>")
    .log(Status.INFO, "info2")
    .log(Status.WARNING, "<i>warning1</i>")
    .log(Status.SKIP, "<b><i>skip1</i></b>");

    //XML data-https://json.org/example.html
    String xmlData = "<menu id=\"file\" value=\"File\">\r\n"
        + "  <popup>\r\n"
        + "    <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\r\n"
        + "    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\r\n"
        + "    <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\r\n"
        + "  </popup>\r\n"
        + "</menu>";

    extentReports
    .createTest("XML based Test")
    .log(Status.INFO, MarkupHelper.createCodeBlock(xmlData, CodeLanguage.XML));

    //JSON data-https://json.org/example.html
    String jsonData = "{\"menu\": {\r\n"
        + "  \"id\": \"file\",\r\n"
        + "  \"value\": \"File\",\r\n"
        + "  \"popup\": {\r\n"
        + "    \"menuitem\": [\r\n"
        + "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n"
        + "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n"
        + "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n"
        + "    ]\r\n"
        + "  }\r\n"
        + "}}";

    extentReports
    .createTest("JSON based Test")
    .log(Status.INFO, MarkupHelper.createCodeBlock(jsonData, CodeLanguage.JSON));

    //Collection Data
    List<String> listData = new ArrayList<>();
    listData.add("Ramesh");
    listData.add("Ganesh");

    extentReports
    .createTest("List based Test")
    .info(MarkupHelper.createOrderedList(listData))
    .info(MarkupHelper.createUnorderedList(listData));

    Map<Integer, String> mapData = new HashMap<>();
    mapData.put(101, "Ravi");
    mapData.put(102, "Anu");

    extentReports
    .createTest("Map based Test")
    .info(MarkupHelper.createOrderedList(mapData))
    .info(MarkupHelper.createUnorderedList(mapData));

    Set<Integer> setData = mapData.keySet();

    extentReports
    .createTest("Set based Test")
    .info(MarkupHelper.createOrderedList(setData))
    .info(MarkupHelper.createUnorderedList(setData));

    //Highlight any message
    extentReports
    .createTest("Highlight Text based Test")
    .info("Non-Highlighted Text")
    .info(MarkupHelper.createLabel("Highlighted Text", ExtentColor.RED));

    //Exception
    try {
      int i = 5/0;
    } catch(Exception e) {
      extentReports
      .createTest("Exception Test1")
      .fail(e);
    }

    Throwable t = new RuntimeException("This is custom exception");
    extentReports
    .createTest("Exception Test2")
    .fail(t);

    extentReports.flush(); // creates the report
    Desktop.getDesktop().browse(new File(System.getProperty("user.dir") + "\\ExtentReports\\AllTests.html").toURI()); //opens automatically
  }
}
