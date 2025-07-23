package stepdefinitions;

import java.util.Map;

import io.cucumber.java.DataTableType;

public class DataTableMappings {

  @DataTableType
  public Credentials mapToCredentials (Map<String, String> data) {
    Credentials cred = new Credentials();
    cred.setUsername(data.get("username"));
    cred.setPassword(data.get("password"));
    return cred;
  }
}
