package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndpoints2;
import api.payload.User;
import io.restassured.response.Response;

public class UserTests2 {
  Faker faker;
  User userPayload;
  
  //log4j logs
  public Logger logger;
  
  @BeforeClass
  public void setupData() {
    faker = new Faker();
    userPayload = new User();
    
    userPayload.setId(faker.idNumber().hashCode());
    userPayload.setUsername(faker.name().username());
    userPayload.setFirstName(faker.name().firstName());
    userPayload.setLastName(faker.name().lastName());
    userPayload.setEmail(faker.internet().safeEmailAddress());
    userPayload.setPassword(faker.internet().password(5, 10));
    userPayload.setPhone(faker.phoneNumber().cellPhone());    

    //logs
    logger = LogManager.getLogger(this.getClass());
    logger.debug("debugging...........");
  }
  
  @Test(priority = 1)
  public void testPostUser(){
    logger.info("*********Creating User***********");
    Response response = UserEndpoints2.createUser(userPayload);
    response.then().log().all();
    
    Assert.assertEquals(response.getStatusCode(), 200);
    logger.info("*********Created User***********");
  }

  @Test(priority = 2)
  public void testGetUser(){
    logger.info("*********Reading User***********");
    Response response = UserEndpoints2.readUser(this.userPayload.getUsername());
    response.then().log().all();
    
    Assert.assertEquals(response.getStatusCode(), 200);
    logger.info("*********Displayed User***********");
  }
  
  @Test(priority = 3)
  public void testUpdateUser(){
    logger.info("*********Updating User***********");
    //update data 
    userPayload.setFirstName(faker.name().firstName());
    userPayload.setLastName(faker.name().lastName());
    userPayload.setEmail(faker.internet().safeEmailAddress());

    Response response = UserEndpoints2.updateUser(this.userPayload.getUsername(), userPayload);
    response.then().log().body();
    
    Assert.assertEquals(response.getStatusCode(), 200);
 
    logger.info("*********Updated User***********");
    //checking the updated data
    Response responseAfterUpdte = UserEndpoints2.readUser(this.userPayload.getUsername());
    responseAfterUpdte.then().log().body();
    
    Assert.assertEquals(responseAfterUpdte.getStatusCode(), 200);
    logger.info("*********Checked Updated User***********");
  }

  @Test(priority = 4)
  public void testDeleteUser(){
    logger.info("*********Deleting User***********");
    Response response = UserEndpoints2.deleteUser(this.userPayload.getUsername());
    response.then().log().all();
    
    Assert.assertEquals(response.getStatusCode(), 200);
    logger.info("*********Deleted User***********");
  }
}
