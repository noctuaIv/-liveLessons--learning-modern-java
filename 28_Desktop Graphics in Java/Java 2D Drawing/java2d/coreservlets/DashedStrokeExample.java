package coreservlets;
import java.awt.*;

/** An example of creating a custom dashed line for drawing.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class DashedStrokeExample extends FontExample {
  @Override
  public void paintComponent(Graphics g) {
    clear(g);
    Graphics2D g2d = (Graphics2D)g;
    drawGradientCircle(g2d);
    drawBigString(g2d);
    drawDashedCircleOutline(g2d);
  }

  protected void drawDashedCircleOutline(Graphics2D g2d) {
    g2d.setPaint(Color.blue);
    // 30-pixel line, 10-pixel gap, 10-pixel line, 10-pixel gap
    float[] dashPattern = { 30, 10, 10, 10 };
    g2d.setStroke(new BasicStroke(8, BasicStroke.CAP_BUTT,
                                  BasicStroke.JOIN_MITER, 10,
                                  dashPattern, 0));
    g2d.draw(getCircle());
  }

  public static void main(String[] args) {
    WindowUtilities.openInJFrame(new DashedStrokeExample(),
                                 380, 400);
  }
}