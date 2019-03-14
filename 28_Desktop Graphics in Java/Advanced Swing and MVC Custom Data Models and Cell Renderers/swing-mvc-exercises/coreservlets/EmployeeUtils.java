package coreservlets;

import java.util.*;


public class EmployeeUtils {
  private static Employee[] sampleEmployees = {
    new Employee("Bill", "Gates", 45678.90),
    new Employee("Larry", "Ellison", 67844.57),
    new Employee("Sergey", "Brin", 35778.22),
    new Employee("Larry", "Page", 35778.22),
    new Employee("Steve", "Jobs", 59432.01),
    new Employee("Jeff", "Bezos", 63491.12),
  };

  public static Employee[] getSampleEmployees() {
    return(sampleEmployees);
  }
  
  public static List<Employee> getSampleEmployees2() {
    return(Arrays.asList(sampleEmployees));
  }

  private EmployeeUtils() {} // Uninstantiatable class
}
