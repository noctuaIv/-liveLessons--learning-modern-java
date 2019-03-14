package coreservlets;

import javax.swing.*;

public class JList1 extends JListBase<String> {
  @Override
  protected JList<String> makeJList() {
    Employee[] employees = EmployeeUtils.getSampleEmployees();
    String[] entries = new String[employees.length];
    for(int i=0; i<employees.length; i++) {
      entries[i] = employees[i].getFullName();
    }
    JList<String> list = new JList<>(entries);
    return(list);
  }
  
  public static void main(String[] args) {
    new JList1();
  }
}
