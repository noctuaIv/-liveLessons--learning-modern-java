package coreservlets;

import java.io.PrintWriter;
import java.sql.*;

/** Second of three versions of servlets that print out the employees table.
 *  This one uses meta data to get column names and database info.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, 
 *  Spring, Hibernate/JPA, and Java programming</a>.
 */

public class EmployeeServlet2 extends EmployeeServlet1 {
  @Override
  protected void printTableTop(Connection connection,
                               ResultSet resultSet, 
                               PrintWriter out) 
      throws SQLException {
    // Look up info about the database as a whole.
    DatabaseMetaData dbMetaData = connection.getMetaData();
    String productName =
      dbMetaData.getDatabaseProductName();
    String productVersion =
      dbMetaData.getDatabaseProductVersion();
    out.println("<UL>\n" +
               "  <LI><B>Database:</B>\n" + productName +
               "  <LI><B>Version:</B>\n" + productVersion +
               "</UL>");
    out.println("<TABLE BORDER='1'>");
    // Discover and print headings
    ResultSetMetaData resultSetMetaData =
      resultSet.getMetaData();
    int columnCount = resultSetMetaData.getColumnCount();
    out.println("<TR>");
    // Column index starts at 1 (a la SQL), not 0 (a la Java).
    for(int i=1; i <= columnCount; i++) {
      out.printf("<TH>%s", resultSetMetaData.getColumnName(i));
    }
    out.println();
  } 
}
