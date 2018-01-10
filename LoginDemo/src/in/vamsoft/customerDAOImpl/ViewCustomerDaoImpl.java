package in.vamsoft.customerDAOImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.vamsoft.register.DbConnection;

@WebServlet("/ViewCustomerDaoImpl")
public class ViewCustomerDaoImpl extends HttpServlet {
  private static final long serialVersionUID = 1L;

  Connection con;

  @Override
  public void init() throws ServletException {

    con = DbConnection.getConnection();

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    PrintWriter out = response.getWriter();
    try (PreparedStatement prepare = con.prepareStatement("select * from customerservlet1 where name=?");) {

      String name = request.getParameter("viewcustomer");
      prepare.setString(1, name);
      ResultSet rs = prepare.executeQuery();
      while (rs.next()) {
        out.println("<html><body>");
        out.println("<h3> Customer Details<h3>");
        out.println(
            "<table><tr><th>Customer Name</th><th>Join date</th><th>Address</th><th>Phone Number</th><th>Gender</th><th>Hobbies</th><td></tr>"
                + "<tr><td>" + rs.getString(1) + "</td>");
        out.println("<td>" + rs.getDate(2) + "</td>");
        out.println("<td>" + rs.getString(3) + "</td>" + "<td>" + rs.getInt(4) + "</td><td>" + rs.getString(5)
            + "</td><td>" + rs.getString(6) + "</td></tr></table>");

      }

    } catch (SQLException e) {

      System.err.println("Prepare StateMent is not secured");

    }

  }

}
