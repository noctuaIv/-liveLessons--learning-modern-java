package coreservlets;

import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

/** First of three versions of servlets that print out the employees table.
 *  This one has column names and database info hardcoded.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, 
 *  Spring, Hibernate/JPA, and Java programming</a>.
 */

public class EmployeeServlet1 extends HttpServlet {
  //private final String driver = 
  //   "org.apache.derby.jdbc.EmbeddedDriver";
  protected final String dbName = "myDatabase";
  protected final String url = "jdbc:derby:" + dbName;
  protected final String tableName = "employees";
  protected final String username = "someuser";
  protected final String password = "somepassword";
  
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String docType =
      "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
      "Transitional//EN\"\n";
    String title = "Company Employees";
    out.print(docType +
        "<HTML>\n" +
        "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
        "<LINK REL='STYLESHEET' HREF='./css/styles.css'\n" + 
        "      TYPE='text/css'>" +
        "<BODY><CENTER>\n" +
        "<TABLE CLASS='TITLE' BORDER='5'>" +
        "  <TR><TH>" + title + "</TABLE><P>");
    showTable(out);
    out.println("</CENTER></BODY></HTML>");
  }

  protected void showTable(PrintWriter out) {
    try {
      // Get connection from method (to support overriding
      // later to use DataSource)
      Connection connection = getConnection();
      // Create blank Statement
      Statement statement = connection.createStatement();
      // Send query to database and store results.
      String query = "SELECT * FROM " + tableName;
      ResultSet resultSet = statement.executeQuery(query);
      // Print table of results.
      printTableTop(connection, resultSet, out);
      printTableBody(resultSet, out);
      // Close the connection. In high-traffic servlet, be sure
      // Driver supports connection pooling.
      connection.close();
    } catch(Exception e) {
      System.err.println("Error: " + e);
    }
  }
  
  protected Connection getConnection() 
      throws Exception {
    // Load database driver if it's not already loaded.
    // Not needed in JDBC 4 (Java SE 6). Uncomment for earlier versions.
    // Class.forName(driver);
    
    // Establish network connection to database.
    Properties userInfo = new Properties();
    userInfo.put("user", username);
    userInfo.put("password", password);
    Connection connection =
      DriverManager.getConnection(url, userInfo);
    return(connection);
  }
  
  protected void printTableTop(Connection connection,
                               ResultSet resultSet,
                               PrintWriter out) 
      throws SQLException {
    out.println("<TABLE BORDER='1'>");
    // Print headings from explicit heading names
    String[] headingNames = 
      { "ID", "First Name", "Last Name", 
        "Position", "Salary" };
    out.print("<TR>");
    for (String headingName : headingNames) {
      out.printf("<TH>%s", headingName);
    }
    out.println();
  }
  
  protected void printTableBody(ResultSet resultSet,
                                PrintWriter out) 
      throws SQLException {
    // Step through each row in the result set and print cells
    while(resultSet.next()) {
      out.println("<TR ALIGN='RIGHT'>");
      out.printf("  <TD>%d", resultSet.getInt("id"));
      out.printf("  <TD>%s", resultSet.getString("firstname"));
      out.printf("  <TD>%s", resultSet.getString("lastname"));
      out.printf("  <TD>%s", resultSet.getString("position"));
      out.printf("  <TD>$%,d%n", resultSet.getInt("salary"));
    }
    out.println("</TABLE>");
  }
}

