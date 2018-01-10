package in.vamsoft.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.vamsoft.daoimplfactory.EmployeeDaoImplFactory;
import in.vamsoft.employeeDaoImpl.EmployeeDaoImpl;

/**
 * Servlet implementation class DeleteEmployee
 */
@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
	  
	  doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	  int empId=Integer.parseInt(request.getParameter("empid"));
	  EmployeeDaoImpl dao=EmployeeDaoImplFactory.getInstance();
    int n=dao.deleteEmployee(empId);
    if(n>0)
    {
      response.getWriter().println("Employee Details Deleted Successfull");
    }
    else
    {
      response.getWriter().println("Employee Details are Not Deleted");

    }
	  
	}

}
