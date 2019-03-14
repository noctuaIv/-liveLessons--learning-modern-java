package coreservlets;

import java.awt.event.*;
import javax.swing.*;

public class JList3 extends JListBase<Employee> implements ActionListener {
  private JButton salaryButton;
  
  @Override
  protected JList<Employee> makeJList() {
    Employee[] entries = EmployeeUtils.getSampleEmployees();
    JList<Employee> list = new JList<>(entries);
    return(list);
  }
  
  @Override
  protected void addStufftoListPanel(JPanel listPanel) {
    salaryButton = new JButton("Show Salary");
    salaryButton.addActionListener(this);
    listPanel.add(salaryButton);
  }
  
  @Override
  public void actionPerformed(ActionEvent event) {
    Employee e = jList.getSelectedValue();
    if (e != null) {
      String message = 
        String.format("%s's salary is $%,.2f", 
                      e.getFullName(), e.getSalary());
      JOptionPane.showMessageDialog(this, message);
    }
  }
  
  public static void main(String[] args) {
    new JList3();
  }
}
