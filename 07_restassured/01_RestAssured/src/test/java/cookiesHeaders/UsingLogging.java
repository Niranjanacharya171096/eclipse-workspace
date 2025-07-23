package cookiesHeaders;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class UsingLogging {
  @Test
  void getCookiesHeaders() {
    given()
    .when()
      .get("https://www.google.com/")
    .then()
      .log().body()
      .log().cookies()
      .log().headers();
  }
}
