package com.selenium.generatingdynamicdata;
import java.util.HashMap;
import java.util.Map;

import com.github.javafaker.Faker;

public class FakerHashMapTestData {
  public static void main(String[] args) {

    Faker faker = new Faker();
    Map<String, Map<String, String>> testDataMap = new HashMap<>();

    // Generate 5 sets of test data
    for (int i = 0; i < 5; i++) {
      String name = faker.name().fullName();
      String phone = faker.phoneNumber().cellPhone();
      String place = faker.address().cityName();

      Map<String, String> userInfo = new HashMap<>();
      userInfo.put("Phone", phone);
      userInfo.put("Place", place);

      testDataMap.put(name, userInfo);
    }

    // Print the test data
    System.out.println("Generated Test Data:");
    for (Map.Entry<String, Map<String, String>> entry : testDataMap.entrySet()) {
      String name = entry.getKey();
      Map<String, String> userInfo = entry.getValue();
      System.out.println("Name: " + name);
      System.out.println("   Phone: " + userInfo.get("Phone"));
      System.out.println("   Place: " + userInfo.get("Place"));
      System.out.println();
    }
  }
}
