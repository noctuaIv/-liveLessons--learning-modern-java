package coreservlets;

import javax.swing.*;

public class ImageFrame2 extends JFrame {
  public ImageFrame2(String urlString) {
    super("Image Drawing");
    setContentPane(new ImagePanel2(urlString));
    setSize(560, 420);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new ImageFrame2("http://www.coreservlets.com/images/" +
                    "marty-hall-java-license-plate.jpg");
  }
}
