package com.selenium.generatingdynamicdata;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.github.javafaker.Faker;

public class FakerCSVUsingStreams {
  public static void main(String[] args) {
    Faker faker = new Faker();
    Random random = new Random();
    List<User> users = new ArrayList<>();

    // Generate 5 users
    for (int i = 0; i < 5; i++) {
      String name = faker.name().fullName();
      String phone = faker.phoneNumber().cellPhone();
      String gender = random.nextBoolean() ? "Male" : "Female";
      String job = faker.job().title();
      String place = faker.address().cityName();
      String pinCode = faker.address().zipCode();

      users.add(new User(name, phone, gender, job, place, pinCode));
    }

    String fileName = "users_stream.csv";

    // Write using FileOutputStream
    try (FileOutputStream fos = new FileOutputStream(fileName)) {
      String header = "Name,Phone,Gender,Job,Place,PinCode\n";
      fos.write(header.getBytes());

      for (User user : users) {
        String row = String.join(",",
            user.getName(),
            user.getPhone(),
            user.getGender(),
            user.getJob().replace(",", ""),   // remove commas to avoid breaking CSV
            user.getPlace().replace(",", ""),
            user.getPinCode()) + "\n";
        /* without String.join();
         user.getName() + "," +
         user.getPhone() + "," +
         user.getGender() + "," +
         user.getJob() + "," +
         user.getPlace() + "," +
         user.getPinCode() + "\n";
         */
        fos.write(row.getBytes());
      }

      System.out.println("Data written to " + fileName);
    } catch (IOException e) {
      System.err.println("Error writing CSV: " + e.getMessage());
    }

    // Optional: Read the file and print using FileInputStream
    System.out.println("\nReading from " + fileName + ":\n");
    try (FileInputStream fis = new FileInputStream(fileName)) {
      int ch;
      while ((ch = fis.read()) != -1) {
        System.out.print((char) ch);
      }
    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    }
  }
}
