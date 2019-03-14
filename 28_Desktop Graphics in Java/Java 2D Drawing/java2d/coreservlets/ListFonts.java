package coreservlets;
import java.awt.*;

/** Lists the names of all available fonts. 
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class ListFonts {
  public static void main(String[] args) {
    GraphicsEnvironment env =
      GraphicsEnvironment.getLocalGraphicsEnvironment();
    String[] fontNames = env.getAvailableFontFamilyNames();
    System.out.println("Available Fonts:");
    for(int i=0; i<fontNames.length; i++)
      System.out.println("  " + fontNames[i]);
  }
}