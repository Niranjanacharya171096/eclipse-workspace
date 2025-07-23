package serializationDeserialization;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//for testPostUsingPOJO
@JsonIgnoreProperties(ignoreUnknown = true) // else Add all the Missing Field

public class Students {
  int id;
  String name;
  String location;
  String phone;
  String courses[];

  public Students() { }

  // Constructor
  public Students(String name, String location, String phone, String[] courses) {
    this.name = name;
    this.location = location;
    this.phone = phone;
    this.courses = courses;
  }

  public void setName(String name) { this.name = name; }
  public String getName() { return name; }

  public void setLocation(String location) { this.location = location; }
  public String getLocation() { return location; }

  public void setPhone(String phone) { this.phone = phone; }
  public String getPhone() { return phone; }

  public void setCourses(String[] courses) { this.courses = courses; }
  public String[] getCourses() { return courses; }

  public void setId(int id) { this.id = id; }
  public int getId() { return id; }

  // Optional: Override toString() for printing
  @Override
  public String toString() {
    return "Students { id=" + id + ", name='" + name + "', location='" + location + "' }";
  }
}
