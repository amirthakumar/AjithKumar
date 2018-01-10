package in.vamsoft.salary;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorServlet
 */
@WebServlet("/ErrorServlet")
public class ErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  PrintWriter out=response.getWriter();
	  DateTimeParseException e=(DateTimeParseException) request.getAttribute("Error");
	  out.println(e.getMessage());
	  
	}

}
