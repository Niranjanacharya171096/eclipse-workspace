package pathAndQueryParameters;

import static io.restassured.RestAssured.*; 
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class PathAndQueryParameters {
  @Test
  void testPathQueryParameters() {
    //https://reqres.in/api/users?page=2&id=5
    given()
      .pathParam("myPath", "users") //path parameter 
      .queryParam("page", 2) //query parameters
      .queryParam("id", 5)
    .when()
      .get("https://reqres.in/api/{myPath}") //query parameters go along with the request
    .then()
      .statusCode(200)
      .log().all();
  }
}
