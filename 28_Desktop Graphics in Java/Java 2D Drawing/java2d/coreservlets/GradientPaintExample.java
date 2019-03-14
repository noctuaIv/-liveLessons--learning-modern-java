package coreservlets;
import java.awt.*;

/** An example of applying a gradient fill to a circle. The
 *  color definition starts with red at (0,0), gradually
 *  changing to yellow at (175,175).
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class GradientPaintExample extends ShapeExample {
  private GradientPaint gradient =
    new GradientPaint(0, 0, Color.red, 175, 175, Color.yellow,
                      true); // true means to repeat pattern

  @Override
  public void paintComponent(Graphics g) {
    clear(g);
    Graphics2D g2d = (Graphics2D)g;
    drawGradientCircle(g2d);
  }

  protected void drawGradientCircle(Graphics2D g2d) {
    g2d.setPaint(gradient);
    g2d.fill(getCircle());
    g2d.setPaint(Color.black);
    g2d.draw(getCircle());
  }

  public static void main(String[] args) {
    WindowUtilities.openInJFrame(new GradientPaintExample(),
                                 380, 400);
  }
}