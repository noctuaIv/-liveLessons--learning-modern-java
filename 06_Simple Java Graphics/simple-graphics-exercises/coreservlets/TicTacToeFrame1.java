package coreservlets;

import javax.swing.*;

/** Simplistic version of a TTT board where the JPanel assumes it knows
 *  the size of the JFrame ahead of time.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class TicTacToeFrame1 extends JFrame {
  public TicTacToeFrame1() {
    super("Tic-Tac-Toe");
    setContentPane(new TicTacToePanel1());
    setSize(320, 340);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new TicTacToeFrame1();
  }
}
