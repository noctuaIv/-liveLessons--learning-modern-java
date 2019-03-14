package coreservlets;
import javax.swing.*;   // For JPanel, etc.
import java.awt.*;      // For Graphics, etc.
import java.awt.geom.*; // For Ellipse2D, etc.

/** An example of drawing/filling shapes with Java 2D. 
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class ShapeExample extends JPanel {
  private Ellipse2D.Double circle =
    new Ellipse2D.Double(10, 10, 350, 350);
  private Rectangle2D.Double square =
    new Rectangle2D.Double(10, 10, 350, 350);

  @Override
  public void paintComponent(Graphics g) {
    clear(g);
    Graphics2D g2d = (Graphics2D)g;
    g2d.fill(circle);
    g2d.draw(square);
  }

  // super.paintComponent clears off screen pixmap,
  // since we're using double buffering by default.
  protected void clear(Graphics g) {
    super.paintComponent(g);
  }

  protected Ellipse2D.Double getCircle() {
    return(circle);
  }

public static void main(String[] args) {
    WindowUtilities.openInJFrame(new ShapeExample(), 380, 400);
  }
}