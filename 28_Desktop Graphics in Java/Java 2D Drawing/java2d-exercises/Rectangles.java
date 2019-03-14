import java.awt.*;
import java.awt.geom.*;

public class Rectangles extends CloseableFrame {
  private int width = 900, height = 600;

  public Rectangles() {
    super("Rectangles and Transparency");
    setBackground(Color.red);
    setForeground(Color.blue);
    setSize(width, height);
    setVisible(true);
  }

  @Override
  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D)g;
    for(int i=0; i<100; i++) {
      g2d.setComposite(makeComposite((float)Math.random()));
      Rectangle2D.Double rect =
        new Rectangle2D.Double(Math.random()*width,
                               Math.random()*height,
                               50, 50);
      g2d.fill(rect);
    }
  }

  private AlphaComposite makeComposite(float alpha) {
    int type = AlphaComposite.SRC_OVER;
    return(AlphaComposite.getInstance(type, alpha));
  }

  public static void main(String[] args) {
    new Rectangles();
  }
}