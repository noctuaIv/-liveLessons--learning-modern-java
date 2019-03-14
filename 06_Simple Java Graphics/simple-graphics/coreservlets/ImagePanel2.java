package coreservlets;

import java.awt.*;
import java.net.*;

import javax.swing.*;

/** A panel that loads and draws and image based on an absolute URL.
 *  Introduces try/catch blocks.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class ImagePanel2 extends JPanel {
  private Image image;
  
  public ImagePanel2(String urlString) {
    try {
      URL imageUrl = new URL(urlString);
      image = Toolkit.getDefaultToolkit().getImage(imageUrl);
    } catch(MalformedURLException mfe) {
      System.err.println("Illegal URL: " + mfe);
    }
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(image, 0, 0, this);
  }
}
