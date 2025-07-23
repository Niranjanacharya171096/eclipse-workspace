package api.endpoints;

//maintain all the urls from swagger
/*
 Module: User
 Swagger URI --> https://petstore.swagger.io/
  Create User(POST) : https://petstore.swagger.io/v2/user
    Get User(Get) : https://petstore.swagger.io/v2/user/{username}
      Update User (Update) : https://petstore.swagger.io/v2/user/{username}
        Delete User (Delete) : https://petstore.swagger.io/v2/user/{username}
*/

public class Routes {
  public static String baseUrl = "https://petstore.swagger.io/v2";

  // User Model
  public static String postUrl = baseUrl + "/user";
  public static String getUrl = baseUrl + "/user/{username}";
  public static String updatUrl = baseUrl + "/user/{username}";
  public static String deleteUrl = baseUrl + "/user/{username}";

//Store model 
  // here create Store module URL's
//Pet model 
  // here create Pet module URL's
}
