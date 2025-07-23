package differentWaysToCreateRequestBody;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class WaysToCreateRequestBody {
//  int id; // global variable

//1.  Using HashMap 
  @Test(priority = 1)
  void testPostUsingHashMap() {
    HashMap hm = new HashMap();
    
    hm.put("name","Sam");
    hm.put("location","France");
    hm.put("phone","69525220");
    
    String courseArr[]= {"C","Python"};
    hm.put("courses", courseArr);
    
//  id = 
    given()
      .contentType("application/json")
      .body(hm)
    .when()
      .post("http://localhost:3000/students")
//      .jsonPath().getInt("id");
    .then()
      .statusCode(201)
      .body("name", equalTo("Sam"))
      .body("location", equalTo("France"))
      .body("phone", equalTo("69525220"))
      .body("courses[0]", equalTo("C"))
      .body("courses[1]", equalTo("Python"))
      .header("Content-Type", "application/json")
      .log().all();
  }
  
//2.  Using POJO(Plain Old Java Object)
  @Test(priority = 2)
  void testPostUsingExternalJsonFile() {
    POJO_PostRequest data = new POJO_PostRequest();
    
    data.setName("Grew");
    data.setLocation("AUS");
    data.setPhone("555444755");
    String coursesArr[] = {"DB", "Networking"};
    data.setCourses(coursesArr);
    
//  id = 
    given()
      .contentType("application/json")
      .body(data)
    .when()
      .post("http://localhost:3000/students")
//      .jsonPath().getInt("id");
    .then()
      .statusCode(201)
      .log().all();
  } 

//3.  Using org.json library
  @Test(priority = 3)
  void testPostUsingOrgJson() {
    JSONObject jsonData = new JSONObject();

    jsonData.put("name", "Smith");
    jsonData.put("location", "UK");
    jsonData.put("phone", "69525220");

    String courseArr[] = { "C", "Python" };
    jsonData.put("courses", courseArr);

//  id = 
    given()
      .contentType("application/json")
      .body(jsonData.toString()) // convert JSONObject always to String
    .when()
      .post("http://localhost:3000/students")
//      .jsonPath().getInt("id");
    .then()
      .statusCode(201)
      .log().all();
  }

//  4.  Using external JSON file
  @Test(priority = 4)
  void testPostUsingPOJO() throws FileNotFoundException {
    File file = new File(".\\jsonBody\\body.json");
    FileReader fileReader = new FileReader(file);
    
    JSONTokener jsonTokener = new JSONTokener(fileReader);
    JSONObject jsonData = new JSONObject(jsonTokener);
    
//  id = 
    given()
      .contentType("application/json")
      .body(jsonData.toString()) //convert JSONObject always to String
    .when()
      .post("http://localhost:3000/students")
//      .jsonPath().getInt("id");
    .then()
      .statusCode(201)
      .log().all();
  }   

//  @AfterTest
//  void testDelete() {
//    given()
//    .when()
//      .delete("http://localhost:3000/students/" + id)
//    .then()
//      .statusCode(200)
//      .log().all();
//  }
}
