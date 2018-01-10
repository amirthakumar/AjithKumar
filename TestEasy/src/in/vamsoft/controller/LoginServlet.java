package in.vamsoft.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.vamsoft.daofactory.StudentDaoUtilFactory;
import in.vamsoft.testutil.StudentDaoUtil;

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
		
	  String name=request.getParameter("name");
	  String password=request.getParameter("pwd");
	  StudentDaoUtil obj=StudentDaoUtilFactory.createInstance();
	  int check=obj.checkLogin(name, password);
	  if(check==0)
	  {
	    response.getWriter().println("Hello " + name);
	    RequestDispatcher rd =request.getRequestDispatcher("Home.jsp");
	    rd.forward(request, response);
	  }
	  else
	  {
	    response.getWriter().println("Sorry !! your User Id And Password is Not Correct ");
	    response.sendRedirect("Login.html");
	  }
	  
	  
	  
	}

}
