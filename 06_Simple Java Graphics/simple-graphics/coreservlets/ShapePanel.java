package coreservlets;

import java.awt.*;

import javax.swing.*;

public class ShapePanel extends JPanel {
  public ShapePanel(Color bgColor) {
    setBackground(bgColor);
  }
  
  @Override
  // Try the following line with and without @Override
  // public void paintcomponent(Graphics g) {
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.RED);
    g.fillOval(75, 75, 100, 100);
    g.setColor(Color.BLUE);
    g.fillRect(200, 200, 100, 100);
  }
}
