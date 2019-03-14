package coreservlets;

import java.awt.*;
import javax.swing.*;

/** Loads and draws a picture from a path relative to the root of
 *  the compiled .class files.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class GatesPanel extends JPanel {
  private Image image;
  
  public GatesPanel(String relativePath) {
    image = Toolkit.getDefaultToolkit().getImage(relativePath);
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(image, 0, 0, this);
    g.fillRect(455, 212, 50, 5);
  }
}
