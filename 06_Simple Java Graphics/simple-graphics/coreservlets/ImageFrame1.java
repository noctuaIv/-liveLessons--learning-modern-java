package coreservlets;

import javax.swing.*;

public class ImageFrame1 extends JFrame {
  public ImageFrame1(String relativePath) {
    super("Image Drawing");
    setContentPane(new ImagePanel1(relativePath));
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new ImageFrame1("images/Java-Man.gif");
  }
}
