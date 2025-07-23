package com.selenium.generatingdynamicdata;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.github.javafaker.Faker;

public class FakerTestDataGenerator {
  public static void main(String[] args) {
    Faker faker = new Faker();
    Random random = new Random();

    // Map to store data with name as key and a nested map of details
    Map<String, Map<String, String>> testDataMap = new HashMap<>();

    // Generate 5 random test entries
    for (int i = 0; i < 5; i++) {
      String name = faker.name().fullName();
      String phone = faker.phoneNumber().cellPhone();
      String gender = random.nextBoolean() ? "Male" : "Female";
      String job = faker.job().title();
      String place = faker.address().cityName();
      String pinCode = faker.address().zipCode();

      // Inner map to store details
      Map<String, String> details = new HashMap<>();
      details.put("Phone", phone);
      details.put("Gender", gender);
      details.put("Job", job);
      details.put("Place", place);
      details.put("PinCode", pinCode);

      // Add to main map
      testDataMap.put(name, details);
    }

    // Print the test data
    System.out.println("=== Generated Test Data ===");
    for (Map.Entry<String, Map<String, String>> entry : testDataMap.entrySet()) {
      System.out.println("Name: " + entry.getKey());
      Map<String, String> details = entry.getValue();
      System.out.println("   Phone   : " + details.get("Phone"));
      System.out.println("   Gender  : " + details.get("Gender"));
      System.out.println("   Job     : " + details.get("Job"));
      System.out.println("   Place   : " + details.get("Place"));
      System.out.println("   PinCode : " + details.get("PinCode"));
      System.out.println();
    }
  }
}
