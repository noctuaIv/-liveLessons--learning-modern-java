package coreservlets;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/** Warmup exercise.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class TextFieldAndButton extends JFrame
                          implements ActionListener {
  private JButton button;
  private JTextField textField;
  private Container content;

  public TextFieldAndButton() {
    super("Three Buttons");
    WindowUtilities.setNimbusLookAndFeel();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    content = getContentPane();
    content.setLayout(new FlowLayout());
    textField = new JTextField(15);
    content.add(textField);
    button = new JButton("Clear Textfield");
    button.addActionListener(this);
    content.add(button);
    setSize(250,200);
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    textField.setText("");
  }

  public static void main(String[] args) {
    new TextFieldAndButton();
  }
}