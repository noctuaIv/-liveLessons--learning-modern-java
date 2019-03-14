package coreservlets;

import java.sql.*;
import javax.naming.*;
import javax.sql.*;

/** First of three versions of servlets that print out the employees table.
 *  This one uses JNDI to get the connection. Requires separate
 *  installation of shared Derby JARs and start of Derby network server
 *  and creation of database. Definitely not worth the trouble for single 
 *  Web apps, but sometimes better in real life for large apps.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, 
 *  Spring, Hibernate/JPA, and Java programming</a>.
 */

public class EmployeeServlet3 extends EmployeeServlet2 {
  protected Connection getConnection() 
      throws Exception {
    Context context = new InitialContext();
    String jndiRef = "java:comp/env/jdbc/" + dbName;
    DataSource dataSource = (DataSource)context.lookup(jndiRef);
    Connection connection = dataSource.getConnection();
    return(connection);
  }
}
