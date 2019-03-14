package coreservlets;

import javax.swing.*;

public class JList2 extends JListBase<Employee> {
  @Override
  protected JList<Employee> makeJList() {
    Employee[] entries = EmployeeUtils.getSampleEmployees();
    JList<Employee> list = new JList<>(entries);
    return(list);
  }
  
  public static void main(String[] args) {
    new JList2();
  }
}
