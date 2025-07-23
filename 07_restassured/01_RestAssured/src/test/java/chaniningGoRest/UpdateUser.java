package chaniningGoRest;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class UpdateUser {
  @Test
  void testUpdateUser(ITestContext context) {
//  int id = (int) context.getAttribute("user_id"); //test level
  int id = (int) context.getSuite().getAttribute("user_id"); //suite level    
    Faker faker = new Faker();
    
    JSONObject jsonObj = new JSONObject();
    jsonObj.put("name", faker.name().fullName());
    jsonObj.put("gender", "FeMale");
    jsonObj.put("email", faker.internet().emailAddress());
    jsonObj.put("status", "active");   
    
    String bearerToken = "Bearer d8a1562e3eae56feb9141a1142b7341a34667de83315c0de1573a5511b40d39d";

    given()
      .headers("Authorization", bearerToken)
      .contentType("application/json")
      .pathParam("id", id)
      .body(jsonObj.toString())
    .when()
      .put("https://gorest.co.in/public/v2/users/{id}")
    .then()
      .statusCode(200)
      .log().body()
    ;
  }
}
