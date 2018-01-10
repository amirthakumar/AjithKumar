package in.vamsoft.validate;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

	  String name=request.getParameter("name");
	  String pwd=request.getParameter("pwd");
	  if(name.equalsIgnoreCase("Ajith"))
	  {
	    response.sendRedirect("Welcome.html");
	  }
	  else
	  {
	    RequestDispatcher rd=request.getRequestDispatcher("ErrorServlet");
	    rd.forward(request, response);
	  }
	  
	  
	}

}
