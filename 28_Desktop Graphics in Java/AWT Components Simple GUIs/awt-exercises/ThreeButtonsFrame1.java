import java.awt.*;
import java.awt.event.*;

/** Version 1: uses interface. See ThreeButtonsFrame2 for alternative that 
 *  uses inner classes.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class ThreeButtonsFrame1 extends Frame
                          implements ActionListener {
  private Button b1, b2, b3;

  public ThreeButtonsFrame1() {
    super("Three Buttons");
    b1 = new Button("Red");
    b2 = new Button("Green");
    b3 = new Button("Blue");
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    add(b1);
    add(b2);
    add(b3);
    setLayout(new FlowLayout());
    //setSize(400, 200);
    pack();
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
      setBackground(Color.RED);
    } else if (e.getSource() == b2) {
      setBackground(Color.GREEN);
    } else {
      setBackground(Color.BLUE);
    }
  }

  public static void main(String[] args) {
    new ThreeButtonsFrame1();
  }
}