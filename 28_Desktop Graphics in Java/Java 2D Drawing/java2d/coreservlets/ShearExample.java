package coreservlets;
import javax.swing.*;
import java.awt.*;

/** An example of shear transformations on a rectangle. 
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class ShearExample extends JPanel {
  private static int gap=10, width=100;
  private Rectangle rect = new Rectangle(gap, gap, 100, 100);

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D)g;
    for (int i=0; i<5; i++) {
      g2d.setPaint(Color.red);
      g2d.fill(rect);
      // Each new square gets 0.2 more x shear.
      g2d.shear(0.2, 0.0);
      g2d.translate(2*gap + width, 0);
    }
  }

  public static void main(String[] args) {
    String title =
      "Shear: x shear ranges from 0.0 for the leftmost" +
      "'square' to 0.8 for the rightmost one.";
    WindowUtilities.openInJFrame(new ShearExample(),
                                 20*gap + 5*width, 
                                 5*gap + width,
                                 title);
  }
}