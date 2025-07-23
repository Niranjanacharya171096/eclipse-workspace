package com.selenium.generatingdynamicdata;
import java.util.HashMap;
import java.util.Map;

import com.github.javafaker.Faker;

public class FakerHashMapExample {
  public static void main(String[] args) {
    Faker faker = new Faker();
    Map<String, String> testData = new HashMap<>();

    // Generate 5 random name-phone entries
    for (int i = 0; i < 5; i++) {
      String name = faker.name().fullName();
      String phone = faker.phoneNumber().cellPhone();  // Example: "0917-123-4567"
      testData.put(name, phone);
    }

    // Print the HashMap
    System.out.println("Random Test Data (Name -> Phone):");
    for (Map.Entry<String, String> entry : testData.entrySet()) {
      System.out.println("Name: " + entry.getKey() + " -> Phone: " + entry.getValue());
    }
  }
}
