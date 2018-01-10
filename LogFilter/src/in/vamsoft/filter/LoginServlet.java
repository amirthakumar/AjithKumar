package in.vamsoft.filter;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	  HttpSession session=request.getSession();
	  String name=request.getParameter("uname");
	  String password=request.getParameter("pwd");
	  if(name.equals("Ajith")&&password.equals("password"))
	  {
	    session.setAttribute("name", name);
	    session.setAttribute("password", password);
	    RequestDispatcher rd=request.getRequestDispatcher("Servlet1");
	    rd.forward(request,response);
	    
	  }
	  else
	  {
	    response.getWriter().println("Please Check The User Name and Password");
	  }
	      
	}

}
