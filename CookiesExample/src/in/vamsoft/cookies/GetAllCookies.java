package in.vamsoft.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetAllCookies
 */
@WebServlet("/GetAllCookies")
public class GetAllCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  PrintWriter out=response.getWriter();
	  Cookie[] allCookie= request.getCookies();
	  for(Cookie c:allCookie)
	  {
	    out.println(c.getName());
	  }
	  
	  
	}

}
