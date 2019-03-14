package coreservlets;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/** Warmup with Swing.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class ThreeButtonsJFrame extends JFrame
                          implements ActionListener {
  private JButton b1, b2, b3;
  private Container content;

  public ThreeButtonsJFrame() {
    super("Three Buttons");
    WindowUtilities.setNimbusLookAndFeel();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    b1 = new JButton("Red");
    b2 = new JButton("Green");
    b3 = new JButton("Blue");
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    content = getContentPane();
    content.add(b1);
    content.add(b2);
    content.add(b3);
    content.setLayout(new FlowLayout());
    pack();
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
      content.setBackground(Color.RED);
    } else if (e.getSource() == b2) {
      content.setBackground(Color.GREEN);
    } else {
      content.setBackground(Color.BLUE);
    }
  }

  public static void main(String[] args) {
    new ThreeButtonsJFrame();
  }
}