import java.awt.*;
import java.awt.event.*;

public class ColorFrame2 extends Frame
                         implements ActionListener {
  private TextField colorField;
  private ColorMap colorMap = new ColorMap();

  public ColorFrame2() {
    super("Choose a Color");
    Label prompt = new Label("Enter color:");
    add(prompt);
    colorField = new TextField(15);
    add(colorField);
    Button colorButton = new Button("Set Background");
    colorButton.addActionListener(this);
    add(colorButton);
    setLayout(new FlowLayout());
    pack();
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String colorString = colorField.getText();
    Color bgColor = colorMap.getColor(colorString);
    setBackground(bgColor);
  }

  public static void main(String[] args) {
    new ColorFrame2();
  }
}