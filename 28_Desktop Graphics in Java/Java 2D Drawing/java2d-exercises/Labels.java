import java.awt.*;
import javax.swing.*;

public class Labels {
  public static void main(String[] args) {
    Frame f = new CloseableFrame("Some Labels");
    String[] myFontNames =
      { "Andy", "Bradley Hand ITC", "Chiller", "Curlz MT",
        "Elephant", "Enviro", "Forte", "Freestyle Script",
        "Impact", "Jokerman", "Magneto", "Matisse ITC",
        "Papyrus", "Playbill", "Ravic", "Stencil" };
    f.setLayout(new FlowLayout());
    for(String fontName: myFontNames) {
      JLabel label = new JLabel(fontName);
      int size = 40 + (int)(Math.random()*40.0);
      label.setFont(new Font(fontName, Font.PLAIN, size));
      Color c = new Color(randomColorValue(),
                          randomColorValue(),
                          randomColorValue());
      label.setForeground(c);
      f.add(label);
    }
    f.setSize(900, 600);
    f.setVisible(true);
  }

  public static int randomColorValue() {
    return((int)(Math.random() * 255));
  }
}