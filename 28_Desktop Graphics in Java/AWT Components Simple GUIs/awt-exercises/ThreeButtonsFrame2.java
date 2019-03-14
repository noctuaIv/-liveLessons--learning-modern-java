import java.awt.*;
import java.awt.event.*;

/** Version 2: uses inner classes. See ThreeButtonsFrame1 for alternative that 
 *  uses interfaces.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class ThreeButtonsFrame2 extends Frame {
  private Button b1, b2, b3;

  public ThreeButtonsFrame2() {
    super("Three Buttons");
    b1 = new Button("Red");
    b2 = new Button("Green");
    b3 = new Button("Blue");
    b1.addActionListener(new ColorChanger(Color.RED));
    b2.addActionListener(new ColorChanger(Color.GREEN));
    b3.addActionListener(new ColorChanger(Color.BLUE));
    add(b1);
    add(b2);
    add(b3);
    setLayout(new FlowLayout());
    //setSize(400, 200);
    pack();
    setVisible(true);
  }

  private class ColorChanger implements ActionListener {
    private Color colorToShow;
    
    public ColorChanger(Color colorToShow) {
      this.colorToShow = colorToShow;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
      setBackground(colorToShow);      
    }
  }

  public static void main(String[] args) {
    new ThreeButtonsFrame2();
  }
}