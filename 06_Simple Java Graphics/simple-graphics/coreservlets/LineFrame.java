package coreservlets;

import javax.swing.*;

public class LineFrame extends JFrame {
  public LineFrame() {
    super("Line Drawing");
    setContentPane(new LinePanel());
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new LineFrame();
  }
}
