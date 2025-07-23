//src\test\java\api\endpoints\Routes.java
package api.endpoints;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//created for performing CRUD operations using Payloads

public class UserEndpoints {
  public static Response createUser(User payload){
    Response res = 
    given()
      .contentType("application/json")
      .accept(ContentType.JSON)
      .body(payload)
    .when()
      .post(Routes.postUrl);
    
    return res;
  }
  
  public static Response readUser(String userName){
    Response res = 
    given()
      .pathParam("username", userName)
    .when()
      .get(Routes.getUrl);
    
    return res;
  }

  public static Response updateUser(String userName, User payload){
    Response res = 
    given()
      .contentType("application/json")
      .accept(ContentType.JSON)
      .pathParam("username", userName)
      .body(payload)
    .when()
      .put(Routes.updatUrl);
    
    return res;
  }
  
  public static Response deleteUser(String userName){
    Response res = 
    given()
      .pathParam("username", userName)
    .when()
      .delete(Routes.deleteUrl);
    
    return res;
  }
}
