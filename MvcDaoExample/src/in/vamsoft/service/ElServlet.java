package in.vamsoft.service;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ElServlet
 */
@WebServlet("/ElServlet")
public class ElServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

 	  Address add=new Address();
 	  add.setHouseNo("2A");
 	  add.setCity("Chennai");
 	  
 	  EmployeeEl e1=new EmployeeEl(1, "Ajith", 100000, LocalDate.now() , 1  , add);
 	  EmployeeEl emp=new EmployeeEl(2, "Kumar", 20000, LocalDate.now(), 30, add);
 	  
 	  
 	  request.setAttribute("Employee", e1);
 	  
 	  HttpSession session=request.getSession();
 	  session.setAttribute("Employee1", emp);
 	  
 	  
 	  response.addCookie(new Cookie("User.cookie", "Vamsoft"));
 	  
 	  
 	  ServletContext contex=getServletContext();
 	  contex.setAttribute("User.cookie", "Wipro");
 	  
 	  
 	  RequestDispatcher rd=contex.getRequestDispatcher("/Home.jsp");
 	  rd.forward(request, response);
 	  
 	  
 	  
 	  
 	  
 	  
 	  
 	  
 	  
 	  
 	  
 	  
 	  
 	  
 	  
 	  
 	  
 	  
 	  
 	  
 	  
 	  
 	  
	}

	

}
