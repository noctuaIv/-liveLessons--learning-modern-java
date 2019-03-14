package coreservlets;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextFieldAndButtonPlus extends JFrame
                          implements ActionListener {
  private JButton clearButton, colorButton;
  private JTextField textField;
  private Container content;

  public TextFieldAndButtonPlus() {
    super("Three Buttons");
    WindowUtilities.setNimbusLookAndFeel();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    content = getContentPane();
    content.setLayout(new FlowLayout());
    textField = new JTextField(15);
    content.add(textField);
    clearButton = new JButton("Clear Textfield");
    clearButton.addActionListener(this);
    content.add(clearButton);
    colorButton = new JButton("Set Background Color");
    colorButton.addActionListener(this);
    content.add(colorButton);
    setSize(250,200);
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == clearButton) {
      textField.setText("");
    } else {
      Color bgColor = JColorChooser.showDialog
                        (this,
                         "Choose Background Color",
                         content.getBackground());
      if (bgColor != null) {
        content.setBackground(bgColor);
      }
    }
  }

  public static void main(String[] args) {
    new TextFieldAndButtonPlus();
  }
}