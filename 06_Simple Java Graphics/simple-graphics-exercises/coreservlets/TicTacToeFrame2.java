package coreservlets;

import javax.swing.*;

/** Slightly better version of a TTT board where the JPanel does not have to know
 *  the size of the JFrame ahead of time.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class TicTacToeFrame2 extends JFrame {
  public TicTacToeFrame2() {
    super("Tic-Tac-Toe");
    setContentPane(new TicTacToePanel2());
    setSize(620, 640);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new TicTacToeFrame2();
  }
}
