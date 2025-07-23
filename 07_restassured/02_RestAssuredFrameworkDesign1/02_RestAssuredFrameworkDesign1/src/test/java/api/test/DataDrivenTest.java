//using Excel 
package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.UserEndpoints;
import api.payload.User;
import api.utilities.Dataproviders;
import io.restassured.response.Response;

public class DataDrivenTest {
  
  @Test(priority = 1, dataProvider = "AllData", dataProviderClass = Dataproviders.class)
  public void testPostUser(String userId, String userName, String fname, String lname, String email, String pwd, String phone){
    User userPayload = new User();
    userPayload.setId(Integer.parseInt(userId));
    userPayload.setUsername(userName);
    userPayload.setFirstName(fname);
    userPayload.setLastName(lname);
    userPayload.setEmail(email);
    userPayload.setPassword(pwd);
    userPayload.setPhone(phone);    

    Response response = UserEndpoints.createUser(userPayload);
    response.then().log().all();
    
    Assert.assertEquals(response.getStatusCode(), 200);
  }

//  @Test(priority = 2, dataProvider = "UserNames", dataProviderClass = Dataproviders.class)
//  public void testGetUser(){
//    Response response = UserEndpoints.readUser(this.userPayload.getUsername());
//    response.then().log().all();
//    
//    Assert.assertEquals(response.getStatusCode(), 200);
//  }
  
//@Test(priority = 3, dataProvider = "UserNames", dataProviderClass = Dataproviders.class)
//  public void testUpdateUser(){
//    //update data 
//    userPayload.setFirstName(faker.name().firstName());
//    userPayload.setLastName(faker.name().lastName());
//    userPayload.setEmail(faker.internet().safeEmailAddress());
//
//    Response response = UserEndpoints.updateUser(this.userPayload.getUsername(), userPayload);
//    response.then().log().body();
//    
//    Assert.assertEquals(response.getStatusCode(), 200);
//    
//    //checking the updated data
//    Response responseAfterUpdte = UserEndpoints.readUser(this.userPayload.getUsername());
//    responseAfterUpdte.then().log().body();
//    
//    Assert.assertEquals(responseAfterUpdte.getStatusCode(), 200);
//  }

  @Test(priority = 4, dataProvider = "UserNames", dataProviderClass = Dataproviders.class)
  public void testDeleteUser(String userName){
    
    Response response = UserEndpoints.deleteUser(userName);
    response.then().log().all();
    
    Assert.assertEquals(response.getStatusCode(), 200);
  }
}
