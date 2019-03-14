package coreservlets;
import java.awt.*;
import java.awt.image.*;

/** A class that simplifies a few common image operations, in
 *  particular, creating a BufferedImage from an image file and
 *  using MediaTracker to wait until an image or several images
 *  are done loading.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class ImageUtilities {
  
  /** Create Image from a file, then turn that into a
   *  BufferedImage.
   */

  public static BufferedImage getBufferedImage(String imageFile,
                                               Component c) {
    Image image = c.getToolkit().getImage(imageFile);
    waitForImage(image, c);

    BufferedImage bufferedImage =
      new BufferedImage(image.getWidth(c), image.getHeight(c),
                        BufferedImage.TYPE_INT_RGB);
    Graphics2D g2d = bufferedImage.createGraphics();
    g2d.drawImage(image, 0, 0, c);
    return(bufferedImage);
  }

  /** Take an Image associated with a file, and wait until it is
   *  done loading (just a simple application of MediaTracker).
   *  If you are loading multiple images, don't use this
   *  consecutive times; instead, use the version that takes
   *  an array of images.
   */

  public static boolean waitForImage(Image image, Component c) {
    MediaTracker tracker = new MediaTracker(c);
    tracker.addImage(image, 0);
    try {
      tracker.waitForAll();
    } catch(InterruptedException ie) {}
    return(!tracker.isErrorAny());
  }

  /** Take some Images associated with files, and wait until they
   *  are done loading (just a simple application of
   *  MediaTracker).
   */

  public static boolean waitForImages(Image[] images, Component c)   {
    MediaTracker tracker = new MediaTracker(c);
    for(int i=0; i<images.length; i++)
      tracker.addImage(images[i], 0);
    try {
      tracker.waitForAll();
    } catch(InterruptedException ie) {}
    return(!tracker.isErrorAny());
  }
}