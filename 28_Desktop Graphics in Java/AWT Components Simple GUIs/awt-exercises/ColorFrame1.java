import java.awt.*;

public class ColorFrame1 extends Frame {
  public ColorFrame1() {
    super("Some Canvases");
    ColorChangingCanvas c1 =
      new ColorChangingCanvas(80, 60);
    ColorChangingCanvas c2 =
      new ColorChangingCanvas(100, 80);
    ColorChangingCanvas c3 =
      new ColorChangingCanvas(120, 100);
    add(c1);
    add(c2);
    add(c3);
    setLayout(new FlowLayout());
    pack();
    setVisible(true);
  }

  public static void main(String[] args) {
    new ColorFrame1();
  }
}