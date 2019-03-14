package coreservlets;
import java.awt.*;

/** An example of controlling the Stroke (pen) widths when
 *  drawing.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class StrokeThicknessExample extends FontExample {
  @Override
  public void paintComponent(Graphics g) {
    clear(g);
    Graphics2D g2d = (Graphics2D)g;
    drawGradientCircle(g2d);
    drawBigString(g2d);
    drawThickCircleOutline(g2d);
  }

  protected void drawThickCircleOutline(Graphics2D g2d) {
    g2d.setPaint(Color.blue);
    g2d.setStroke(new BasicStroke(8)); // 8-pixel wide pen
    g2d.draw(getCircle());
  }

  public static void main(String[] args) {
    WindowUtilities.openInJFrame(new StrokeThicknessExample(),
                                 380, 400);
  }
}