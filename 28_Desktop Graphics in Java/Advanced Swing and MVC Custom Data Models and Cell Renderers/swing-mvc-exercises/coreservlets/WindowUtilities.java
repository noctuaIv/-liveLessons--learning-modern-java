package coreservlets;

import javax.swing.*;
import javax.swing.UIManager.*;

/** A few utilities that simplify using windows in Swing. 
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class WindowUtilities {

  /** Tell system to use native look and feel, as in previous
   *  releases. Metal (Java) LAF is the default otherwise.
   */

  public static void setNativeLookAndFeel() {
    try {
     UIManager.setLookAndFeel(
       UIManager.getSystemLookAndFeelClassName());
    } catch(Exception e) {
      System.out.println("Error setting native LAF: " + e);
    }
  }

  public static void setJavaLookAndFeel() {
    try {
     UIManager.setLookAndFeel(
       UIManager.getCrossPlatformLookAndFeelClassName());
    } catch(Exception e) {
      System.out.println("Error setting Java LAF: " + e);
    }
  }

  public static void setNimbusLookAndFeel() {
    try {
      LookAndFeelInfo[] lafs =
        UIManager.getInstalledLookAndFeels();
      for (LookAndFeelInfo laf: lafs) {
        if ("Nimbus".equals(laf.getName())) {
          UIManager.setLookAndFeel(laf.getClassName());
        }
      } 
    } catch(Exception e) {
      System.out.println("Error setting Nimbus LAF: " + e);
    }
  }
  
  public static void setMotifLookAndFeel() {
    try {
      UIManager.setLookAndFeel(
        "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
    } catch(Exception e) {
      System.out.println("Error setting Motif LAF: " + e);
    }
  }
}