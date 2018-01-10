package in.vamsoft.connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class ConnectionPoolDemo used for get all city
 * information from the Database.
 */
public class CityInfoServlet extends HttpServlet {

  DataSource dataSource;
  private static final long serialVersionUID = 1L;

  public void init(ServletConfig config) throws ServletException {

    System.out.println("Init Method is Called");
    try {
      Context initContext = new InitialContext();
      Context envContext = (Context) initContext.lookup("java:/comp/env");
      dataSource = (DataSource) envContext.lookup("jdbc/hr");

    } catch (NamingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub

    PrintWriter out = response.getWriter();
    try {

      System.out.println("Service Method called");
      Connection con = dataSource.getConnection();
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("Select * from empcopy");

      while (rs.next()) {
        out.println(rs.getString(2));
      }
    
      System.out.println("City Information Displayed Successfully");

    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}
