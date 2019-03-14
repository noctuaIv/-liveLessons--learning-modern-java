package coreservlets;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

public abstract class JListBase<T> extends JFrame {
  protected JList<T> jList;
  private JTextField valueField;
  
  // Override this to return a JList
  protected abstract JList<T> makeJList();
  
  // Override this *if* you want some extra stuff 
  // in the top panel
  protected void addStufftoListPanel(JPanel listPanel) {}
  
  public JListBase() {
    super("JList Examples");
    WindowUtilities.setNimbusLookAndFeel();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container content = getContentPane();
    jList = makeJList();
    jList.setVisibleRowCount(4);
    jList.addListSelectionListener(new ValueReporter());
    JScrollPane listPane = new JScrollPane(jList);
    Font displayFont = new Font("Serif", Font.BOLD, 18);
    jList.setFont(displayFont);
    JPanel listPanel = new JPanel();
    listPanel.setBackground(Color.white);
    Border listPanelBorder =
      BorderFactory.createTitledBorder("Sample JList");
    listPanel.setBorder(listPanelBorder);
    listPanel.add(listPane);
    addStufftoListPanel(listPanel);
    content.add(listPanel, BorderLayout.CENTER);
    JLabel valueLabel = new JLabel("Selection:");
    valueLabel.setFont(displayFont);
    valueField = new JTextField("None", 15);
    valueField.setFont(displayFont);
    valueField.setEditable(false);
    JPanel valuePanel = new JPanel();
    valuePanel.setBackground(Color.white);
    Border valuePanelBorder =
      BorderFactory.createTitledBorder("JList Selection");
    valuePanel.setBorder(valuePanelBorder);
    valuePanel.add(valueLabel);
    valuePanel.add(valueField);
    content.add(valuePanel, BorderLayout.SOUTH);
    pack();
    setVisible(true);
  }

  private class ValueReporter implements ListSelectionListener {

    /** You get three events in many cases -- one for the 
     *  deselection of the originally selected entry, one 
     *  indicating the selection is moving, and one for the 
     *  selection of the new entry. In the first two cases, 
     *  getValueIsAdjusting returns true; thus, the test below
     *  when only the third case is of interest.
     */

    @Override
    public void valueChanged(ListSelectionEvent event) {
      if (!event.getValueIsAdjusting()) {
        Object value = jList.getSelectedValue();
        if (value != null) {
          valueField.setText(value.toString());
        }  
      }
    }
  }
}