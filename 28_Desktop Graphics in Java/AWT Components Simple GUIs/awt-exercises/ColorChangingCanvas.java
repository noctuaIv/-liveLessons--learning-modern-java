import java.awt.*;
import java.awt.event.*;

/** Canvas that changes color when the end user clicks on it. 
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class ColorChangingCanvas extends Canvas {
  public ColorChangingCanvas(int width, int height) {
    setSize(width, height);
    setRandomBackground();
    addMouseListener(new ColorChanger());
  }

  private void setRandomBackground() {
    Color bgColor =
          new Color((float)Math.random(),
                    (float)Math.random(),
                    (float)Math.random());
    setBackground(bgColor);
  }

  private class ColorChanger extends MouseAdapter {
    @Override
    public void mousePressed(MouseEvent e) {
      setRandomBackground();
    }
  }
}