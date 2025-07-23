package com.selenium.generatingdynamicdata;

public class User {
  private String name;
  private String phone;
  private String gender;
  private String job;
  private String place;
  private String pinCode;

  public User(String name, String phone, String gender, String job, String place, String pinCode) {
    this.name = name;
    this.phone = phone;
    this.gender = gender;
    this.job = job;
    this.place = place;
    this.pinCode = pinCode;
  }

  // Getters
  public String getName() { return name; }
  public String getPhone() { return phone; }
  public String getGender() { return gender; }
  public String getJob() { return job; }
  public String getPlace() { return place; }
  public String getPinCode() { return pinCode; }
}
