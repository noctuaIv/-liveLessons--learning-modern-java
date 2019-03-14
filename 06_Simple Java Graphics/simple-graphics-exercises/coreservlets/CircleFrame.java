package coreservlets;

import java.awt.*;

import javax.swing.*;

public class CircleFrame extends JFrame {
  public CircleFrame() {
    super("Drawing Shapes");
    setContentPane(new CirclePanel(Color.RED));
    setSize(600, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new CircleFrame();
  }
}
