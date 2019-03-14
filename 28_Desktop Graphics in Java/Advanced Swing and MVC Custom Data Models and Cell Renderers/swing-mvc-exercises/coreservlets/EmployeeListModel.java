package coreservlets;

import java.util.*;

import javax.swing.*;
import javax.swing.event.*;

public class EmployeeListModel implements ListModel<Employee> {
  private List<Employee> employees;
  
  public EmployeeListModel(List<Employee> employees) {
    this.employees = employees;
  }

  @Override
  public int getSize() {
    return(employees.size());
  }

  @Override
  public Employee getElementAt(int index) {
    return(employees.get(index));
  }

  @Override
  public void addListDataListener(ListDataListener l) {
  }

  @Override
  public void removeListDataListener(ListDataListener l) {
  }

}
