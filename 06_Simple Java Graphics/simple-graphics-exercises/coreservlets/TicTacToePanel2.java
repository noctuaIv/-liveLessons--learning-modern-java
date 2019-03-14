package coreservlets;

import java.awt.*;
import javax.swing.*;

/** Improves on the previous example by looking up the width and height 
 *  instead of assuming that the panel is 300x300. In order to keep
 *  the TTT board square, it uses the smaller of the width and height
 *  as the main dimension.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class TicTacToePanel2 extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    int side = Math.min(getWidth(), getHeight());
    int oneThirdSide = side/3;
    int twoThirdsSide = (side*2)/3;
    
    g.drawLine(oneThirdSide, 0, oneThirdSide, side);
    g.drawLine(twoThirdsSide, 0, twoThirdsSide, side);
    g.drawLine(0, oneThirdSide, side, oneThirdSide);
    g.drawLine(0, twoThirdsSide, side, twoThirdsSide);
  }
}
