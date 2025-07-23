package cookiesHeaders;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetCookies {
  static String aecVal;
  
  @Test(priority = 1)
  void getAllCookiesDetails() {
    Response res = 
        given()
        .when()
          .get("https://www.google.com/");

//get Single Cookie
    String aec = res.getCookie("AEC");
    aecVal = aec;
    System.out.println("AEC :: " + aecVal);

//get All Cookies
    Map<String, String> cookiesDetails = res.getCookies();

    for (String key : cookiesDetails.keySet()) {
      String cookieValue = res.getCookie(key);
      System.out.println(key + " :: " + cookieValue);
    }
  }
  
  @Test(priority = 2) 
  void testCookies() {
    System.out.println(aecVal);
    given()
    .when()
//      .get("https://www.google.com/")
    .then() // AEC values changes everytime url is called hence this fails so commented get()
      .cookie("AEC", aecVal) //stored aecVal from first test
      .log().all();
  }
}
