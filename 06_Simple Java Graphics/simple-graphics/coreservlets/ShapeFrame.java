package coreservlets;

import java.awt.*;

import javax.swing.*;

public class ShapeFrame extends JFrame {
  public ShapeFrame() {
    super("Drawing Shapes");
    setContentPane(new ShapePanel(Color.YELLOW));
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new ShapeFrame();
  }
}
