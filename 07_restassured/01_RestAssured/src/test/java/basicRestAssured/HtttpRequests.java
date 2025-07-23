package basicRestAssured;

import static io.restassured.RestAssured.given; 
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.Test;

public class HtttpRequests {
  int id; // global variable

  @Test(priority = 1)
  void getListUsers() {
    given() // optional
    .when()
      .get("https://reqres.in/api/users?page=2")
    .then()
      .statusCode(200)
      .body("page", equalTo(2))
      .log().all(); // display response in console
  }

  @Test(priority = 2)
  void createUser() {
//not recommended to post the data
    HashMap hm = new HashMap();
    hm.put("name", "pavan");
    hm.put("job", "trainer");

    id = given()
        .contentType("application/json").body(hm)
      .when()
        .post("https://reqres.in/api/users")
        .jsonPath().getInt("id");
//can't use then() as getInt() returns primitive data type
//    .then()
//      .statusCode(201)
//      .log().all(); //display response in console
  }

  @Test(priority = 3, dependsOnMethods = {"createUser"})
  void updateUser() {
    HashMap hm = new HashMap();
    hm.put("name", "morpheus");
    hm.put("job", "leader");

    given()
      .contentType("application/json")
      .body(hm)
    .when()
      .put("https://reqres.in/api/users/" + id)
    .then()
      .statusCode(200)
      .log().all(); // display response in console
  }
  
  @Test(priority = 4, dependsOnMethods = {"createUser"})
  void deletUser() {
    when()
      .delete("https://reqres.in/api/users/"+id)
    .then()
      .statusCode(204)
      .log().all();
  }
}