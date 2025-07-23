package serializationDeserialization;

import org.testng.annotations.Test; 

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class SerializationDeserialization2 {
  @Test(priority = 1)
  void testSerialization() throws JsonProcessingException {
    Students data = new Students();
    //object format
    data.setName("Grew");
    data.setLocation("AUS");
    data.setPhone("555444755");
    String coursesArr[] = {"DB", "Networking"};
    data.setCourses(coursesArr);
    
    //convert java POJO object to json object
    ObjectMapper objMapper = new ObjectMapper();
    String jsonDataString = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);
    System.out.println(jsonDataString);
  }
  
  @Test(priority = 2)
  void testDeSerialization() throws JsonProcessingException {
    String jsonDataString = "{\r\n"
        + "        \"name\" : \"Grew\",\r\n"
        + "        \"location\" : \"AUS\",\r\n"
        + "        \"phone\" : \"555444755\",\r\n"
        + "        \"courses\" : [ \"DB\", \"Networking\" ]\r\n"
        + "      }";
    
    //convert json to java POJO object
    ObjectMapper objMapper = new ObjectMapper();
    Students studenPOJO = objMapper.readValue(jsonDataString, Students.class);
    System.out.println(studenPOJO.getName());
    System.out.println(studenPOJO.getLocation());
    System.out.println(studenPOJO.getPhone());
    System.out.println(studenPOJO.getCourses()[0]);
    System.out.println(studenPOJO.getCourses()[1]);
  }
}
