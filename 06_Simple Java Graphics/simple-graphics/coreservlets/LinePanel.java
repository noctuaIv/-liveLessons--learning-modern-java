package coreservlets;

import java.awt.*;
import javax.swing.*;

/** A simple example to introduce the coordinate system for drawing,
 *  most importantly that y=0 is the TOP and y goes DOWN.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class LinePanel extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawLine(0, 0, 250, 250);
    g.drawLine(0, 0, 300, 100);
  }
}
