package parseJsonXMLResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ParsingXMLResponse {
  @Test
  void testXMLResponse() {
// Approach 1: validating without response
    given()
    .when()
      .get("https://www.w3schools.com/xml/simple.xml")
    .then()
      .statusCode(200)
      .header("Content-Type", "text/xml")
      .body("breakfast_menu.food[0].price", equalTo("$5.95"))
    ;
// Approach 2: validating with response
    Response response = 
    given()
    .when()
      .get("https://www.w3schools.com/xml/simple.xml");
    
    Assert.assertEquals(response.getStatusCode(), 200);
    Assert.assertEquals(response.header("Content-Type"),"text/xml");
    
    String price = response.xmlPath().getString("breakfast_menu.food[0].price");//.toString();
    Assert.assertEquals(price, "$5.95");
    
//XmlPath class 
    XmlPath xmlPath = new XmlPath(response.asString());
    //Verify total number of travellers
    List<String> breakfast_menu = xmlPath.getList("breakfast_menu.food");
    Assert.assertEquals(breakfast_menu.size(), 5);
    
    //Verify travellers name is present in response
    List<String> foodNames = xmlPath.getList("breakfast_menu.food.name");
    boolean status = false;
    for(String foodName : foodNames) {
      if(foodName.equals("French Toast")) {
        status = true;
        break;
      }
    }
    Assert.assertEquals(status, true);
  }
}
