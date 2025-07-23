package com.selenium.generatingdynamicdata;
import java.util.Random;

public class TestDataGenerator {

  private static final String[] FIRST_NAMES = {
      "John", "Jane", "Alice", "Bob", "Carol", "David", "Eve", "Frank", "Grace", "Hank"
  };

  private static final String[] LAST_NAMES = {
      "Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia", "Clark", "Lewis"
  };

  public static void main(String[] args) {
    String randomName = generateRandomName();
    String randomPhone = generateRandomPhoneNumber();

    System.out.println("Random Name: " + randomName);
    System.out.println("Random Phone Number: " + randomPhone);
  }

  public static String generateRandomName() {
    Random rand = new Random();
    String firstName = FIRST_NAMES[rand.nextInt(FIRST_NAMES.length)];
    String lastName = LAST_NAMES[rand.nextInt(LAST_NAMES.length)];
    return firstName + " " + lastName;
  }

  public static String generateRandomPhoneNumber() {
    Random rand = new Random();
    // Start with 7, 8, or 9 to simulate a realistic mobile number
    int firstDigit = rand.nextInt(3) + 7;
    String number = firstDigit + String.format("%09d", rand.nextInt(1_000_000_000));
    return number;
  }
}
