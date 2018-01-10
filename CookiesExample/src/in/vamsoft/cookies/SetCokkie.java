package in.vamsoft.cookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCokkie
 */
@WebServlet("/SetCokkie")
public class SetCokkie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	  String name=request.getParameter("uname");
	  String pwd=request.getParameter("pwd");
	  Cookie c1=new Cookie("Name", name);
	  Cookie c2=new Cookie("Password", pwd);
	  response.addCookie(c1);
	  response.addCookie(c2);
	  response.getWriter().println("Cookies set Successfully");
	}

}
