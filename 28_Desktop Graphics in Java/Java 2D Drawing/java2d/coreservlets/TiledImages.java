package coreservlets;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;

/** An example of using TexturePaint to fill objects with tiled
 *  images. Uses the getBufferedImage method of ImageUtilities 
 *  to load an Image from a file and turn that into a 
 *  BufferedImage.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class TiledImages extends JPanel {
  private String dir = System.getProperty("user.dir");
  private String imageFile1 = dir + "/images/marty.jpg";
  private TexturePaint imagePaint1;
  private Rectangle imageRect;
  private String imageFile2 = dir + "/images/bluedrop.gif";
  private TexturePaint imagePaint2;
  private int[] xPoints = { 30, 700, 400 };
  private int[] yPoints = { 30, 30, 600 };
  private Polygon imageTriangle =
                    new Polygon(xPoints, yPoints, 3);
  public TiledImages() {
    BufferedImage image =
      ImageUtilities.getBufferedImage(imageFile1, this);
    imageRect = new Rectangle(235, 70, image.getWidth(),
                              image.getHeight());
    imagePaint1 = new TexturePaint(image, imageRect);
    image = ImageUtilities.getBufferedImage(imageFile2, this);
    imagePaint2 =
      new TexturePaint(image, new Rectangle(0, 0, 32, 32));
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D)g;
    g2d.setPaint(imagePaint2);
    g2d.fill(imageTriangle);
    g2d.setPaint(Color.blue);
    g2d.setStroke(new BasicStroke(5));
    g2d.draw(imageTriangle);
    g2d.setPaint(imagePaint1);
    g2d.fill(imageRect);
    g2d.setPaint(Color.black);
    g2d.draw(imageRect);
  }

  public static void main(String[] args) {
    WindowUtilities.openInJFrame(new TiledImages(), 750, 650);
  }
}