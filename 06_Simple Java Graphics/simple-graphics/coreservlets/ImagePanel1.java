package coreservlets;

import java.awt.*;
import javax.swing.*;

/** A panel that loads and draws and image based on a relative path 
 *  (interpreted with respect to the top-level folder containing
 *  the class files).
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class ImagePanel1 extends JPanel {
  private Image image;
  
  public ImagePanel1(String relativePath) {
    image = 
      Toolkit.getDefaultToolkit().getImage(relativePath);
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(image, 0, 0, this);
  }
}
