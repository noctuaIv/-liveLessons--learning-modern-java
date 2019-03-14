package coreservlets;

import java.awt.*;

import javax.swing.*;

public class CirclePanel extends JPanel {
  private int diameter = 20; 
  
  public CirclePanel(Color bgColor) {
    setBackground(bgColor);
  }
  
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    int maxX = getWidth() - diameter;
    int maxY = getHeight() - diameter;
    g.setColor(Color.YELLOW);
    for(int i=0; i<50; i++) {
      int x = (int)(Math.random()*maxX);
      int y = (int)(Math.random()*maxY);
      g.fillOval(x, y, diameter, diameter);
    }
  }
}
