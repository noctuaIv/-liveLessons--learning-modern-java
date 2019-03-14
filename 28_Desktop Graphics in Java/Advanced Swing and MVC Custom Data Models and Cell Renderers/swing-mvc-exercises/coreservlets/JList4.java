package coreservlets;

import java.util.*;

import javax.swing.*;

public class JList4 extends JListBase<Employee> {
  @Override
  protected JList<Employee> makeJList() {
    List<Employee> employees = EmployeeUtils.getSampleEmployees2();
    EmployeeListModel model = new EmployeeListModel(employees);
    JList<Employee> list = new JList<>(model);
    return(list);
  }
  
  public static void main(String[] args) {
    new JList4();
  }
}
