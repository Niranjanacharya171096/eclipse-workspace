package chaniningGoRest;

import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class DeleteUser {
  @Test
  void testDeleteUser(ITestContext context) {
//  int id = (int) context.getAttribute("user_id"); //test level
  int id = (int) context.getSuite().getAttribute("user_id"); //suite level    
    String bearerToken = "Bearer d8a1562e3eae56feb9141a1142b7341a34667de83315c0de1573a5511b40d39d";

    given()
      .headers("Authorization", bearerToken)
      .pathParam("id", id)
    .when()
      .delete("https://gorest.co.in/public/v2/users/{id}")
    .then()
      .statusCode(204)
      .log().body()
    ;
  }
}
