package com.selenium.generatingdynamicdata;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomPhoneBook {
  public static void main(String[] args) {
    // Sample names to choose from
    String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Helen", "Ivy", "Jack"};

    // Create the HashMap to store name-phone pairs
    Map<String, String> phoneBook = new HashMap<>();

    Random random = new Random();

    // Add 5 random entries
    for (int i = 0; i < 5; i++) {
      String name = names[random.nextInt(names.length)];

      // Generate random 10-digit number starting with 6-9
      String phone = (random.nextInt(4) + 6) + String.format("%09d", random.nextInt(1000000000));

      phoneBook.put(name, phone);
    }

    // Print the HashMap
    System.out.println("Random Phone Book Entries:\n"+phoneBook);
    for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
      System.out.println("Name: " + entry.getKey() + " -> Phone: " + entry.getValue());
    }
  }
}
