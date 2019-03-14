package coreservlets;
import java.awt.*;

/** An example of using local fonts to perform drawing in
 *  Java 2D.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class FontExample extends GradientPaintExample {
  public FontExample() {
    GraphicsEnvironment env =
      GraphicsEnvironment.getLocalGraphicsEnvironment();
    env.getAvailableFontFamilyNames();
    setFont(new Font("Goudy Handtooled BT", Font.PLAIN, 100));
  }

  protected void drawBigString(Graphics2D g2d) {
    g2d.setPaint(Color.black);
    g2d.drawString("Java 2D", 25, 215);
  }

  @Override
  public void paintComponent(Graphics g) {
    clear(g);
    Graphics2D g2d = (Graphics2D)g;
    drawGradientCircle(g2d);
    drawBigString(g2d);
  }

  public static void main(String[] args) {
    WindowUtilities.openInJFrame(new FontExample(), 380, 400);
  }
}