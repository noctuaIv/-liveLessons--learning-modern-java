import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ThreeButtons extends Applet
                          implements ActionListener {
  private Button b1, b2, b3;

  @Override
  public void init() {
    b1 = new Button("Red");
    b2 = new Button("Green");
    b3 = new Button("Blue");
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    add(b1);
    add(b2);
    add(b3);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
      setBackground(Color.RED);
    } else if (e.getSource() == b2) {
      setBackground(Color.GREEN);
    } else {
      setBackground(Color.BLUE);
    }
  }
}