package in.vamsoft.customerDAOImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import in.vamsoft.register.DbConnection;


/**
 * Servlet implementation class RegistrationDaoImpl
 */
@WebServlet("/RegistrationDaoImpl")
public class RegistrationDaoImpl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 Connection con;

	  public void init(ServletConfig config) throws ServletException {
	    con = DbConnection.getConnection();
	  }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  PrintWriter out=response.getWriter();
	  try {

      PreparedStatement prepare = con.prepareStatement("insert into customerservlet1 values(?,?,?,?,?,?)");
      String name=(String)request.getAttribute("name");
      String dob=(String)request.getAttribute("dob");
      String address=(String)request.getAttribute("address");
      String phoneNumber=(String)request.getAttribute("phoneNumber");
      String gender=(String)request.getAttribute("gender");
      String hobbiesList=(String)request.getAttribute("hobbiesList");
      prepare.setString(1, name);
      out.print("name line Executed");
      prepare.setDate(2, Date.valueOf(LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"))));
      out.println("Date Line Executed");
      prepare.setString(3, address);
      prepare.setInt(4, Integer.parseInt(phoneNumber));
      prepare.setString(5, gender);
      prepare.setString(6, hobbiesList);
      prepare.executeUpdate();
      out.println("The Values Inserted Successfully");

    } catch (SQLException e) {

      out.println("The Values Are Not updated into the database");

    }
	  
	}
	

}
