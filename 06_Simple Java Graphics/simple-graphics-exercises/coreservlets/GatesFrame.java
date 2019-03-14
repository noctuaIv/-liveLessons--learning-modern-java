package coreservlets;

import javax.swing.*;

public class GatesFrame extends JFrame {
  public GatesFrame(String relativePath) {
    super("Bill Gates");
    setContentPane(new GatesPanel(relativePath));
    setSize(617, 488);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new GatesFrame("images/gates-blue-screen.jpg");
  }
}
