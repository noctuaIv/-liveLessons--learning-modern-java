import java.applet.Applet;
import java.awt.*;

public class TicTacToe2 extends Applet {
  @Override
  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D)g;
    float[] dashPattern = { 10, 5 };
    g2d.setStroke(new BasicStroke(10, BasicStroke.CAP_BUTT,
                                  BasicStroke.JOIN_MITER, 10,
                                  dashPattern, 0));
    g2d.drawLine(100, 0, 100, 300);
    g2d.drawLine(200, 0, 200, 300);
    g2d.drawLine(0, 100, 300, 100);
    g2d.drawLine(0, 200, 300, 200);
  }
}