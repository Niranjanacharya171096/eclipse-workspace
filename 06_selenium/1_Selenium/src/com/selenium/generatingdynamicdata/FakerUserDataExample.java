package com.selenium.generatingdynamicdata;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.github.javafaker.Faker;

public class FakerUserDataExample {
  public static void main(String[] args) {
    Faker faker = new Faker();
    Random random = new Random();

    Map<String, User> testDataMap = new HashMap<>();

    // Generate 5 test users
    for (int i = 0; i < 5; i++) {
      String name = faker.name().fullName();
      String phone = faker.phoneNumber().cellPhone();
      String gender = random.nextBoolean() ? "Male" : "Female";
      String job = faker.job().title();
      String place = faker.address().cityName();
      String pinCode = faker.address().zipCode();

      User user = new User(name, phone, gender, job, place, pinCode);
      testDataMap.put(name, user);
    }

    // Print the test users
    System.out.println("=== User Test Data ===");
    for (Map.Entry<String, User> entry : testDataMap.entrySet()) {
      User user = entry.getValue();
      System.out.println("Name    : " + user.getName());
      System.out.println("Phone   : " + user.getPhone());
      System.out.println("Gender  : " + user.getGender());
      System.out.println("Job     : " + user.getJob());
      System.out.println("Place   : " + user.getPlace());
      System.out.println("PinCode : " + user.getPinCode());
      System.out.println();
    }
  }
}
