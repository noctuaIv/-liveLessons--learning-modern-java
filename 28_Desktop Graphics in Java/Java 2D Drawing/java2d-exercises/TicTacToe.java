import java.applet.Applet;
import java.awt.*;

public class TicTacToe extends Applet {
  @Override
  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D)g;
    g2d.setStroke(new BasicStroke(10));
    g2d.drawLine(100, 0, 100, 300);
    g2d.drawLine(200, 0, 200, 300);
    g2d.drawLine(0, 100, 300, 100);
    g2d.drawLine(0, 200, 300, 200);
  }
}