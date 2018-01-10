package in.vamsoft.salary;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PaySlipServlet")

public class PaySlipServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  protected void doPost(HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException {

    String name = request.getParameter("empname");
    String dateOfJoin = request.getParameter("doj");
    String mobNum = request.getParameter("phnum");
    double salary = (double) request.getAttribute("salary");
    double newSalary = (salary * 0.1 + salary * 0.1) - salary * 0.12;
    double newSalary1 = salary + newSalary;
    PrintWriter out = response.getWriter();
    out.println("Name : " + name);
    out.println("Date Of Join : " + dateOfJoin);
    out.println("Phone Number : " + mobNum);
    out.println("salary : " + newSalary1);

  }

}
