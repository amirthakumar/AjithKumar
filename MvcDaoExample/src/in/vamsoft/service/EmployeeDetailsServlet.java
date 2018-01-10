package in.vamsoft.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.vamsoft.model.Employee;

/**
 * Servlet implementation class EmployeeDetails
 */
@WebServlet("/EmployeeDetails")
public class EmployeeDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  int depId=Integer.parseInt(request.getParameter("id"));
	  EmployeeDetailsService detail=new EmployeeDetailsService();
	  List<Employee> emp=detail.getEmployee(depId);
	  HttpSession session=request.getSession();
	  session.setAttribute("EmployeeDetail", emp);
	  RequestDispatcher rd=request.getRequestDispatcher("ShowDetails.jsp");
	  rd.forward(request, response);
	}

}
