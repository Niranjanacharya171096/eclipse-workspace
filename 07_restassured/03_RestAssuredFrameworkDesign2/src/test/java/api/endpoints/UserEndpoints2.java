//Using src\test\resources\routes.properties file
package api.endpoints;

import static io.restassured.RestAssured.*;  
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.ResourceBundle;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//created for performing CRUD operations using Payloads

public class UserEndpoints2 {
  //method for getting URL's from properties file
  static ResourceBundle getURL(){
    ResourceBundle routes = ResourceBundle.getBundle("routes"); //loads properties file
    return routes;
  }
  
  public static Response createUser(User payload){
    String postUrl = getURL().getString("postUrl");
    Response res = 
    given()
      .contentType("application/json")
      .accept(ContentType.JSON)
      .body(payload)
    .when()
      .post(postUrl);
    
    return res;
  }
  
  public static Response readUser(String userName){
    String getUrl = getURL().getString("getUrl");
    Response res = 
    given()
      .pathParam("username", userName)
    .when()
      .get(getUrl);
    
    return res;
  }

  public static Response updateUser(String userName, User payload){
    String updatUrl = getURL().getString("updatUrl");
    Response res = 
    given()
      .contentType("application/json")
      .accept(ContentType.JSON)
      .pathParam("username", userName)
      .body(payload)
    .when()
      .put(updatUrl);
    
    return res;
  }
  
  public static Response deleteUser(String userName){
    String deleteUrl = getURL().getString("deleteUrl");
    Response res = 
    given()
      .pathParam("username", userName)
    .when()
      .delete(deleteUrl);
    
    return res;
  }
}
