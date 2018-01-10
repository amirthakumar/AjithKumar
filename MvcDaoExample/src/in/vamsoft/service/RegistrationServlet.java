package in.vamsoft.service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.vamsoft.daoimplfactory.EmployeeDaoImplFactory;
import in.vamsoft.employeeDaoImpl.EmployeeDaoImpl;
import in.vamsoft.model.Employee;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String empId = request.getParameter("empid");
    String name = request.getParameter("name");
    String salary = request.getParameter("sal");
    String doj = request.getParameter("doj");
    String deptId = request.getParameter("deptid");
    Employee emp=new Employee(Integer.parseInt(empId), name, Double.parseDouble(salary),
        LocalDate.parse(doj, DateTimeFormatter.ofPattern("dd-MM-yyyy")), Integer.parseInt(deptId));

    EmployeeDaoImpl dao=EmployeeDaoImplFactory.getInstance();
    int n=dao.addEmployee(emp);
    if(n>0)
    {
      response.getWriter().println("New Employee Added Successfully");
    }
    else
    {
      response.getWriter().println("The Employee details are not Updated");
      RequestDispatcher rd=request.getRequestDispatcher("AddEmployee.html");
      rd.include(request, response);
    }
  }

}
