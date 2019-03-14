package coreservlets;

import java.awt.*;
import javax.swing.*;

/** Simple example to familiarize yourself with the coordinate system, 
 *  particular that y=0 is the top, not the bottom. An improvement would
 *  be to look up the width and height instead of assuming that the panel
 *  is 300x300; this is done in TicTacToePanel2.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class TicTacToePanel1 extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawLine(100, 0, 100, 300);
    g.drawLine(200, 0, 200, 300);
    g.drawLine(0, 100, 300, 100);
    g.drawLine(0, 200, 300, 200);
  }
}
