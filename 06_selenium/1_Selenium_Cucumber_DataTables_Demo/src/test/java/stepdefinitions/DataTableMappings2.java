package stepdefinitions;
import java.util.Map;

import io.cucumber.java.DataTableType;

public class DataTableMappings2 {

  @DataTableType
  public Employee mapToEmployee(Map<String, String> entry) {
    Employee emp = new Employee();
    emp.setName(entry.get("name"));
    emp.setDepartment(entry.get("department"));
    emp.setSalary(Integer.parseInt(entry.get("salary")));
    return emp;
  }
}
