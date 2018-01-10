package in.vamsoft.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  PrintWriter out=response.getWriter();
	  response.setContentType("text/html");
	  out.println("<html> <body bgcolor=lightblue> ");
	  out.println("<h1> Hello ! Welcome Ajith </h1>");
	  out.println("</body></html>");
	  
	  
	}

}
