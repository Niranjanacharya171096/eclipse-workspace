package authentications;

import static io.restassured.RestAssured.*; 
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Authentications {
  @Test(priority = 1)
  void testBaicAuthentication() {
    given()
      .auth().basic("postman", "password")
    .when()
      .get("https://postman-echo.com/basic-auth")
    .then()
      .statusCode(200)
      .body("authenticated", equalTo(true))
      .log().all();
  }
  
  @Test(priority = 2)
  void testDigestAuthentication() {
    given()
      .auth().digest("postman", "password")
    .when()
      .get("https://postman-echo.com/basic-auth")
    .then()
      .statusCode(200)
      .body("authenticated", equalTo(true))
      .log().all();
  }

  @Test(priority = 3)
  void testPreemptiveAuthentication() {
    given()
      .auth().preemptive().basic("postman", "password")
    .when()
      .get("https://postman-echo.com/basic-auth")
    .then()
      .statusCode(200)
      .body("authenticated", equalTo(true))
      .log().all();
  }

  @Test(priority = 4)
  void testBearerTokenAuthentication() {
    String bearerToken = "Bearer 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";
    given()
      .headers("Authorization", bearerToken)
    .when()
      .get("https://api.github.com/user/repos")
    .then()
      .statusCode(200)
      .log().all();
  }

  @Test(priority = 5)
  void testOAuth1Authentication() {
    given() //API which uses OAuth1 will provide below details
      .auth().oauth("consumerKey", "consumerSecrate", "accessToken", "tokenSecrate")
    .when()
      .get("APIurl")
    .then()
      .statusCode(200)
      .log().all();
  }

  @Test(priority = 6)
  void testOAuth2Authentication() {
    given() //API which uses OAuth1 will provide below details
      .auth().oauth2("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")
    .when()
      .get("https://api.github.com/user/repos")
    .then()
      .statusCode(200)
      .log().all();
  }

  @Test(priority = 7)
  void testApiKeyAuthentication() {
    given() //api details shows how to pass the key whether via query param/headers
      .queryParam("appid","e37f1447025f3c8a9eee23f61c99cde2")
      .pathParam("mypath", "data/2.5/forecast/daily")
      .queryParam("q", "London")
      .queryParam("units","metric")
      .queryParam("cnt","7")      
    .when()
      .get("https://api.openweathermap.org/{mypath}")
    .then()
      .statusCode(200)
      .log().all();
  }
}
